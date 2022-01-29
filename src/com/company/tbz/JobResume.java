package com.company.tbz;

public class JobResume extends Resume{
    private int maxDomicileDistance;
    public JobResume(int maxDomicileDistance, double averageGrade, Skill skill, String strength, String weakness, boolean hasBMSDiploma) {
        super(averageGrade, skill, strength, weakness, hasBMSDiploma);
        this.maxDomicileDistance = maxDomicileDistance;
    }
}
