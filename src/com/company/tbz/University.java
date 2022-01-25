package com.company.tbz;


public class University extends EducationalLocation{

    private String insurance;

    public University(String name, String location, Major major, double fees, int availableSeats) {
        super(name, location, major, fees, availableSeats);
    }
}
