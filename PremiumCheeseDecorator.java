//added entire class
import java.util.ArrayList;
public class PremiumCheeseDecorator extends BurgerDecorator
{  
    private ArrayList<String> premiumCheeseList;
    private double price;
public PremiumCheeseDecorator(Burger burger,ArrayList<String> PremiumCheeseList)
{
    super(burger);
    premiumCheeseList=PremiumCheeseList;
}

public double calculatePrice()
{
    price=super.calculatePrice();
    price=price+((premiumCheeseList.size())*1.50);
    return price;
}
}