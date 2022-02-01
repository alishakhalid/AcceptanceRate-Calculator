package com.company.tbz.test;

import com.company.tbz.EducationResume;
import com.company.tbz.JobResume;
import org.junit.Rule;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.TemporaryFolder;

import java.io.FileWriter;
import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class FileHandlerTest {
    JobResume jobResume = new JobResume();
    EducationResume educationResume = new EducationResume();

    private static String line;

    @Test
    void addResumeToFile() {
        jobResume.addUserResumeToList(jobResume);
        line = String.valueOf("Average Grade: "+jobResume.getAverageGrade())
                .concat(", ").concat("Skill: "+jobResume.getSkill().getName())
                .concat(", ").concat("Strength: "+jobResume.getStrength()).concat(", ")
                .concat("Weakness: "+jobResume.getWeakness()).concat(", ")
                .concat(String.valueOf("Has BMS Diploma: "+jobResume.isHasBMSDiploma()));
    }
    @Test
    void addEdResume() {
        educationResume.addUserResumeToList(educationResume);
        line = String.valueOf("Average Grade: "+educationResume.getAverageGrade())
                .concat(", ").concat("Skill: "+educationResume.getSkill().getName())
                .concat(", ").concat("Strength: "+educationResume.getStrength()).concat(", ")
                .concat("Weakness: "+educationResume.getWeakness()).concat(", ")
                .concat(String.valueOf("Has BMS Diploma: "+educationResume.isHasBMSDiploma()));
    }

}