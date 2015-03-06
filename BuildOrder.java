import java.util.ArrayList;
public class BuildOrder {
       static String protein;
       static String weight;
       static String bunOrBowl;
       static String bunType;//added
       static String side;//added
       static ArrayList<String> base=new ArrayList<String>();
       static ArrayList<String> CheeseList=new ArrayList<String>();
       static ArrayList<String> PremiumCheeseList=new ArrayList<String>();//added
       static ArrayList<String> PremiumToppingsList=new ArrayList<String>();
       static ArrayList<String> ToppingsList=new ArrayList<String>();
       static ArrayList<String> SauceList=new ArrayList<String>();
       static ArrayList<String> BunType=new ArrayList();
       static ArrayList<String> Side=new ArrayList();
      
      public static Component getOrder()
      {
          PriceOrder price=new PriceOrder();
         
          //choose a burger
          protein="Organic Bison";
          weight ="1/2lb";
          bunOrBowl="On A Bun";
          base.add(protein);
          base.add(weight);
          base.add(bunOrBowl);
          
          //choose cheese
          CheeseList.add("Spicy Jalapeno Jack");
          CheeseList.add("Yellow American");
          
          //add Premium Cheese
          PremiumCheeseList.add("Danish Blue Cheese");
          
          //add sauce
          SauceList.add("Mayonnaise");
          SauceList.add("Thai Peanut Sauce");

          //add unlimited toppings
          ToppingsList.add("Black Olives");
          ToppingsList.add("Dill Pickle Chips");
          ToppingsList.add("Spicy Pickles");
          
          //add premiumToppings
          PremiumToppingsList.add("Marinated Tomatoes");
          
          //choose a bun
          bunType="Ciabatta(Vegan)";
          BunType.add(bunType);
          
          //choose a side
          side="Shoestring Fries";
          Side.add(side);
         
          
          Composite order = new Composite( "Order" ) ;
          Composite customBurger = new Composite( "Build Your Own Burger $ "+price.getPrice("Build Your Own Burger"));
          customBurger.addChild(new Leaf(base)); 
          customBurger.addChild(new Leaf(CheeseList ));
          customBurger.addChild(new Leaf(PremiumCheeseList));
          customBurger.addChild(new Leaf(SauceList));
          customBurger.addChild(new Leaf(ToppingsList));
          customBurger.addChild(new Leaf(PremiumToppingsList));
          customBurger.addChild(new Leaf(BunType));
          customBurger.addChild(new Leaf(Side));
          order.addChild( customBurger );
          
          //reinitialize for 2nd custom burger
          base=new ArrayList<String>();
          CheeseList=new ArrayList<String>();
          PremiumCheeseList=new ArrayList<String>();
          PremiumToppingsList=new ArrayList<String>();
          ToppingsList=new ArrayList<String>();
          SauceList=new ArrayList<String>();
          BunType=new ArrayList<String>();
          Side=new ArrayList<String>();
          
          //choose a burger
          protein="Hormone & Antibiotic Free Beef";
          weight ="1/3lb";
          bunOrBowl="On A Bun";
          
          
         
          base.add(protein);
          base.add(weight);
          base.add(bunOrBowl);
         
          //add cheese
          CheeseList.add("Greek Feta");
          CheeseList.add("Smoked Gouda");
         
          //add Premium Cheese
          PremiumCheeseList.add("Fresh Mozzarella");
          
          //add sauce
          SauceList.add("Habanero Salsa");
          
          //add toppings
          ToppingsList.add("Crushed Peanuts");
          
          //add premiumToppings
          PremiumToppingsList.add("Marinated Tomatoes");
          PremiumToppingsList.add("Sunny Side Up Egg");          
          
          //Choose a bun
          bunType="Gluten-Free Bun";
          BunType.add(bunType);
          
          //Choose a side
          side="Shoestring Fries";
          Side.add(side);
         
          
          Composite customBurger1 = new Composite( "*********************\nBuild Your Own Burger $ "+price.getPrice("Build Your Own Burger"));
          customBurger1.addChild(new Leaf(base)); 
          customBurger1.addChild(new Leaf(CheeseList ));
          customBurger1.addChild(new Leaf(PremiumCheeseList));
          customBurger1.addChild(new Leaf(SauceList));
          customBurger1.addChild(new Leaf(ToppingsList));
          customBurger1.addChild(new Leaf(PremiumToppingsList));
          customBurger1.addChild(new Leaf(BunType));
          customBurger1.addChild(new Leaf(Side));
          order.addChild( customBurger1 );
          return order ;
      }
      

}
