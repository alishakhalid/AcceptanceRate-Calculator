package com.company.tbz;


import java.util.ArrayList;

public class EducationalLocation{
    private String name;
    private String location;
    private Major major;
    private double fees;
    private int availableSeats;

    public EducationalLocation(){}

    public EducationalLocation(String name, String location, Major major, double fees, int availableSeats) {
        this.name = name;
        this.location = location;
        this.major = major;
        this.fees = fees;
        this.availableSeats = availableSeats;
    }

    public void getListOfStudyPlace(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Major getMajor() {
        return major;
    }

    public void setMajor(Major major) {
        this.major = major;
    }

    public double getFees() {
        return fees;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }
}
