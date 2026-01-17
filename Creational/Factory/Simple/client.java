package Factory.Simple;

public class client {
    public static void main(String[] args) {
        Vehicle vehicle = VehicleFactory.getVehicle("TRUCK");
        if(vehicle == null){
            System.out.println("No vehicle");
            return;
        }
        vehicle.drive();
    }
}
