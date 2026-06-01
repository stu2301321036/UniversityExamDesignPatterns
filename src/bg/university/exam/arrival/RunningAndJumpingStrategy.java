package bg.university.exam.arrival;

public class RunningAndJumpingStrategy implements ArrivalStrategy {

    @Override
    public void arrive() {
        System.out.println("Студентът пристига с тичане и подскачане.");
    }
}