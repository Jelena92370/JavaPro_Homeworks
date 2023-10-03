package task1;

public class Main {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle(Vehicle.VehicleType.PrivateVehicle, 150, "Toyota", "Yaris");
vehicle.price = 40000;
vehicle.setEnginePower(200);
vehicle.setType(Vehicle.VehicleType.Sportcar);
vehicle.setModel("Yaris");

        Vehicle truck = Factory.createTruck(400, "Volvo", "V60");
        Vehicle sportcar = Factory.createSportcar(600, "Ferrari", "Italia");
        Vehicle privateVehicle = Factory.createPrivateVehicle(200, "Toyota", "Yaris");

        System.out.println("Truck:");
        System.out.println("Type: " + truck.getType());
        System.out.println("Engine Power: " + truck.getEnginePower());
        System.out.println("Brand: " + truck.getVehicleBrand());
        System.out.println("Model: " + truck.getModel());

        System.out.println("\nSportcar:");
        System.out.println("Type: " + sportcar.getType());
        System.out.println("Engine Power: " + sportcar.getEnginePower());
        System.out.println("Brand: " + sportcar.getVehicleBrand());
        System.out.println("Model: " + sportcar.getModel());

        System.out.println("\nPrivate Vehicle:");
        System.out.println("Type: " + privateVehicle.getType());
        System.out.println("Engine Power: " + privateVehicle.getEnginePower());
        System.out.println("Brand: " + privateVehicle.getVehicleBrand());
        System.out.println("Model: " + privateVehicle.getModel());
    }
}
