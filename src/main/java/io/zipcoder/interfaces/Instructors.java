package io.zipcoder.interfaces;


public final class Instructors extends People<Instructor> {

    private static final Instructors Instance = new Instructors();

    private Instructors() {
        add(new Instructor(1, "Kris"));
        add(new Instructor(2, "Dolio"));
        add(new Instructor(3, "Froilan"));
        add(new Instructor(4, "Roberto"));
        add(new Instructor(5, "Chris"));
    }

    public static Instructors getInstance() { return Instance; }

    @Override
    public Instructor[] getArray() {
        return getPersonList().toArray(new Instructor[0]);
    }

}
