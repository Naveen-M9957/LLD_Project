package main.java.oops.LLD_Real_Time_Projects.ParkingLot_LLM.src.java.models;

/**
 * ParkingSpot
 */
public class ParkingSpot {
    int spot_id;
    boolean isAvailable;
    Vehicle vehicle;

    public ParkingSpot(int spot_id, boolean isAvailable, Vehicle vehicle) {
        this.spot_id = spot_id;
        this.isAvailable = isAvailable;
        this.vehicle = vehicle;
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
    }

    public void freeSpot() {
        this.isAvailable = true;
        this.vehicle = null; // Clear the vehicle when the spot is freed
    }


}
