import java.util.*;
class Account
{
    int balance;
    Account(int balance)
    {
        this.balance=balance;
    }
    boolean sufficientBalance(int amt)
    {
        if(balance>amt)
        return true;
        return false;
    }
    void withdraw(int amt)
    {
        balance=balance-amt;
        System.out.println("Withdarwn Amount= "+amt+ " And Current balance ="+balance);
    }
}
class Customer implements Runnable
{
    Account acc;
    String s;
    Customer(Account acc,String s)
    {
        this.acc=acc;
        this.s=s;
    }
    public void run()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println(s+" Enter The Amount to be withdarwn  ");
        int amt=sc.nextInt();
		synchronized(acc)
		{
			if(acc.sufficientBalance(amt))
			{
				System.out.println(s);
				acc.withdraw(amt);
            }
			else
				System.out.println("Insufficient balance");
		}
    }
    
}
public class SyncThread
{
    public static void main(String arg[])
    {
        Account a1=new Account(1000);
        Customer c1=new Customer(a1,"Abhee");
        Customer c2=new Customer(a1,"Abheesht");
        Thread t1=new Thread(c1);
        Thread t2=new Thread(c2);
        t1.start();
        t2.start();
    }
}
