package bg.university.exam.student;

public enum StudentType {
    WUNDERKIND("вундеркинд"),
    FITNESS_MANIAC("фитнес маниак"),
    LUCKY("калитко");

    private final String displayName;

    StudentType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}