package SimUDuck;

public class ModelDuck extends Duck{
    public ModelDuck(){
        flyBehavior = new FlyRockectPowered();
        quackBehavior = new Quack();
    }
    @Override
    public void display() {
        System.out.println("I am Model Duck");
    }
}
