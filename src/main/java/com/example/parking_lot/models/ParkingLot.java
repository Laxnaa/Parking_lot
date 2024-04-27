package com.example.parking_lot.models;

import com.example.parking_lot.models.BaseModel;

import java.util.List;

public class ParkingLot extends BaseModel {
    private List<Floor> floors;
    private List<Gate> Gates;

    public List<Floor> getFloors() {
        return floors;
    }

    public void setFloors(List<Floor> floors) {
        this.floors = floors;
    }

    public List<Gate> getGates() {
        return Gates;
    }

    public void setGates(List<Gate> gates) {
        Gates = gates;
    }
}
