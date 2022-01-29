package com.company.tbz;

public class EducationResume extends Resume{
    private int minAge;
    public EducationResume(int minAge, double averageGrade, Skill skill, String strength, String weakness, boolean hasBMSDiploma) {
        super(averageGrade, skill, strength, weakness, hasBMSDiploma);
        this.minAge = minAge;
    }
}
