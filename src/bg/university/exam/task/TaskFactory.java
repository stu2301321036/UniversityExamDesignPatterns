package bg.university.exam.task;

import bg.university.exam.student.StudentType;

public class TaskFactory {

    private TaskFactory() {
    }

    public static Task createTask(StudentType studentType) {
        return switch (studentType) {
            case WUNDERKIND -> new FunTask();
            case FITNESS_MANIAC -> new ConfusingTask();
            case LUCKY -> new EasyTask();
        };
    }
}