package main.java.oops.LLD_Real_Time_Projects.ParkingLot_LLM.src.java.excpetion;

public class GetParkingLotRequestValidationException extends RuntimeException {
    private String message;

    public GetParkingLotRequestValidationException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
