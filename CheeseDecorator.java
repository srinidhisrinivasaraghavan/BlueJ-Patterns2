
import java.util.ArrayList;
public class CheeseDecorator extends BurgerDecorator
{
    private ArrayList<String> cheeseList;
    private double price;
public CheeseDecorator(Burger burger,ArrayList<String> CheeseList)
{
    super(burger);
    cheeseList=CheeseList;
}

public double calculatePrice()
{
    price=super.calculatePrice();
    if(cheeseList.size()>1){    
    price=price+((cheeseList.size()-1)*1.0);}
    return price;
}
}
