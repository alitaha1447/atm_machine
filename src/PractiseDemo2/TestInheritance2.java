package PractiseDemo2;

import java.util.Scanner;

class Calculator{
    public int add(int num1,int num2){
        return num1 + num2;
    }
    public int sub(int num1,int num2){
        return num1 - num2;
    }
}
class AdvanceCalculator extends Calculator{
    public int multi(int num1,int num2){
        return num1 * num2;
    }
    public double div(double num1,double num2){
        return num1 / num2;
    }
}
public class TestInheritance2 {
    public static void main(String[] args){
        //Calculator cal = new Calculator();
        AdvanceCalculator ad = new AdvanceCalculator();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value1 : ");
        int value1 = sc.nextInt();
        System.out.print("Enter value2 : ");
        int value2 = sc.nextInt();

        int addition = ad.add(value1,value2);
        System.out.println("Addition " + addition);
        int subtraction = ad.sub(value1,value2);
        System.out.println("Subtraction " + subtraction);
        int multiplication = ad.multi(value1,value2);
        System.out.println("Multiplication " + multiplication);
        double division = ad.div(value1,value2);
        System.out.println("Division " + division);

    }
}
