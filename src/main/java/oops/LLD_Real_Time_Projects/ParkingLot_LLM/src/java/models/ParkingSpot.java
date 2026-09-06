package main.java.oops.LLD_Real_Time_Projects.ParkingLot_LLM.src.java.models;

import main.java.oops.LLD_Real_Time_Projects.ParkingLot_LLM.src.java.models.enums.SpotStatus;

/**
 * ParkingSpot
 */
public class ParkingSpot {
    private int spot_id;
    private boolean isAvailable;
    private Vehicle vehicle;
    private SpotStatus status;

    public ParkingSpot(int spot_id, boolean isAvailable, Vehicle vehicle) {
        this.spot_id = spot_id;
        this.isAvailable = isAvailable;
        this.vehicle = vehicle;
        this.status = SpotStatus.AVAILABLE;
    }

    public int getSpot_id() {
        return spot_id;
    }

    public void setSpot_id(int spot_id) {
        this.spot_id = spot_id;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void occupySpot(Vehicle vehicle) {
        this.isAvailable = false;
        this.vehicle = vehicle; // Clear the vehicle type when the spot is occupied
        this.status = SpotStatus.OCCUPIED;
    }

    public void freeSpot() {
        this.isAvailable = true;
        this.vehicle = null; // Clear the vehicle when the spot is freed
        this.status = SpotStatus.AVAILABLE;
    }

    public SpotStatus getStatus() {
        return status;
    }

    public void setStatus(SpotStatus status) {
        this.status = status;
    }

}
