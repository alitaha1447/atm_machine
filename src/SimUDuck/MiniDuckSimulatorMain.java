package SimUDuck;

public class MiniDuckSimulatorMain {
    public static void main(String[] args){


        Duck readhead = new RedheadDuck(new FlyWithWings(),new Quack());
        readhead.display();
        readhead.performQuack();
        readhead.performFly();
        readhead.swim();


        System.out.println();
        Duck mallard = new MallardDuck(new FlyWithWings(),new Quack());
        mallard.display();
        mallard.performFly();
        mallard.performQuack();
        mallard.swim();

        System.out.println();
        Duck rubber = new RubberDuck(new Squeak(),new FlyNoWay());
        rubber.display();
        rubber.performQuack();
        rubber.performFly();
        rubber.swim();

        /*System.out.println();
        Duck decoy = new DecoyDuck();
        decoy.display();*/
        System.out.println();
        Duck decoy = new DecoyDuck();
        decoy.display();
        decoy.performFly();
        decoy.performQuack();
        decoy.swim();

        System.out.println();
        Duck model = new ModelDuck();
        model.display();
        model.performFly();
        model.performQuack();


    }
}
