package PractiseDemo2;

public class Test3 {
    public static void main(String[] args){
        Pen p1 = new Pen("Ball Pen", 25);
        p1.display();
        Pen p2 = new Pen("Gel Pen", 10);
        p2.display();
        Pen p3 = new Pen("Pilot Pen", 50);
        p3.display();
        Pen p4 = new Pen("Fountain Pen", 250);
        p4.display();
        Pen.stat();


    }
}
class Pen {
    String name;
    int price;
    static String manufacturing = "India";

   Pen(String n, int p){
        //this.name = name;
        //this.price = price;
        name = n;
        price = p;
    }
//Non Static Method
    public  void display() {
        System.out.println(name +" " + price + " " + manufacturing);
    }
    //Static method
    public static void stat(){
        System.out.println("I am static method");
    }
}
