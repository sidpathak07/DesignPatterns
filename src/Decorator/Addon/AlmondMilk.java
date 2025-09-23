package Decorator.Addon;

import Decorator.Beverage.Beverage;

public class AlmondMilk extends AddOn{
    public AlmondMilk(Beverage beverage){
        super(beverage);
    }
    @Override
    public int getPrice() {
        return 30 + beverage.getPrice();
    }

    @Override
    public void getDescription() {
        beverage.getDescription();
        System.out.println("with Almond Milk");
    }
}
