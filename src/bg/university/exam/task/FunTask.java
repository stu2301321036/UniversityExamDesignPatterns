package bg.university.exam.task;

public class FunTask implements Task {

    @Override
    public String getTitle() {
        return "Забавна задача";
    }

    @Override
    public void showTask() {
        System.out.println("Задача: Напиши алгоритъм, който намира изгубената мотивация на студентите.");
    }
}