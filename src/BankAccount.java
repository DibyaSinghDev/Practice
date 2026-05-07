public class BankAccount {
    private int balance=10000;

    synchronized void withdraw(int amount){
        System.out.println(Thread.currentThread().getName()+"want to withdraw from:"+amount);
        while(balance<amount){
            System.out.println("Insufficient Balance wait for deposite.....!");
            try{
                wait();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        balance=balance-amount;
        System.out.println("Balance after withdrawal:"+balance);
    }
    void deposite(int amount){
        synchronized (this){
            System.out.println(Thread.currentThread().getName()+"want to deposite in:"+amount);
            balance=balance+amount;
            System.out.println("Balance after the deposite :"+balance);
//            notifyAll();
        }
    }
}
