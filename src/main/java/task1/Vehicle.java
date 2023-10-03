package task1;

public class Vehicle {
    public enum VehicleType {
        Truck, Sportcar, PrivateVehicle
    }

    private VehicleType type;
    private int enginePower;
    private String vehicleBrand;
    String model;

    public String getVehicleBrand() {
        return vehicleBrand;
    }

    public void setVehicleBrand(String vehicleBrand) {
        this.vehicleBrand = vehicleBrand;
    }

    public double price;

    public VehicleType getType() {
        return type;
    }

    public void setType(VehicleType type) {
        this.type = type;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


public Vehicle(VehicleType type, int enginePower, String vehicleBrand, String model) {
this.type = type;
this.enginePower = enginePower;
this.vehicleBrand = vehicleBrand;
this.model = model;
}
}

