package com.company.tbz;


public class TechnicalCollege extends EducationalLocation{

    private String profession;

    public TechnicalCollege(String name, String location, Major major, double fees, int availableSeats) {
        super(name, location, major, fees, availableSeats);
    }
}
