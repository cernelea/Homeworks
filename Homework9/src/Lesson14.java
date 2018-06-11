
public class Lesson14 {

    public static void main(String[] args) {

       Aircraft cessna172=new Aircraft(4,140,56.5,9.5);
       Aircraft piperSaratoga=new Aircraft(6,201,102.5,20.5);
       
       System.out.println("For Cessna172 to fly for 4.2 hours it takes :"+cessna172.fuelNeeded(4.2)+" gallons" );
         System.out.println("For Piper to fly for 2.56 hours it takes :"+piperSaratoga.fuelNeeded(2.56)+" gallons" );
        
        cessna172.setPassengers(10);
        
        Aircraft.wings=2;
        System.out.println("All of my aircraft have"+Aircraft.wings);
        
        Math.cos(5.56);
        
        
        
    }

}

class Aircraft {

    private int passengers;
    int cruiseSpeed;
    double fuelCapacity;
    double fuelBurnrate;
    static int wings;

    Aircraft(int p, int c, double fc, double fbr) {
        passengers = p;
        cruiseSpeed = c;
        fuelCapacity = fc;
        fuelBurnrate = fbr;

    }

    double calculateEndurance() {
        double endurance;

        endurance = fuelCapacity / fuelBurnrate;
return endurance;
    }
    double fuelNeeded(double time){
    double fuelNeeded;
        
    fuelNeeded=fuelBurnrate*time;
    
    return fuelNeeded;
    }
    
    
    

    void setPassengers(int p) {
        if ((p > 0) && (p <= 10)) {
            passengers = p;
            System.out.println("Revised passenger count: " + passengers);

        }
        else System.out.println("Error setting passengers.");

    }

}
