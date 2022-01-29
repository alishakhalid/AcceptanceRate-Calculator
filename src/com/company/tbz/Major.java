package com.company.tbz;


import java.util.ArrayList;

public class Major {
    private String majorName;
    private int majorDurationInYears;
    private int numberOfSchoolDays;
    private ArrayList<Major> majorArrayList = new ArrayList<>();

    // TODO: 1/29/2022 im consturcotr educationLocation mitgeben?
    public Major(String majorName, int majorDurationInYears, int numberOfSchoolDays) {
        this.majorName = majorName;
        this.majorDurationInYears = majorDurationInYears;
        this.numberOfSchoolDays = numberOfSchoolDays;
    }

    public Major() {

    }

    public void initializeMajorList(){
        Major computer_science = new Major("Computer Science", 4, 6 );
        Major business = new Major("Business", 3, 3);
        Major accounting = new Major("Accounting", 2, 4);
        Major data_science = new Major("Data Science", 1, 5);
        majorArrayList.add(computer_science);
        majorArrayList.add(business);
        majorArrayList.add(data_science);
        majorArrayList.add(accounting);
    }

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

    public ArrayList<Major> getMajorArrayList() {
        return majorArrayList;
    }

    public void setMajorArrayList(ArrayList<Major> majorArrayList) {
        this.majorArrayList = majorArrayList;
    }
}
