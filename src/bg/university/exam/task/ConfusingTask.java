package bg.university.exam.task;

public class ConfusingTask implements Task {

    @Override
    public String getTitle() {
        return "Непонятна задача";
    }

    @Override
    public void showTask() {
        System.out.println("Задача: Обясни рекурсивна архитектура чрез диаграма, която сама проектира себе си.");
    }
}