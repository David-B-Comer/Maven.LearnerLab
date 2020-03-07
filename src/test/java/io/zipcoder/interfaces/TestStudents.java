package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudents {

    @Test

    public void testStudentSingleton() {

        Students instance = Students.getInstance();

        int i = 1;
        for(Student student: instance.getArray()) {
            Assert.assertNotNull(student);
            Assert.assertEquals(student.getId(), i);
            i++;
        }
    }
}

