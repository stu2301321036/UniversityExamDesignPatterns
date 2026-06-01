package bg.university.exam.student;

import bg.university.exam.arrival.ArrivalStrategy;

public class Student implements ExamParticipant {
    private final String name;
    private final StudentType type;
    private ArrivalStrategy arrivalStrategy;

    public Student(String name, StudentType type, ArrivalStrategy arrivalStrategy) {
        this.name = name;
        this.type = type;
        this.arrivalStrategy = arrivalStrategy;
    }

    public String getName() {
        return name;
    }

    public StudentType getType() {
        return type;
    }

    public ArrivalStrategy getArrivalStrategy() {
        return arrivalStrategy;
    }

    public void setArrivalStrategy(ArrivalStrategy arrivalStrategy) {
        this.arrivalStrategy = arrivalStrategy;
    }

    public void arriveAtUniversity() {
        System.out.println(name + " тръгва към университета.");
        arrivalStrategy.arrive();
    }

    @Override
    public String getDescription() {
        return name + " - " + getStudentTypeName();
    }

    @Override
    public void solveTask() {
        System.out.println(name + " започва да решава задачата.");
    }

    private String getStudentTypeName() {
        return switch (type) {
            case WUNDERKIND -> "вундеркинд";
            case FITNESS_MANIAC -> "фитнес маниак";
            case LUCKY -> "калитко";
        };
    }
}