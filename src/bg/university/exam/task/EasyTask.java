package bg.university.exam.task;

public class EasyTask implements Task {

    @Override
    public String getTitle() {
        return "Лесна задача";
    }

    @Override
    public void showTask() {
        System.out.println("Задача: Отговори с 'Да' на въпроса дали Singleton има само една инстанция.");
    }
}