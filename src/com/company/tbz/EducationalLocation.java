package com.company.tbz;


/**
 * This is a super class defining
 * attributes for child classes
 * to use
 */
public class EducationalLocation{
    private String name;
    private String location;
    private Major major;
    private double fees;
    private int availableSeats;
    private Resume resume;


    /**
     * Common attributes in the constructor which
     * the child classes will be using
     * @param name of the Educational Place
     * @param location of the Educational Place
     * @param major of the Educational Place
     * @param fees of the Educational Place
     * @param availableSeats at the Educational Place
     * @param resume requirements of the Educational Place
     */
    public EducationalLocation(String name, String location, Major major, double fees, int availableSeats, Resume resume) {
        this.name = name;
        this.location = location;
        this.major = major;
        this.fees = fees;
        this.availableSeats = availableSeats;
        this.resume = resume;
    }

    public EducationalLocation(){}

    /**
     * Getter and Setters to access the values
     * of the attributes
     */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Major getMajor() {
        return major;
    }

    public void setMajor(Major major) {
        this.major = major;
    }

    public double getFees() {
        return fees;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }
}
