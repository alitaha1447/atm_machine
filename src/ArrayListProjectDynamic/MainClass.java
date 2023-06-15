package ArrayListProjectDynamic;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        //create a array list to store contact
        ArrayList<ContactBook> c = new ArrayList<>();

        System.out.println("!!! Welcome to Contact Book !!!");
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Press 1: To Add Contact Details");
            System.out.println("Press 2: To View All Details ");
            System.out.println("Press 3: For Exit");
            System.out.print("Enter Your Choice : ");
            int ch = sc.nextInt();
            if (ch == 1) {
                System.out.print("Enter name : ");
                String name = sc.next();
                System.out.print("Enter phoneNumber : ");
                Integer number = sc.nextInt();
                if(number>10){
                    System.out.println("Enter Valid Phone Number !!!");
                }
                System.out.print("Enter city : ");
                String city = sc.next();

                ContactBook cb = new ContactBook(name, number, city);
//                ArrayList<ContactBook> c = new ArrayList<>();
                c.add(cb);
                System.out.println("Contact Details Added Successfully");
            } else if (ch == 2) {
                System.out.println("Contact Details");
                if (c.isEmpty()) {
                    System.out.println("No details found");
                } else {
                    for (ContactBook cb2 : c
                    ) {
                        System.out.println(cb2.getName() + " " + cb2.getPhoneNumber() + " " + cb2.getCity());
                    }
                }
            } else if (ch == 3) {
                sc.close();
                System.exit(0);
            } else {
                System.out.println("Enter correct choice : ");
            }
        }
    }
}
