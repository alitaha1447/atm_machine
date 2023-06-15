package collection;

public class StaticDemo {
    public static void main(String[] args) {
//    Integer i = new Integer(0);
    int i = 0;
        System.out.println("i = " + i);
        i = i/0;
        demo(i);
        System.out.println("i : " + i);
    }
    public static void demo(Integer num1){
        System.out.println(num1);
        num1 = num1 + 1;
        System.out.println(num1);
    }
}
