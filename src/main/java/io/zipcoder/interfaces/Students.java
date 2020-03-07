package io.zipcoder.interfaces;


public final class Students extends People<Student> {

    private static final Students Instance = new Students();

    private Students() {
        add(new Student(1,"David"));
        add(new Student(2, "Dave"));
        add(new Student(3, "Brian"));
        add(new Student(4, "Matt"));
        add(new Student(5, "Matthew"));
    }

    public static Students getInstance() {

        return Instance;
    }

    @Override
    public Student[] getArray() {

        return getPersonList().toArray(new Student[0]);
    }

}
