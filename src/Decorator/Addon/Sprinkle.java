package Decorator.Addon;

import Decorator.Beverage.Beverage;

public class Sprinkle extends AddOn{
    public Sprinkle(Beverage beverage){
        super(beverage);
    }
    @Override
    public int getPrice() {
        return 10 + beverage.getPrice();
    }

    @Override
    public void getDescription() {
        beverage.getDescription();
        System.out.println("with Sprinkle");
    }
}
