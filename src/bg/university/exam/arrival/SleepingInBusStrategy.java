package bg.university.exam.arrival;

public class SleepingInBusStrategy implements ArrivalStrategy {

    @Override
    public void arrive() {
        System.out.println("Студентът пристига след спане в автобус.");
    }
}