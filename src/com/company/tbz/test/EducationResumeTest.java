package com.company.tbz.test;

import com.company.tbz.EducationResume;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class EducationResumeTest {
    ArrayList<EducationResume> userResumeList = new ArrayList<>();

    @BeforeEach
    void setUp() {
        EducationResume educationResume = new EducationResume();
        educationResume.setMinAge(19);
        educationResume.setAverageGrade(5.6);
        educationResume.setUserSkill("programmingJava");
        educationResume.setStrength("fair");
        educationResume.setWeakness("insecure");
        educationResume.setHasBMSDiploma(true);
        userResumeList.add(educationResume);
    }

    @Test
    void userResumeAsHash(){
        assertNotNull(userResumeList);
    }

    @Test
    void calculateAcceptanceRate(){
        Double counter = 5.0;
        Assert.assertNotSame(counter, userResumeList.get(0).getAverageGrade());
    }

    @Test
    void getUserResumeList() {
        userResumeList.forEach(System.out::println);
        assertEquals(1, userResumeList.size());
        assertFalse(userResumeList.isEmpty());
        assertTrue(userResumeList.size() == 1);
    }

    @Test
    public void testRemoveWithEmptyList(){
        userResumeList.remove(0);
        assertTrue(userResumeList.size() == 0);
    }
}