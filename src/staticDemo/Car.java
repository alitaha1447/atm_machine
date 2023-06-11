package staticDemo;

public class Car {
    String car_name;
    int price;
    static String company_name = "TATA";
    public void call(){
        System.out.println("Car Name : " + " " + car_name);
        System.out.println("Car price : " + " " + price);
        System.out.println("Company Name : " + " " + company_name);
    }
    public static void change(){
        company_name = "Bajaj";
    }
}
