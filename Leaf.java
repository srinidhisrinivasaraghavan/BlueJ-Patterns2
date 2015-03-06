
import java.util.ArrayList;



public class Leaf implements Component {

    private ArrayList<String> description=new ArrayList<String>();
    

    public Leaf ( ArrayList<String> List)
    {
        description = List ;
        
    }
    
    public void printDescription() {
       
        for(int i=0;i<description.size();i++)
        {
            if(i==description.size()-1)
            {
              System.out.println( description.get(i));
            }
            else
            {
               System.out.print( description.get(i)+" + " );
            }
       }
     
    }
    public void addChild(Component c) {
	    // no implementation
	}

	public void removeChild(Component c) {
        // no implementation
	}

	public Component getChild(int i) {
        // no implementation
        return null ;
	}
	 
}
 
