package multithreading;

import java.util.Scanner;

public class TCF {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);

       /* boolean z = true;

        while (z) {
            System.out.println("Value of A: ");
            int A = sc.nextInt();
            System.out.println("Value of B: ");
            int B = sc.nextInt();

            try {
                int x = A/B;
                System.out.println(x);
                z=false;
            }
            catch (ArithmeticException ae) {
                System.out.println(ae.getMessage());
                Thread.sleep(3000);
                z=true;
            }
            finally {
                System.out.println("Yeh toh print hoga hi");
            }

        } */
        System.out.print("Enter your age: ");
        int age  = sc.nextInt();
        if (age < 18) {
            throw new RuntimeException("You cant vote!!!!!!!!!");
        }else {
            System.out.println("You can vote!!!!!!!!!!!!!");
        }
    }
}
