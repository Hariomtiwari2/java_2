package multithreading;

import java.util.Scanner;

public class TCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i=0;i<3;i++) {
        System.out.println("Value of a: ");
        int a = sc.nextInt();
        System.out.println("Value of b: ");
        int b = sc.nextInt();


        try {
            int x = a/b;
            System.out.println(x);
        }
        catch (ArithmeticException ae){
            System.out.println(ae);
        }
        finally {
            System.out.println("This is going to be printed anyway");
        } }

    }
}
