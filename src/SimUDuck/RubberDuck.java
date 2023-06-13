package SimUDuck;

public class RubberDuck extends Duck{
    public RubberDuck(QuackBehavior quackBehavior,FlyBehavior flyBehavior){
        //quackBehavior = new Squeak();
        //flyBehavior = new FlyNoWay();
        this.quackBehavior = quackBehavior;
        this.flyBehavior = flyBehavior;
    }
    public void display(){
        System.out.println("I am RubberDuck");
    }


}
