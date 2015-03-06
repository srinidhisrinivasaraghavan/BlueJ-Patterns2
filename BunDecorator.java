import java.util.ArrayList;//added entire class
public class BunDecorator extends BurgerDecorator
{  
    private double price;
    private String bunType;
public BunDecorator(Burger burger,String bun)
{
    super(burger);
    bunType=bun;
    
}

public double calculatePrice()
{
    price=super.calculatePrice();
    
    switch(bunType){
            case "Gluten-Free Bun" : { price = price +1.00 ; break; } 
            case "Hawaiian Bun" : { price = price +1.00 ; break; } 
            case "Pretzel Bun"   : { price = price +0.50 ; break; } 
            }
    return price;
}
}
