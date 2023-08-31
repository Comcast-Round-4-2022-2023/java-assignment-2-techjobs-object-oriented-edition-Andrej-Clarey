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



}
