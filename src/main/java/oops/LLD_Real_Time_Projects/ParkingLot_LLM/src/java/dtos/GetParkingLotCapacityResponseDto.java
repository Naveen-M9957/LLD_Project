package main.java.oops.LLD_Real_Time_Projects.ParkingLot_LLM.src.java.dtos;

import java.util.Map;

import main.java.oops.LLD_Real_Time_Projects.ParkingLot_LLM.src.java.models.Floor;

public class GetParkingLotCapacityResponseDto {
    private Response response;
    private Map<Floor, Map<String, Integer>> capacityMap;

    public Map<Floor, Map<String, Integer>> getCapacityMap() {
        return capacityMap;
    }
    
    public void setCapacityMap(Map<Floor, Map<String, Integer>> capacityMap) {
        this.capacityMap = capacityMap;
    }

    public Response getResponse() {
        return response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }

}
