package com.company.tbz;

import java.util.ArrayList;

/**
 * This class is the child class
 * of the parent class EducationalLocation with
 * the additional field jobOrientation
 */
public class TechnicalCollege extends EducationalLocation{

    private String jobOrientation;
    private ArrayList<TechnicalCollege> technicalCollegeArrayList = new ArrayList<>();
    private Resume resume = new Resume();

    public TechnicalCollege(String name, String location, Major major, double fees, int availableSeats, Resume resume, String jobOrientation) {
        super(name, location, major, fees, availableSeats, resume);
        this.jobOrientation = jobOrientation;

    }

    public TechnicalCollege(){}

    /**
     * This method adds hardcoded data into the technical
     * college arraylist and returns it
     * @return
     */
    public ArrayList<TechnicalCollege> initializeTechnicalColleges(){
        resume.initializeResumes();
        TechnicalCollege itc = new TechnicalCollege("TBZ", "Zuerich", new Major("Informatik", 4, 1), 15000.75, 5, resume.getResumes().get(9), "IT");
        TechnicalCollege atc = new TechnicalCollege("KV", "Zuerich", new Major("Economics", 3, 2), 18500, 10, resume.getResumes().get(10), "Clerk");
        technicalCollegeArrayList.add(itc);
        technicalCollegeArrayList.add(atc);
        return technicalCollegeArrayList;
    }


    public ArrayList<TechnicalCollege> getTechnicalCollegeArrayList() {
        return technicalCollegeArrayList;
    }


    public String getProfession() {
        return jobOrientation;
    }

    public String getJobOrientation() {
        return jobOrientation;
    }

    public Resume getResume() {
        return resume;
    }
}
