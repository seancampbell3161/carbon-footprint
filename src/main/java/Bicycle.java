//start class
public class Bicycle extends Vehicle {
    
    //instance variable
    private double footprint = 0.00;
    
    @Override
    
    //override method from abstract superclass
    public void getCarbonFootprint() {
        
        System.out.printf("The carbon footprint is: %.2f", footprint);
    }
   
} //end class
