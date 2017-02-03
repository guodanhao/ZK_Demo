package watcher;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Kevin on 11/4/16.
 */
class MultiThread implements Runnable{
    private Object o1;
    private Object o2;
    private int flag;

    public MultiThread(Object o1, Object o2, int flag) {
        this.o1 = o1;
        this.o2 = o2;
        this.flag = flag;
    }

    public void task1() throws InterruptedException{
        synchronized (o1){
            synchronized (o2){
                System.out.println(Thread.currentThread().getName());
            }
        }
    }

    public void task2() throws InterruptedException{
        synchronized (o2){
            Thread.yield();
            synchronized (o1) {
                System.out.println(Thread.currentThread().getName());
            }
        }
    }


    public void run() {
        while (true) {
            try {
                if (this.flag == 1) {
                    this.task1();
                } else {
                    this.task2();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class DeadLock {

    public static void main(String[] args){

        System.out.println("start");
        Object o1 = new Object();
        Object o2 = new Object();

        ExecutorService executorService = Executors.newFixedThreadPool(10);

        for (int flag = 0; flag < 2; flag++) {
            executorService.execute(new MultiThread(o1, o2, flag));
        }
        System.out.println("end");
    }
}