package com.company.tbz;


import java.util.ArrayList;

public class College extends EducationalLocation {
    private String internship;
    private ArrayList<College> collegeArrayList = new ArrayList<>();
    private Resume resume = new Resume();

    public College(){

    }

    public College(String name, String location, Major major, double fees, int availableSeats, Resume resume, String internship) {
        super(name, location, major, fees, availableSeats, resume);
        this.internship = internship;
    }

    public ArrayList<College> initializeColleges(){
        resume.initializeResumes();
        College zhaw = new College("ZHAW", "Zuerich", new Major("Computer Science", 4, 6), 5000, 20,  resume.getResumes().get(5), "Software Developer" );
        College hwz = new College("HWZ", "Zuerich", new Major("Business", 3, 3), 6500.50, 12,  resume.getResumes().get(6), "Retail Manager");
        collegeArrayList.add(zhaw);
        collegeArrayList.add(hwz);
        return collegeArrayList;
    }

    public String getInternship() {
        return internship;
    }

    public ArrayList<College> getCollegeArrayList() {
        return collegeArrayList;
    }

    public Resume getResume() {
        return resume;
    }
}
