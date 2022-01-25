package com.company.tbz;


public class College extends EducationalLocation{
    private String internship;

    public College(String name, String location, Major major, double fees, int availableSeats) {
        super(name, location, major, fees, availableSeats);
    }
}
