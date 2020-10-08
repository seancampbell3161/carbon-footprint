//start class
public class CarbonFootprintTest {
    //start main method
    public static void main(String[] args) {
        
        //create array with 2 elements
        Vehicle [] myarray = new Vehicle[2];
        myarray[0] = (new Car(100));
        myarray[1] = (new Bicycle());
        
        //loop iterate through elements executing method
        for(int i=0; i < myarray.length; i++) {
            
            myarray[i].getCarbonFootprint();
        }
    } //end main method
} //end class
