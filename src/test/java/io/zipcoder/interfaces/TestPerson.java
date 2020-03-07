package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void testConstructor() {

        long id = 1;
        String name = "Dave";
        Person person = new Person(id, name);

        long expectedId = person.getId();
        String expectedName = person.getName();

        Assert.assertEquals(id, expectedId);
        Assert.assertEquals(name, expectedName);

    }


    @Test
    public void testSetName() {

        Person person = new Person(1, null);
        String expected = "Dave";
        person.setName(expected);

        String actual = person.getName();

        Assert.assertEquals(expected, actual);
    }
}
