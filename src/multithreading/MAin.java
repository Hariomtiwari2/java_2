package multithreading;
import java.lang.Thread;

 // java supports multithreadong through java.lang.thread class & java.lang.runnable interface
public class MAin {
    public static void main(String[] args) throws InterruptedException {

        XYZ xyz = new XYZ();
        xyz.start();


        for (int i=0;i < 3;i++) {

            System.out.println(Thread.currentThread().getName());
            Thread.sleep(1000);

        }



    }
}
