package bg.university.exam.power;

import bg.university.exam.student.ExamParticipant;

public class FastWriting extends StudentPowerDecorator {

    public FastWriting(ExamParticipant participant) {
        super(participant);
    }

    @Override
    public String getDescription() {
        return participant.getDescription() + " + бързопис";
    }

    @Override
    public void solveTask() {
        participant.solveTask();
        System.out.println("Използва бързопис и попълва отговорите светкавично.");
    }
}