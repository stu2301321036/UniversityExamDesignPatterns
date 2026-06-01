package bg.university.exam.power;

import bg.university.exam.student.ExamParticipant;

public abstract class StudentPowerDecorator implements ExamParticipant {
    protected final ExamParticipant participant;

    public StudentPowerDecorator(ExamParticipant participant) {
        this.participant = participant;
    }

    @Override
    public String getDescription() {
        return participant.getDescription();
    }

    @Override
    public void solveTask() {
        participant.solveTask();
    }
}