package SimUDuck;

public  abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public abstract void display();

    public void swim() {
        System.out.println("I am swim");
    }

    public void performFly()
    {
        flyBehavior.fly();
    }
    public void performQuack(){
        quackBehavior.quack();

    }




}
