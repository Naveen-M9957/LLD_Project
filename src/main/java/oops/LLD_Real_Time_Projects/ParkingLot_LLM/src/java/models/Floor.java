package main.java.oops.LLD_Real_Time_Projects.ParkingLot_LLM.src.java.models;

import main.java.oops.LLD_Real_Time_Projects.ParkingLot_LLM.src.java.models.enums.FloorStatus;
import main.java.oops.LLD_Real_Time_Projects.ParkingLot_LLM.src.java.models.enums.VehicleType;
import java.util.*;

/**
 * Floor
 */
public class Floor {
    int floor_id;
    List<ParkingSpot> parkingSpots;
    private FloorStatus status;

    public Floor(int floor_id, List<ParkingSpot> parkingSpots) {
        this.floor_id = floor_id;
        this.parkingSpots = parkingSpots;
        this.status = FloorStatus.OPERTAIONAL;
    }

    public int getFloor_id() {
        return floor_id;
    }

    public void setFloor_id(int floor_id) {
        this.floor_id = floor_id;
    }

    public List<ParkingSpot> getParkingSpots() {
        return parkingSpots;
    }
    public void setParkingSpots(List<ParkingSpot> parkingSpots) {
        this.parkingSpots = parkingSpots;
    }

    public final FloorStatus getStatus() {
        return status;
    }

    public void setStatus(FloorStatus status) {
        this.status = status;
    }
    
    public List<ParkingSpot> getAllAvailableSpots(VehicleType vehicleType) {
        List<ParkingSpot> availableSpots = new ArrayList<>();
        for (ParkingSpot spot : parkingSpots) {
            if (spot.isAvailable() && spot.getVehicle().getVehicleType() == vehicleType) {
                availableSpots.add(spot);
            }
        }
        return availableSpots;
    }

    public ParkingSpot getAvailableSpot(VehicleType vehicleType) {
        for (ParkingSpot spot : parkingSpots) {
            if (spot.isAvailable() && spot.getVehicle().getVehicleType() == vehicleType) {
                return spot;
            }
        }
        return null; // No available spot found
    }
}
