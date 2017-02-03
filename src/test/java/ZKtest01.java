import java.util.concurrent.CyclicBarrier;

/**
 * Created by muxi on 2016/9/14.
 */
public class ZKtest01 {

    public static void main(String[] args) {
        System.out.println("guodanhao".hashCode());

        int READ = 1 << 0;

        int WRITE = 1 << 1;

        int CREATE = 1 << 2;

        int DELETE = 1 << 3;

        int ADMIN = 1 << 4;

        int ALL = READ | WRITE | CREATE | DELETE | ADMIN;

        System.out.println(READ);
        System.out.println(WRITE);
        System.out.println(READ | WRITE);
        System.out.println(ALL);
    }
}
