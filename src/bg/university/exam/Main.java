package bg.university.exam;

import bg.university.exam.arrival.TeleportationStrategy;
import bg.university.exam.power.FastWriting;
import bg.university.exam.power.SuperConcentration;
import bg.university.exam.power.Telepathy;
import bg.university.exam.student.ExamParticipant;
import bg.university.exam.student.Student;
import bg.university.exam.student.StudentType;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Тест на Decorator шаблон ===");

        Student student = new Student(
                "Иван",
                StudentType.WUNDERKIND,
                new TeleportationStrategy()
        );

        ExamParticipant poweredStudent = new SuperConcentration(
                new FastWriting(
                        new Telepathy(student)
                )
        );

        System.out.println("Участник: " + poweredStudent.getDescription());
        poweredStudent.solveTask();
    }
}