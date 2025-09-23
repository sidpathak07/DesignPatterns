package Decorator.Beverage;

public class FilterCoffee extends Beverage{
    @Override
    public int getPrice() {
        return 40;
    }

    @Override
    public void getDescription() {
        System.out.println("Cappuccino");
    }
}
