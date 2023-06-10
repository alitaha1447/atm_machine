package BillGenerator;

public class Pizza {
    private int price;
    private Boolean veg;
    private int extraCheesePrice = 100;
    private  int extraToppingsPrice = 150;
    private int bagPackPrice = 20;
    private int basePizzaPrice;

    public Pizza(Boolean veg) {
        this.veg = veg;
        if (this.veg) {
            this.price = 300;
        } else {
            this.price = 400;
        }
        basePizzaPrice = this.price;
    }

    public void addExtraCheese() {
        System.out.println("Extra Cheese added");
        basePizzaPrice = basePizzaPrice + extraCheesePrice;


    }

    public void addExtraToppings() {
        System.out.println("Extra Toppings added");
        basePizzaPrice = basePizzaPrice + extraToppingsPrice;
    }

    public void takeAway() {
        System.out.println("Extra bag pack price");
        basePizzaPrice += bagPackPrice;
    }

    public void getBill() {
        System.out.println("Total Price of Pizza : " + basePizzaPrice);
    }
















    /*public void getPizzaPrice() {
        System.out.println(this.price);
    }*/


}
