package bg.university.exam;

import bg.university.exam.arrival.RunningAndJumpingStrategy;
import bg.university.exam.arrival.SleepingInBusStrategy;
import bg.university.exam.arrival.TeleportationStrategy;
import bg.university.exam.student.Student;
import bg.university.exam.student.StudentType;
import bg.university.exam.task.Task;
import bg.university.exam.task.TaskFactory;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Тест на Factory шаблон ===");

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

        showAssignedTask(firstStudent);
        System.out.println();

        showAssignedTask(secondStudent);
        System.out.println();

        showAssignedTask(thirdStudent);
    }

    private static void showAssignedTask(Student student) {
        Task task = TaskFactory.createTask(student.getType());

        System.out.println("Студент: " + student.getDescription());
        System.out.println("Получена задача: " + task.getTitle());
        task.showTask();
    }
}