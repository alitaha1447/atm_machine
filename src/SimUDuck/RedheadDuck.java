package SimUDuck;

public class RedheadDuck extends Duck{
public RedheadDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior){
    this.flyBehavior = flyBehavior;
    this.quackBehavior = quackBehavior;
//    flyBehavior = new FlyWithWings();
//    quackBehavior = new Quack();

}
    @Override
    public void display() {
        System.out.println("I am RedheadDuck");
    }
}
