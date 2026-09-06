package main.java.oops.LLD_Real_Time_Projects.ParkingLot_LLM.src.java.models;

import java.util.Date;

public class Ticket {
    private int ticket_id;
    private Vehicle vehicle;
    private ParkingSpot parkingSpot;
    private Date entryTime;
    private Gate entryGate;

    public Ticket(int ticket_id, Vehicle vehicle, ParkingSpot parkingSpot, Date entryTime, Gate entryGate) {
        this.ticket_id = ticket_id;
        this.vehicle = vehicle;
        this.parkingSpot = parkingSpot;
        this.entryTime = entryTime;
        this.entryGate = entryGate;
    }

    public int getTicket_id() {
        return ticket_id;
    }
    public Vehicle getVehicle() {
        return vehicle;
    }
    public ParkingSpot getParkingSpot() {   
        return parkingSpot;
    }
    public Date getEntryTime() {
        return entryTime;
    }
    public Gate getEntryGate() {
        return entryGate;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "ticket_id=" + ticket_id +
                ", vehicle=" + vehicle +
                ", parkingSpot=" + parkingSpot +
                ", entryTime=" + entryTime +
                ", entryGate=" + entryGate +
                '}';
    }
}
