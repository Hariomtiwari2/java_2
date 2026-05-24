package ATM_PROJECT;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        ATM atm = new ATM();
        atm.checkPin();

    }
}

class ATM {

    Scanner sc = new Scanner(System.in);

    private double balance = 0;
    private final int  pin  = 212;

    public void checkPin(){
        System.out.println("Enter your pin");
        int userPin = sc.nextInt();
        if (userPin == pin){
            menu();
        }else{
            System.out.println("Enter correct pin!!!");
        }
    }


    private void menu() {

        System.out.println("Select the option");
        System.out.println("1: deposite");
        System.out.println("2: withdraw");
        System.out.println("3: check");
        System.out.println("4: exit");

        boolean running = true;
        while (running){
            System.out.print("Option: ");
            int val = sc.nextInt();
            switch (val){

                case 1:
                    deposit();
                   // menu();
                    break;

                case 2:
                    withdraw();
                  //  menu();
                    break;

                case 3:
                    checkBal();
                    // menu();
                    break;

                case 4:
                    running = false;
                    exit();
                    break;

                default:
                    System.out.println("invalid option " +
                            "choose corret");
            }


        }
        }




    private void withdraw() { // method to withdraw

        System.out.println("Enter amount to withdraw: ");
        double amnt = sc.nextDouble();
        if (amnt > balance){
            System.out.println("Insufficient balance!!");
        }else{
            System.out.println("amnt withdrawn");
            balance = balance - amnt;
            System.out.println("current balance: "+ balance);
        }

    }

    private void deposit() { // method to deposit money
        System.out.println("Enter amount to deposited");
        double dipo = sc.nextDouble();
        balance = balance + dipo;
        System.out.println("Cuurent balanace: "+ balance);

    }

    private void checkBal() { // method to check balance

        System.out.println("current balance: "+ balance);
    }

    private void exit() { // for exiting

        return ;
    }



}
