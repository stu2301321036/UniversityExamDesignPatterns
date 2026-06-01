package bg.university.exam;

import bg.university.exam.arrival.RunningAndJumpingStrategy;
import bg.university.exam.arrival.SleepingInBusStrategy;
import bg.university.exam.arrival.TeleportationStrategy;
import bg.university.exam.power.FastWriting;
import bg.university.exam.power.SuperConcentration;
import bg.university.exam.power.Telepathy;
import bg.university.exam.student.ExamParticipant;
import bg.university.exam.student.Student;
import bg.university.exam.student.StudentType;

public class Main {
    public static void main(String[] args) {
        University university = University.getInstance();
        University anotherUniversity = University.getInstance();

        Student firstStudent = new Student(
                "Иван",
                StudentType.WUNDERKIND,
                new TeleportationStrategy()
        );

        ExamParticipant firstPoweredStudent = new SuperConcentration(
                new FastWriting(firstStudent)
        );

        university.conductExam(firstStudent, firstPoweredStudent);

        System.out.println();

        Student secondStudent = new Student(
                "Георги",
                StudentType.FITNESS_MANIAC,
                new RunningAndJumpingStrategy()
        );

        ExamParticipant secondPoweredStudent = new FastWriting(
                new Telepathy(secondStudent)
        );

        university.conductExam(secondStudent, secondPoweredStudent);

        System.out.println();

        Student thirdStudent = new Student(
                "Петър",
                StudentType.LUCKY,
                new SleepingInBusStrategy()
        );

        ExamParticipant thirdPoweredStudent = new Telepathy(
                new SuperConcentration(thirdStudent)
        );

        university.conductExam(thirdStudent, thirdPoweredStudent);

        System.out.println("Един и същ университет ли е?     " + (university == anotherUniversity ? "Да това еедин и същ университет!" : "Не, не е един и същ университет!"));
    }
}