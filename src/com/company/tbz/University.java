package com.company.tbz;


import java.util.ArrayList;

public class University extends EducationalLocation{

    private String insurance;
    private ArrayList<University> universities = new ArrayList<>();
    private Resume resume = new Resume();

    public University(String name, String location, Major major, double fees, int availableSeats, Resume resume, String insurance) {
        super(name, location, major, fees, availableSeats, resume);
        this.insurance = insurance;
    }

    public University(){

    }

    public ArrayList<University> initializeUniversities(){
        resume.initializeResumes();
        University eth = new University("ETH", "Zuerich", new Major("Data Science", 4, 5), 15000.75, 5, resume.getResumes().get(7), "SWICA");
        University uzh = new University("UZH", "Zuerich", new Major("Accounting", 2, 4), 18500, 10, resume.getResumes().get(8), "HELSANA");
        universities.add(eth);
        universities.add(uzh);
        return universities;
    }

    public String getInsurance() {
        return insurance;
    }

    public ArrayList<University> getUniversities() {
        return universities;
    }

}
