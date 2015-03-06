
public class ConcreteBurger implements Burger
{
    private String protein;
    private String weight;
    private String bunOrBowl;
    double price=0;
    
    public ConcreteBurger(String protein,String weight,String bunOrBowl)
    {
        this.protein=protein;
        this.weight=weight;
        this.bunOrBowl=bunOrBowl;
    }
    
    public double calculatePrice()
    {
        //changed for lab5
        switch(this.protein)
        {
            case "Organic Bison" : {price = price + 4.00; break;}
            case "Ahi Tuna" : {price = price + 4.00; break;}
        }
        //changed for lab5
        
        switch(this.weight)
        {
            case "1/3lb" : { price = price +9.00 ; break; } //changed price
            case "1/2lb" : { price = price +12.00 ; break; } //changed 1/2lb and price
            case "1lb"   : { price = price +18.00 ; break; }//changed price
        }
        
        if(bunOrBowl.equalsIgnoreCase("In A Bowl"))
        {
            price=price+1.0;
        }
        return price;
    }
}