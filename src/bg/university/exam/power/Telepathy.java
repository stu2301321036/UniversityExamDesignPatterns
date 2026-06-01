package bg.university.exam.power;

import bg.university.exam.student.ExamParticipant;

public class Telepathy extends StudentPowerDecorator {

    public Telepathy(ExamParticipant participant) {
        super(participant);
    }

    @Override
    public String getDescription() {
        return participant.getDescription() + " + телепатия";
    }

    @Override
    public void solveTask() {
        participant.solveTask();
        System.out.println("Използва телепатия, за да усети правилния отговор.");
    }
}