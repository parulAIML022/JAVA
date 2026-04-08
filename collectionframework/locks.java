import java.util.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
public class locks {
    static class BankAccount{
    private int balance = 100;
    private Lock lock = new ReentrantLock();
    public void withdraw(int amount){ /*in this eg we used synchronization but thread 2 has to 
        wait even if thread 1 has finished its work earlier and so we use locks...locks will wait for 1 sec it
        will check and returns sorry will check after sometime. */
        System.out.println(Thread.currentThread().getName()+"attempting to withdraw"+amount);
        try{
            if(lock.tryLock()){
                if(balance >= amount){
                    try{
                        System.out.println(Thread.currentThread().getName()+"proceeding with withdrawl");
                        Thread.sleep(3000);
                        balance -= amount;
                        System.out.println(Thread.currentThread().getName() + "completed withdrawl");
                    }
                    catch (Exception e){

                    } 
                    finally{
                        lock.unlock();
                    }
                }
                else{
                    System.out.println(Thread.currentThread().getName()+"insufficient balance");
                }
            }
        else{
            System.out.println(Thread.currentThread().getName()+"could not acquire the lock, will try later");
        }
        } catch (Exception e){
        }
    }
}
    public static void main(String[] args) throws Exception {
        BankAccount sbi = new BankAccount();
        Runnable task = () -> sbi.withdraw(50);
        Thread t1 = new Thread(task, "Thread-1");
        Thread t2 = new Thread(task,"Thread-2");
        t1.start();
        t2.start(); 
        t1.join();
        t2.join(); 
    }
}

