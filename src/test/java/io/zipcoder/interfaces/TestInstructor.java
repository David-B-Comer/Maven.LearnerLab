package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {


    @Test
    public void testImplementation() {

        Instructor instructor = new Instructor( 1, "Kris");

        boolean actual = instructor instanceof Teacher;

        Assert.assertTrue(actual);

    }

    @Test
    public void testInheritance() {

        Instructor instructor = new Instructor( 2, "Dolio");

        boolean actual = instructor instanceof Person;

        Assert.assertTrue(actual);
    }

    @Test
    public void testTeach() {

        Instructor instructor = new Instructor( 1234, "Dave");
        Student student = new Student(12345, "David");

        Double expected = 10.0;

        instructor.teach(student, 10.0);
        Double actual = student.getTotalStudyTime();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testLecture() {

        Instructor instructor = new Instructor(1, "Kris");
        Student student1 = new Student(1, "Dave");
        Student student2 = new Student(2, "David");
        Student student3 = new Student(3, "Brian");

        Student[] studentsExpected = {student1, student2, student3};

        for(int i = 0; i < 3; i++) {
            studentsExpected[i].learn(10);
        }

        Double expected = 20.0;

        instructor.lecture(studentsExpected, 30);
        Double actual = studentsExpected[0].getTotalStudyTime();

        Assert.assertEquals(expected, actual, .001);
    }
}
