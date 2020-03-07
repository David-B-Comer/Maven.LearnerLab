package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;


public class TestStudent {


    @Test
   public void testImplementation() {

        Student student = new Student( 1234, "Dave");

        boolean actual = student instanceof Learner;

        Assert.assertTrue(actual);

    }

    @Test
    public void testInheritance() {

        Student student = new Student( 1234, "Dave");

        boolean actual = student instanceof Person;

        Assert.assertTrue(actual);
    }

    @Test
    public void testLearn() {

        Student student = new Student( 1234, "Dave");
        student.learn(10.0);
        Double expected = 10.0;


        Double actual = student.getTotalStudyTime();


        Assert.assertEquals(expected, actual, .001);
    }

}