package Decorator.Beverage;

public class HouseBlend extends Beverage{
    @Override
    public int getPrice() {
        return 30;
    }

    @Override
    public void getDescription() {
        System.out.println("HouseBlend");
    }
}
