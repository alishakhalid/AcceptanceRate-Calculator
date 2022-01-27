package com.company.tbz;


import java.util.ArrayList;

public class TechnicalCollege extends EducationalLocation{

    private String profession;
    private ArrayList<TechnicalCollege> technicalColleges = new ArrayList<>();

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
        TechnicalCollege stc = new TechnicalCollege("TBZ", "Zuerich", major.getMajors().get(0), 15000.75, 5, "IT");
        TechnicalCollege otc = new TechnicalCollege("KV", "Zuerich", major.getMajors().get(1), 18500, 10, "Clerk");
        TechnicalCollege rtc = new TechnicalCollege("BFFS", "Winterthur", major.getMajors().get(3), 18500, 10, "Retail Worker");
        technicalColleges.add(stc);
        technicalColleges.add(otc);
        technicalColleges.add(rtc);
    }
}
