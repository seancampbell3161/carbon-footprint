//start class
public class Car extends Vehicle {
    
    //instance varible
    private double gallon;
   
    //constructor with one argument
    public Car (double gallon) {
        
        this.gallon = gallon;
        //double footprint = gallon*20;
    }
    
    @Override
    
    //override method from abstract superclass
    public void getCarbonFootprint() {
        
        String string1 = String.format("The carbonfootprint is: %.2f", (gallon*20));
        System.out.println(string1);
    }
} //end class
