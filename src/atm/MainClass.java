package atm;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args){
        ATMOperationInterf op = new ATMOperationImpl();
        int atmpin = 123;
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to ATM Machine");
        System.out.print("Enter ATM pin : ");
        int pin = in.nextInt();
        if (atmpin == pin){
            while(true){
                System.out.println("1.View Available Balance\n2.Withdraw Amount\n3.Deposit Amount\n4.Exit");
                System.out.print("Enter your choice : ");
                int choice = in.nextInt();
                if(choice == 1){
                    op.viewBalance();
                }
                else if (choice == 2) {
                    System.out.print("Enter amount to withdraw : ");
                    double withDrawAmount = in.nextDouble();
                    op.withdrawAmount(withDrawAmount);
                }
                else if (choice == 3) {
                    System.out.print("Enter Amount : ");
                    double depositAmount = in.nextDouble();
                    op.depositAmount(depositAmount);
                }

                else if (choice == 4) {
                    System.out.println("Collect your ATM card");
                    System.exit(0);
                }else {
                    System.out.println("Please enter correct choice");
                }
            }
            //System.out.println("Successfully Validation !!!");
        }
        else {
            System.out.println("Incorrect");
        }
    }
}
