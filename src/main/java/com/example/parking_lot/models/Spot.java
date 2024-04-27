package com.example.parking_lot.models;

public class Spot extends BaseModel{
    private String name;
    private SpotStatus spotStatus;
    private VehicleType vehicleType;
    //private Vehicle;
    //in case of tic tak toe, we want to check the winner, so we stored
    //players in cell class,
    //here we don't care which vehicle is stored in the spot
    //we only care abut spotstatus


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SpotStatus getSpotStatus() {
        return spotStatus;
    }

    public void setSpotStatus(SpotStatus spotStatus) {
        this.spotStatus = spotStatus;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
}
