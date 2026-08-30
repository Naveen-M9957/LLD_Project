package main.java.oops.LLD_Real_Time_Projects.ParkingLot_LLM.src.java.models;
import java.util.*;

import main.java.oops.LLD_Real_Time_Projects.ParkingLot_LLM.src.java.models.enums.VehicleType;

public class ParkingLot {
    int parking_lot_id;
    List<Floor> floors;
    List<Gate> gates;

    public ParkingLot(int parking_lot_id, List<Floor> floors, List<Gate> gates) {
        this.parking_lot_id = parking_lot_id;
        this.floors = floors;
        this.gates = gates;
    }

    public int getParking_lot_id() {
        return parking_lot_id;
    }

    public void setParking_lot_id(int parking_lot_id) {
        this.parking_lot_id = parking_lot_id;
    }

    public List<Floor> getFloors() {
        return floors;
    }

    public void setFloors(List<Floor> floors) {
        this.floors = floors;
    }

    public List<Gate> getGates() {
        return gates;
    }
    public void setGates(List<Gate> gates) {
        this.gates = gates;
    }

    public ParkingSpot getAvailableSpot(VehicleType vehicleType) {
        for (Floor floor : floors) {
            ParkingSpot spot = floor.getAvailableSpot(vehicleType);
            if (spot != null) {
                return spot;
            }
        }
        return null; // No available spot found
    }

    public List<ParkingSpot> getAllAvailableSpots(VehicleType vehicleType) {
        List<ParkingSpot> availableSpots = new ArrayList<>();
        for (Floor floor : floors) {
            availableSpots.addAll(floor.getAllAvailableSpots(vehicleType));
        }
        return availableSpots;
    }
}