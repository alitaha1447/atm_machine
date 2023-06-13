package SimUDuck;

public class MallardDuck extends Duck{
public MallardDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior){

//    flyBehavior = new FlyWithWings();
//    quackBehavior = new Quack();
this.flyBehavior = flyBehavior;
this.quackBehavior = quackBehavior;
}
    @Override
    public void display() {
        System.out.println("I am MallardDuck Supeeeeeeer");
    }


}
