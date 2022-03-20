
package assignment1;
import java.util.*;


public class unlabelledBreak {
    public static void main (String []args){
        
        for (int a=0;a<1;a++){
            
            System.out.println("Please choose an option between 1 and 4.");
            
            Scanner sc= new Scanner(System.in);
            int distance = sc.nextInt();
            labelledBreak town = new labelledBreak();
            
            System.out.println("Your work area is in " + town.distance);
            
        }
    }
}


public class labelledBreak {
    String Town;
    int distance;
    
    public labelledBreak(){
    
    switch (distance)
{
case 1: Town = "Nairobi" ;
break;
case 2: Town = "Nakuru";
break;
case 3: Town = "Eldoret";
break;
default: Town = "Kakamega" ;
break;
}
}
     
}
