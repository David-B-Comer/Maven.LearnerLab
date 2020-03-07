package io.zipcoder.interfaces;

public enum Educator implements Teacher {

    KRIS("Kris", 1),
    DOLIO("Dolio", 2),
    FROILAN("Froilan", 3),
    ROBERTO("Roberto", 4),
    CHRIS("Chris", 5);

    final Instructor instructor;
    double timeWorked = 0;

    Educator(String name, long id) {
        instructor = new Instructor(id, name);
        Instructors.getInstance().add(instructor);
        this.timeWorked = 0;
    }


    @Override
    public void teach(Learner learner, double numberOfHours) {

        instructor.teach(learner, numberOfHours);

        timeWorked += numberOfHours;

    }

    @Override
    public void lecture(Learner[] learner, double numberOfHours) {

        instructor.lecture(learner, numberOfHours);

        timeWorked += numberOfHours;

    }
}
