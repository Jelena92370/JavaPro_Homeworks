package task1;

public class Factory {
    public static Vehicle createTruck(int enginePower, String vehicleBrand, String model) {
        return new Vehicle(Vehicle.VehicleType.Truck, enginePower, vehicleBrand, model);
    }

    public static Vehicle createSportcar(int enginePower, String vehicleBrand, String model) {
        return new Vehicle(Vehicle.VehicleType.Sportcar, enginePower, vehicleBrand, model);
    }

    public static Vehicle createPrivateVehicle(int enginePower, String vehicleBrand, String model) {
        return new Vehicle(Vehicle.VehicleType.PrivateVehicle, enginePower, vehicleBrand, model);
    }

}
