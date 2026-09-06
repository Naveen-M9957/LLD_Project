package main.java.oops.LLD_Real_Time_Projects.ParkingLot_LLM.src.java.dtos;

/**
 * Response
 */
public class Response {
    private ResponseStatus status;
    private String message;

    public Response(ResponseStatus status, String message) {
        this.status = status;
        this.message = message;
    }

    public ResponseStatus getStatus() {
        return status;
    }
    
    public String getMessage() {
        return message;
    }

}
