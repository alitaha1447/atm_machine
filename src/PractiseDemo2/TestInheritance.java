package PractiseDemo2;

class Animal{
    String name;
    int age;
    void speak(){
        System.out.println("speakng");
    }
}
class Dog extends Animal{
    public void display(){
        System.out.println("My Dog name is : " + name + " " + "and his age is : " + age);
    }
}
class Cat extends Animal{
    public  void display(){
        System.out.println("My cat name is : " + name + " " + "and her age is : " + age);
    }
}
public class TestInheritance {
    public static void main(String[] args){
        Dog d = new Dog();
        d.name = "Germanshepard";
        d.age = 10;
        d.display();
        d.speak();
        Cat c = new Cat();
        c.name = "Murphy";
        c.age = 2;
        c.display();
    }
}
