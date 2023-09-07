package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.launchcode.techjobs.oo.*;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {

    @Test
    public void testSettingJobId(){
        Job job1 = new Job();
        Job job2 = new Job();
        assertNotEquals(job1, job2);
    }

    @Test
    public void testJobConstructorSetsAllFields(){
        Job testJob3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new
                PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(testJob3.getName() instanceof String);
        assertEquals("Product tester", testJob3.getName());
        assertTrue(testJob3.getEmployer() instanceof Employer);
        assertEquals("ACME", testJob3.getEmployer().getValue());
        assertTrue(testJob3.getLocation() instanceof Location);
        assertEquals("Desert",testJob3.getLocation().getValue());
        assertTrue(testJob3.getPositionType() instanceof PositionType);
        assertEquals("Quality control", testJob3.getPositionType().getValue());
        assertTrue(testJob3.getCoreCompetency() instanceof CoreCompetency);
        assertEquals("Persistence", testJob3.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality(){
        Job testJob4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new
                PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job testJob5 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new
                PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(testJob4 == testJob5);
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData(){
        Job testJob6 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new
                PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals("\nID: " + testJob6.getId() + " \nName: Product tester \nEmployer: ACME \nLocation: Desert" +
                " \nPosition Type: Quality control \nCore Competency: Persistence \n", testJob6.toString());
    }

    @Test
    public void testToStringHandlesEmptyField(){
        Job testJob7 = new Job("Product tester", new Employer(""), new Location("Desert"), new
                PositionType(""), new CoreCompetency("Persistence"));
        assertEquals("ID: " + testJob7.getId() + " \nName: Product tester \nEmployer: Data not available \nLocation: Desert" +
                " \nPosition Type: Data not available \nCore Competency: Persistence \n", testJob7.toString());
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine(){//swap with test at line 48
        Job testJob8 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new
                PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals('\n', testJob8.toString().charAt(testJob8.toString().length()-1));
        assertEquals('\n', testJob8.toString().charAt(0));
    }

}
