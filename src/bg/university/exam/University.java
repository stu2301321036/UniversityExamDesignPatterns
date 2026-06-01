package bg.university.exam;

import bg.university.exam.student.ExamParticipant;
import bg.university.exam.student.Student;
import bg.university.exam.task.Task;
import bg.university.exam.task.TaskFactory;

public class University {
    private static University instance;

    private University() {
    }

    public static University getInstance() {
        if (instance == null) {
            instance = new University();
        }

        return instance;
    }

    public void conductExam(Student student, ExamParticipant participant) {
        System.out.println("==================================");
        System.out.println("Контролното започва в единствения и неповторим университет ПУ.");
        System.out.println("==================================");

        student.arriveAtUniversity();

        System.out.println();

        Task task = TaskFactory.createTask(student.getType());

        System.out.println("Системата разпознава студента като: " + student.getDescription());
        System.out.println("Назначена задача: " + task.getTitle());
        task.showTask();

        System.out.println();

        System.out.println("Участник в контролното: " + participant.getDescription());
        participant.solveTask();

        System.out.println();

        System.out.println("Контролното приключи успешно.");
        System.out.println("==================================");
    }
}