package ManagementSystem;

import java.util.Scanner;


public class MainClass {

    public static void main(String[] args){
        Showroom ut = new Showroom();
        Scanner sc = new Scanner(System.in);

        while (true){
            menu();
            int choice = sc.nextInt();
            if(choice == 1){
            ut.setDetails();

            }
            else if (choice == 4) {
                ut.getDetails();
            }
            else if (choice == 0) {
                System.out.println("Thank you for using our management system");
                System.exit(0);
            }else {
                System.out.println("Enter correct choice");

            }
        }
    }
    public static void menu(){
        System.out.println();
        System.out.println("======================= *** WELCOME TO SHOWROOM MANAGEMENT SYSTEM *** =======================");
        System.out.println();
        System.out.println("=============================== *** ENTER YOUR CHOICE *** ===============================");
        System.out.println();
        System.out.println("1].ADD SHOWROOMS \t\t\t 2].ADD EMPLOYEES \t\t\t 3].ADD CARS");
        System.out.println();
        System.out.println("4].GET SHOWROOMS \t\t\t 5].GET EMPLOYEES \t\t\t 6].GET CARS");
        System.out.println();
        System.out.println("=============================== *** ENTER 0 TO EXIT *** ===============================");

    }
}
