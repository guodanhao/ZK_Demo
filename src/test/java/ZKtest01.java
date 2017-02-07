import java.util.concurrent.CyclicBarrier;

/**
 * Created by muxi on 2016/9/14.
 */
public class ZKtest01 {

    public static void main(String[] args) {

        final TestLock testLock = new TestLock();


        Thread threadA = new Thread(new Runnable() {
            public void run() {
                try {
                    testLock.methodB();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread threadB = new Thread(new Runnable() {
            public void run() {
                try {
                    testLock.methodB();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        threadB.start();

        threadA.start();

    }
}


class TestLock{

    public void methodA() throws InterruptedException {
        System.out.println("start:");
        Thread.sleep(5000);
        System.out.println(":end");
    }


    public void methodB() throws InterruptedException {
//        Thread.yield();
        synchronized (this) {
            Thread.sleep(5000);
            System.out.println("lock all class");

        }
    }
}
