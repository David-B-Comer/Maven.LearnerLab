package io.zipcoder.interfaces;

import org.junit.*;

public class TestPeople {

    private static Student elwood = new Student(6, "Elwood");
    private static Student bruno = new Student(7, "Bruno");
    static People<Student> students;

    @Before
    public void setup() {

        students = Students.getInstance();
    }

    @Test
    public void testAdd() {

        int expected = 6;

        students.add(elwood);
        int actual = students.count();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFindById() {

      String expected = "Elwood";

      Student elwood = students.findById(6);
      String actual = elwood.getName();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testRemove() {

       int expected = 5;

       students.remove(elwood);
       int actual = students.count();

       Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemoveById() {

        students.add(bruno);

        students.remove(bruno);
        Student expected = students.findById(bruno.getId());

        Assert.assertNull(expected);
    }

    @AfterClass
    public static void afterAll() {

        students.remove(elwood);
    }
}
