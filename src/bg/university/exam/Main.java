package bg.university.exam;

import bg.university.exam.arrival.RunningAndJumpingStrategy;
import bg.university.exam.arrival.SleepingInBusStrategy;
import bg.university.exam.arrival.TeleportationStrategy;
import bg.university.exam.student.Student;
import bg.university.exam.student.StudentType;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Тест на Student + Strategy ===");

        Student firstStudent = new Student(
                "Иван",
                StudentType.WUNDERKIND,
                new TeleportationStrategy()
        );

        Student secondStudent = new Student(
                "Георги",
                StudentType.FITNESS_MANIAC,
                new RunningAndJumpingStrategy()
        );

        Student thirdStudent = new Student(
                "Петър",
                StudentType.LUCKY,
                new SleepingInBusStrategy()
        );

        firstStudent.arriveAtUniversity();
        firstStudent.solveTask();

        System.out.println();

        secondStudent.arriveAtUniversity();
        secondStudent.solveTask();

        System.out.println();

        thirdStudent.arriveAtUniversity();
        thirdStudent.solveTask();
    }
}