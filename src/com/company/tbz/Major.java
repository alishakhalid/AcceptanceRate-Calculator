package com.company.tbz;


import java.util.ArrayList;

public class Major {
    private String majorName;
    private int majorDurationInYears;
    private int numberOfSchoolDays;
    private ArrayList<Major> majors = new ArrayList<>();

    public Major(String majorName, int majorDurationInYears, int numberOfSchoolDays) {
        Major computer_science = new Major("Computer Science", 4, 6);
        Major business = new Major("Business", 3, 3);
        Major accounting = new Major("Accounting", 2, 4);
        Major marketing = new Major("Marketing", 1, 5);
        majors.add(computer_science);
        majors.add(business);
        majors.add(marketing);
        majors.add(accounting);
        this.majorName = majorName;
        this.majorDurationInYears = majorDurationInYears;
        this.numberOfSchoolDays = numberOfSchoolDays;
    }

    public Major(){}

    public String getMajorName() {
        return majorName;
    }

    public void setMajorName(String majorName) {
        this.majorName = majorName;
    }

    public int getMajorDurationInYears() {
        return majorDurationInYears;
    }

    public void setMajorDurationInYears(int majorDurationInYears) {
        this.majorDurationInYears = majorDurationInYears;
    }

    public int getNumberOfSchoolDays() {
        return numberOfSchoolDays;
    }

    public void setNumberOfSchoolDays(int numberOfSchoolDays) {
        this.numberOfSchoolDays = numberOfSchoolDays;
    }

    public ArrayList<Major> getMajors() {
        return majors;
    }

    public void setMajors(ArrayList<Major> majors) {
        this.majors = majors;
    }
}
