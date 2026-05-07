public class Test {
    public static void main(String[]args){
        BankAccount account=new BankAccount();
        Thread t1=new Thread(()->account.withdraw(100000),"Thread-1");
        Thread t2=new Thread(()->account.deposite(100000),"Thread-2");
        t1.start();
        t2.start();
    }
}
