import java.util.ArrayList;//added entire class
public class SideDecorator extends BurgerDecorator
{  
    private String side;
    private double price;
public SideDecorator(Burger burger,String side)
{
    super(burger);
    this.side=side;
}

public double calculatePrice()
{
    price=super.calculatePrice();
    if(side!=null)
    {
        price=price+3;
    }
    return price;
}
}
