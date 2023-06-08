package PractiseDemo;

import java.util.Scanner;

class ATM {
    float balance;
    int pin = 123;

    public void checkpin() {
        System.out.print("Enter your pin : ");
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        if (pin == p) {
            System.out.println("success");
            menu();
        } else {
            System.out.println("error");
            checkpin();
        }
    }

    public void menu() {
        System.out.println("Enter your choice  ");
        System.out.println("CheckBalance 1  ");
        System.out.println("DepositAmount 2  ");
        System.out.println("WithdrawalAmount 3  ");
        System.out.println("Exit 4 ");
        Scanner sc1 = new Scanner(System.in);
        int ch = sc1.nextInt();

        if (ch == 1) {
            checkBalance();
        } else if (ch == 2) {
            depositAMount();
        } else if (ch == 3) {
            withdrawalAmount();
        } else if (ch == 4) {
            System.out.println("Thank you for using SBI ATM Machine");
        } else {
            System.out.println("Enter your correct choice");
        }
    }
    public void checkBalance(){
        System.out.println("Balance : " + balance);
        menu();
    }
    public void withdrawalAmount(){
        System.out.println("Enter Amount");
        Scanner sc = new Scanner(System.in);
        float amt = sc.nextFloat();
        if(amt>balance){
            System.out.println("Insufficient Balance");
        }
        else{
            balance = balance - amt;
            System.out.println("Withdrawal Successfully!!!");
        }
        menu();
    }
    public void depositAMount(){
        System.out.println("Enter Amount");
        Scanner sc = new Scanner(System.in);
        float d = sc.nextFloat();
        balance = balance + d;
        System.out.println("Deposited Successfully!!!");
        menu();
    }
}

public class ATM_Machine {
    public static void main(String[] args) {
        ATM at = new ATM();
        at.checkpin();
    }
}
