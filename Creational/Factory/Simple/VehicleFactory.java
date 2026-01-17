package Factory.Simple;

public class VehicleFactory {
    
    public static Vehicle getVehicle(String s){
        if(s == null)return null;

        switch(s){
            case "CAR" : 
                return new Car();
            case "TRUCK" : 
                return new Truck();
            default : 
                return null;
        }
    }
}
