package com.company.tbz;


import java.util.ArrayList;

public class University extends EducationalLocation{

    private String insurance;
    private ArrayList<University> universities = new ArrayList<>();
    private Major major = new Major();

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
        this.insurance = insurance;
    }

    public University(){

    }

    public void initializeUniversityList(){
        major.initializeMajorList();
        University eth = new University("ETH", "Zuerich", major.getMajorArrayList().get(0), 15000.75, 5, "SWICA");
        University uzh = new University("UZH", "Zuerich", major.getMajorArrayList().get(3), 18500, 10, "HELSANA");
        universities.add(eth);
        universities.add(uzh);
    }

    public String getInsurance() {
        return insurance;
    }

    public ArrayList<University> getUniversities() {
        return universities;
    }

}
