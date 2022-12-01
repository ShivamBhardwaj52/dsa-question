import java.util.Scanner;
class Account{
    private int bal;
    public Account(int bal){
        this.bal=bal;
    }
    public boolean isSufficentBalence(int w){
        if(bal>w)
        return(true);
        else
        return(false);
    }
    public void Withdraw(int amt){
        bal=bal-amt;
        System.out.println("withdraw Amount is"+amt);
        System.out.println("your current balence is"+bal);
    }
}
class Customer implements Runnable
{
private String name;
private Account account;
public Customer(Account account,String n){
    this.account=account;
    name=n;
}
public void run(){
    Scanner kb =new Scanner(System.in);
    synchronized(account){
    System.out.println(name+"Enter amount to withdraw");
    int amt=kb.nextInt();
    if(account.isSufficentBalence(amt)){
        System.out.println(name);
        account.Withdraw(amt);
    }
    else
    System.out.println("Insufficient Balance");
}
}
}
public class ThreadExample {
    public static void main(String[] args) {
        Account a1=new Account(1000);
        Customer c1=new Customer(a1,"Shivam"),c2=new Customer(a1,"Shubham");
    Thread t1= new Thread(c1);
    Thread t2= new Thread(c2);
    t1.start();
    t2.start();
    }
}
