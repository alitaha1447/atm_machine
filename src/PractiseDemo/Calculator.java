package PractiseDemo;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        cal ca = new cal();
        ca.call();
    }
}
class cal{
    double a;
    double b;
    double result;
    char c;
    public void call(){
        System.out.println("Welcome to Calculator");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        double a = sc.nextDouble();
        System.out.print("Enter operator (+,-,*,/) : ");
        char c = sc.next().charAt(0);
        System.out.print("Enter Second Number : ");
        double b = sc.nextDouble();


        if(c == '+'){
            result = a + b;
            System.out.println(result);
        } else if (c == '-') {
            result = a - b;
            System.out.println(result);
        } else if (c == '*') {
            result = a * b;
            System.out.println(result);
        } else if (c == '/') {
            result = a - b;
            System.out.println(result);
        }
         else{
            System.out.println("Enter correct choice");
        }
        call();

    }
}