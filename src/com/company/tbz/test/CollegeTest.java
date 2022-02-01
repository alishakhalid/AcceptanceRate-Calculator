package com.company.tbz.test;

import com.company.tbz.College;
import com.company.tbz.Major;
import com.company.tbz.Resume;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CollegeTest {

    private ArrayList<College> collegeArrayList = new ArrayList<>();
    private Resume resume = new Resume();

    @BeforeEach
    void setUp() {
        resume.initializeResumes();
        College zhaw = new College("ZHAW", "Zuerich", new Major("Computer Science", 4, 6), 5000, 20,  resume.getResumes().get(5), "Software Developer" );
        College hwz = new College("HWZ", "Zuerich", new Major("Business", 3, 3), 6500.50, 12,  resume.getResumes().get(6), "Retail Manager");
        collegeArrayList.add(zhaw);
        collegeArrayList.add(hwz);
    }

    @Test
    void getCollegeArrayList() {
        assertThat(collegeArrayList.get(0).getName(), collegeArrayList.get(0).getName().equals("ZHAW"));
        assertThat(collegeArrayList.get(1).getInternship(), collegeArrayList.get(1).getInternship().equals("Retail Manager"));
        Assert.assertNotSame(collegeArrayList.get(0), collegeArrayList.get(1));
        Assert.assertNotEquals(collegeArrayList.get(0), collegeArrayList.get(1));
    }
}