package Decorator;

import Decorator.Addon.AlmondMilk;
import Decorator.Addon.ChocoChips;
import Decorator.Beverage.Beverage;
import Decorator.Beverage.FilterCoffee;
import Decorator.Beverage.HouseBlend;

public class Client {
    public static void main(String[] args) {
        Beverage houseBlend = new HouseBlend();
        houseBlend = new ChocoChips(houseBlend);
        houseBlend = new AlmondMilk(houseBlend);
        System.out.println(houseBlend.getPrice());
        houseBlend.getDescription();

        Beverage beverage = new AlmondMilk(new ChocoChips(new FilterCoffee()));
        System.out.println(beverage.getPrice());
        beverage.getDescription();
    }
}
/*
AlmondMilk.getDescription()
 └─ calls beverage.getDescription() → (ChocoChips)
      └─ ChocoChips.getDescription()
           └─ calls beverage.getDescription() → (HouseBlend)
                └─ HouseBlend.getDescription()
                     └─ prints "HouseBlend"
           └─ prints "with ChocoChips"
 └─ prints "with Almond Milk"
 -------------------------------------------------------------------------
 using super.getDescription()
 @Override
public void getDescription() {
    super.getDescription();   // ❌ calls Beverage, not the wrapped object
    System.out.println("with Almond Milk");
}
AlmondMilk.getDescription()
 └─ calls super.getDescription() → (Beverage default)
      └─ prints "Some Beverage"
 └─ prints "with Almond Milk"

 */
