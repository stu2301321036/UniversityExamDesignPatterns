package bg.university.exam.power;

import bg.university.exam.student.ExamParticipant;

public class SuperConcentration extends StudentPowerDecorator {

    public SuperConcentration(ExamParticipant participant) {
        super(participant);
    }

    @Override
    public String getDescription() {
        return participant.getDescription() + " + свръхконцентрация";
    }

    @Override
    public void solveTask() {
        participant.solveTask();
        System.out.println("Използва свръхконцентрация и не се разсейва по време на контролното.");
    }
}