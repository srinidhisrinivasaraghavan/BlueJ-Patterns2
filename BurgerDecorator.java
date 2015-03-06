
public class BurgerDecorator implements Burger
{
  private Burger currentBurger=null;
  public BurgerDecorator(Burger burger)
  {
      currentBurger=burger;
  }
  
  public double calculatePrice()
  {
      return currentBurger.calculatePrice();
  }
}  
