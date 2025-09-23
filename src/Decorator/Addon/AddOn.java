package Decorator.Addon;

import Decorator.Beverage.Beverage;

public abstract class AddOn extends Beverage{
    protected Beverage beverage;
    public AddOn(Beverage beverage){
        this.beverage = beverage;
    }
}
