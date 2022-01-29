package com.company.tbz;


import java.util.ArrayList;

public class TechnicalCollege extends EducationalLocation{

    private String profession;
    private ArrayList<TechnicalCollege> technicalCollegeArrayList = new ArrayList<>();
    Major major = new Major();

    /**
     * RTC - Retail technical college
     * STC - Software technical college
     * OTC- Office technical college
     * @param name
     * @param location
     * @param major
     * @param fees
     * @param availableSeats
     * @param profession
     */
    public TechnicalCollege(String name, String location, Major major, double fees, int availableSeats,String profession) {
        super(name, location, major, fees, availableSeats);
       this.profession = profession;
    }

    public TechnicalCollege(){

    }

    public void initializeTechCollegeList(){
        major.initializeMajorList();
        TechnicalCollege stc = new TechnicalCollege("TBZ", "Zuerich", major.getMajorArrayList().get(0), 15000.75, 5, "IT");
        TechnicalCollege otc = new TechnicalCollege("KV", "Zuerich", major.getMajorArrayList().get(1), 18500, 10, "Clerk");
        technicalCollegeArrayList.add(stc);
        technicalCollegeArrayList.add(otc);
    }


    public ArrayList<TechnicalCollege> getTechnicalCollegeArrayList() {
        return technicalCollegeArrayList;
    }


    public String getProfession() {
        return profession;
    }


}
