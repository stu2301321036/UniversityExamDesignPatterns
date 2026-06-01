package bg.university.exam.arrival;

public class TeleportationStrategy implements ArrivalStrategy {

    @Override
    public void arrive() {
        System.out.println("Студентът пристига чрез телепортация.");
    }
}