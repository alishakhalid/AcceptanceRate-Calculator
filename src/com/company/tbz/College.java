package com.company.tbz;


import java.util.ArrayList;

public class College extends EducationalLocation{
    private String internship;
    private ArrayList<College> colleges = new ArrayList<>();
    private Major major;

    public College(String name, String location, Major major, double fees, int availableSeats, String internship) {
        super(name, location, major, fees, availableSeats);
        College zhaw = new College("ZHAW", "Zuerich", major.getMajors().get(0), 5000, 20, "Software Developer");
        College hwz = new College("HWZ", "Zuerich", major.getMajors().get(1), 6500.50, 12, "Retail Manager");
        colleges.add(zhaw);
        colleges.add(hwz);
    }

    public ArrayList<College> getColleges() {
        return colleges;
    }
}
