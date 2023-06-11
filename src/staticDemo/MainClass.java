package staticDemo;

public class MainClass {
    public static void main(String[] args){
        Car.change();
        Car car1 = new Car();
        car1.car_name = "TATA Safari";
        car1.price = 850000;
        car1.call();
        System.out.println();
        Car car2 = new Car();
        car2.car_name = "TATA Sumo";
        car2.price = 3500070;
        car2.call();
        System.out.println();
        Car car3 = new Car();
        car3.car_name = "TATA Honda";
        car3.price = 5200000;
        car3.call();

    }
}
