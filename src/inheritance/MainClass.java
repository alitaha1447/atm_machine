package inheritance;

public class MainClass {
    public static void main(String[] args){
        Animal animal = new  Dog(); //upcasting
        animal.name = "German";
        animal.age = 12;
        animal.speak();
        Dog dog = new Dog();
        dog.walk();

    }
}
