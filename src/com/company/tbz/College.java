package com.company.tbz;


import java.util.ArrayList;

public class College extends EducationalLocation {
    private String internship;
    private ArrayList<College> collegeArrayList = new ArrayList<>();
    private Major major = new Major();

    public College(){

    }

    public College(String name, String location, Major major, double fees, int availableSeats, String internship) {
        super(name, location, major, fees, availableSeats);
        this.internship = internship;
    }

    public void initializeCollegeList(){
        major.initializeMajorList();
        College zhaw = new College("ZHAW", "Zuerich", major.getMajorArrayList().get(0), 5000, 20, "Software Developer");
        College hwz = new College("HWZ", "Zuerich", major.getMajorArrayList().get(1), 6500.50, 12, "Retail Manager");
        collegeArrayList.add(zhaw);
        collegeArrayList.add(hwz);
    }

    public ArrayList<College> getCollegeArrayList() {
        return collegeArrayList;
    }


    public String getInternship() {
        return internship;
    }


}
