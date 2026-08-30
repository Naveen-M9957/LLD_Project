package main.java.oops.LLD_Real_Time_Projects.ParkingLot_LLM.src.java.models;

import main.java.oops.LLD_Real_Time_Projects.ParkingLot_LLM.src.java.models.enums.VehicleType;

/**
 * Vehicle
 */
public class Vehicle {
    String VehicleNumber;
    VehicleType vehicleType;

    public Vehicle(String vehicleNumber, VehicleType vehicleType) {
        this.VehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
    }

    public String getVehicleNumber() {
        return VehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.VehicleNumber = vehicleNumber;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
}
