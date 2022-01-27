package com.company.tbz;


import java.util.ArrayList;

public class University extends EducationalLocation{

    private String insurance;
    private ArrayList<University> universities = new ArrayList<>();

    /**
     *
     * fix and give more than one major to the university
     * @param name
     * @param location
     * @param major
     * @param fees
     * @param availableSeats
     * @param insurance
     */
    public University(String name, String location, Major major, double fees, int availableSeats, String insurance) {
        super(name, location, major, fees, availableSeats);
        University eth = new University("ETH", "Zuerich", major.getMajors().get(0), 15000.75, 5, "SWICA");
        University uzh = new University("UZH", "Zuerich", major.getMajors().get(3), 18500, 10, "HELSANA");
        universities.add(eth);
        universities.add(uzh);
    }
}
