package multithreading;

public class XYZ extends Thread{

    public void abx() {
        for (int i=0; i<4;i++) {
            System.out.println("something .......");
        }
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
       abx();
    }
}
