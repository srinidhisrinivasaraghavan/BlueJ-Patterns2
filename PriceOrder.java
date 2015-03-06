
import java.util.ArrayList;
public  class PriceOrder
{ double resultPrice=0.0;
    
  public  double getPrice(String description){
  BuildOrder b=new BuildOrder();    
  resultPrice=0.0;
  Burger burger=new SideDecorator(new BunDecorator(new SauceDecorator(new PremiumToppingsDecorator(new ToppingsDecorator(new PremiumCheeseDecorator(new CheeseDecorator(new ConcreteBurger(b.protein,b.weight,b.bunOrBowl),b.CheeseList),b.PremiumCheeseList),b.ToppingsList),b.PremiumToppingsList),b.SauceList),b.bunType),b.side);
  resultPrice=burger.calculatePrice();
  return resultPrice;
}
}