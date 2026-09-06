package main.java.oops.LLD_Real_Time_Projects.ParkingLot_LLM.src.java.dtos;

import java.util.*;
import main.java.oops.LLD_Real_Time_Projects.ParkingLot_LLM.src.java.models.enums.VehicleType;

public class GetParkingLotCapacityRequestDto {
    private long parkingLotId;
    private List<Long> floorIds;
    private List<VehicleType> vehicleTypes;

    public long getParkingLotId() {
        return parkingLotId;
    }
    public void setParkingLotId(long parkingLotId) {
        this.parkingLotId = parkingLotId;
    }
    public List<Long> getFloorIds() {
        return floorIds;
    }
    public void setFloorIds(List<Long> floorIds) {
        this.floorIds = floorIds;
    }
    public List<VehicleType> getVehicleTypes() {
        return vehicleTypes;
    }
    public void setVehicleTypes(List<VehicleType> vehicleTypes) {
        this.vehicleTypes = vehicleTypes;
    }
}
