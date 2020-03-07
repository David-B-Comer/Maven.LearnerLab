package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructors {

    @Test
    public void testInstructorsSingleton() {

        int expected = 5;
        People teachers = Students.getInstance();

        int actual = teachers.count();

        Assert.assertEquals(expected, actual);
    }

}
