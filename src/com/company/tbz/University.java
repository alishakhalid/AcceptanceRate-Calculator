package com.company.tbz;


import java.util.ArrayList;

/**
 * This class is a child class from
 * EducationalLocation, in which we
 * summarized few attribute which are
 * used in two other classes
 * We have access on them through
 * super()
 */
public class University extends EducationalLocation{

    /**
     * additional attributed for the university
     */
    private String insurance;
    private ArrayList<University> universities = new ArrayList<>();
    private Resume resume = new Resume();

    /**
     * Constructor to create a university, inheriting attributes
     * from EducationalLocation through super()
     * @param name of the university
     * @param location of the university
     * @param major the university offers
     * @param fees how much the student would pay for his studies
     * @param availableSeats how many seats are available
     * @param resume requirements of the university to get accepted
     * @param insurance to study in Switzerland the Student must have a insurance
     */
    public University(String name, String location, Major major, double fees, int availableSeats, Resume resume, String insurance) {
        super(name, location, major, fees, availableSeats, resume);
        this.insurance = insurance;
    }

    public University(){

    }

    /**
     * In this method we created two different
     * universities with the needed attributes
     * and allocated a resume. This is important
     * for the future, if the user decides to
     * apply for a university we will compare
     * on the basis of this resume how much
     * of a chance he/she would have to get
     * accepted
     * @return
     */
    public ArrayList<University> initializeUniversities(){
        resume.initializeResumes();
        University eth = new University("ETH", "Zuerich", new Major("Data Science", 4, 5), 15000.75, 5, resume.getResumes().get(7), "SWICA");
        University uzh = new University("UZH", "Zuerich", new Major("Accounting", 2, 4), 18500, 10, resume.getResumes().get(8), "HELSANA");
        universities.add(eth);
        universities.add(uzh);
        return universities;
    }


    /**
     * Getter and Setters for the
     * needed attributes to get their
     * values
     */

    public String getInsurance() {
        return insurance;
    }

    public ArrayList<University> getUniversities() {
        return universities;
    }

    public Resume getResume() {
        return resume;
    }
}
