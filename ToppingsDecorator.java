import java.util.ArrayList;
public class ToppingsDecorator extends BurgerDecorator
{  
    private ArrayList<String> toppingsList;
    private double price;
public ToppingsDecorator(Burger burger,ArrayList<String> ToppingsList)
{
    super(burger);
    toppingsList=ToppingsList;
}

public double calculatePrice()
{
    price=super.calculatePrice();
    return price;
}
}
