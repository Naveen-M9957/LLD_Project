package main.java.oops.LLD_Real_Time_Projects.ParkingLot_LLM.src.java.models;

import main.java.oops.LLD_Real_Time_Projects.ParkingLot_LLM.src.java.models.enums.GateType;

/**
 * Gate
 */
public class Gate {
    private String gate_name;
    private  GateType gate_type;

    public Gate( String gate_name, GateType gate_type) {
        this.gate_name = gate_name;
        this.gate_type = gate_type;
    }

    public String getGate_name() {
        return gate_name;
    }
    public void setGate_name(String gate_name) {    
        this.gate_name = gate_name;
    }
    public GateType getGate_type() {
        return gate_type;
    }
    public void setGate_type(GateType gate_type) {
        this.gate_type = gate_type;
    }
}
