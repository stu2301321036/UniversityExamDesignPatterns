package bg.university.exam;

import bg.university.exam.arrival.ArrivalStrategy;
import bg.university.exam.arrival.RunningAndJumpingStrategy;
import bg.university.exam.arrival.SleepingInBusStrategy;
import bg.university.exam.arrival.TeleportationStrategy;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Тест на Strategy шаблон ===");

        ArrivalStrategy running = new RunningAndJumpingStrategy();
        ArrivalStrategy teleportation = new TeleportationStrategy();
        ArrivalStrategy sleepingInBus = new SleepingInBusStrategy();

        running.arrive();
        teleportation.arrive();
        sleepingInBus.arrive();
    }
}