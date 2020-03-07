package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestZipCodeWilmington {

    ZipCodeWilmington zipcode;
    Students students;
    Instructor instructor;

    @Before
    public void setup() {

        zipcode = ZipCodeWilmington.getInstance();
        students = Students.getInstance();
        instructor = new Instructor(1, "Kris");
    }

    @Test
    public void testHostLecture() {
        Double expected = 2.0;

        zipcode.hostLecture(instructor, 10.0);
        Double actual = zipcode.getStudyMap().get(students.findById(1));

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testHostLectureWithId() {
        Double expected = 4.0;

        zipcode.hostLecture(2, 10.0);
        Double actual = zipcode.getStudyMap().get(students.findById(2));

        Assert.assertEquals(expected, actual);
    }
}
