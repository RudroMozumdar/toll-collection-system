package com.example.source;

public class Payment {
    private String type, username, vehicle_number;
    private double weight;
    private double payment;

    public Payment(String t, String u, String v, double w){
        this.setUsername(u);
        this.setType(t);
        this.setVehicle_number(v);
        this.setWeight(w);
        this.setPayment(w);
    }

    public double getPayment() {
        return payment;
    }

    public double getWeight() {
        return weight;
    }

    public String getType() {
        return type;
    }

    public String getUsername() {
        return username;
    }

    public String getVehicle_number() {
        return vehicle_number;
    }

    public void setPayment(double payment) {
        this.payment = payment*10;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setVehicle_number(String vehicle_number) {
        this.vehicle_number = vehicle_number;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}

