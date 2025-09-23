package Decorator.Beverage;

public class Espresso extends Beverage{
    @Override
    public int getPrice() {
        return 20;
    }

    @Override
    public void getDescription() {
        System.out.println("Espresso");
    }
}
