package io.zipcoder.interfaces;


import org.junit.Assert;
import org.junit.Test;


public class TestEducator {

    @Test
    public void testImplementation() {

        Educator educator = Educator.KRIS;

        boolean actual = educator instanceof Teacher;

        Assert.assertTrue(actual);
    }

    @Test
    public void testTeach() {

        Educator educator = Educator.KRIS;
        Student student = new Student(1, "Dave");
        double expected = 10;

        educator.teach(student, expected);
        double actual = student.getTotalStudyTime();

        Assert.assertEquals(expected, actual, .001);
    }

    @Test
    public void testTeachEducatorTimeWorked() {

        Educator educator = Educator.DOLIO;
        Student student = new Student(1, "Dave");
        double expected = 20;

        educator.teach(student, expected);
        double actual = educator.timeWorked;

        Assert.assertEquals(expected, actual, .001);


    }

    @Test
    public void testLecture() {

        Educator educator = Educator.KRIS;

        Student student1 = new Student(1, "Dave");
        Student student2 = new Student(2, "David");
        Student student3 = new Student(3, "Brian");

        Student[] studentsExpected = new Student[3];
        studentsExpected[0] = student1;
        studentsExpected[1] = student2;
        studentsExpected[2] = student3;

        for(int i = 0; i < 3; i++) {
            studentsExpected[i].learn(10);
        }

        Student[] studentsActual = new Student[3];
        studentsActual[0] = student1;
        studentsActual[1] = student2;
        studentsActual[2] = student3;

        educator.lecture(studentsActual, 30);

        Assert.assertArrayEquals(studentsExpected, studentsActual);
    }

    @Test
    public void testLectureEducatorTimeWorked() {

        Educator educator = Educator.FROILAN;

        Student student1 = new Student(1, "Dave");
        Student student2 = new Student(2, "David");
        Student student3 = new Student(3, "Brian");

        Student[] students = new Student[3];
        students[0] = student1;
        students[1] = student2;
        students[2] = student3;

        double expected = 50;

        educator.lecture(students, expected);
        double actual = educator.timeWorked;

        Assert.assertEquals(expected, actual, .001);

    }
}