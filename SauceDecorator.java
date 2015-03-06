
import java.util.ArrayList;
public class SauceDecorator extends BurgerDecorator
{  
    private ArrayList<String> sauceList;
    private double price;
public SauceDecorator(Burger burger,ArrayList<String> SauceList)
{
    super(burger);
    sauceList=SauceList;
}
public double calculatePrice()
{
    price=super.calculatePrice();
    if(sauceList.size()>1){
    price=price+((sauceList.size()-1)*0.50);
    }//changed price

    return price;
}
}
