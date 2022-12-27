package story;

public enum Position {
    INSPACE("в космосе"),
    OUTOFSPACESHIP("не в астрономической кабине"),
    INASTROCABINE("в астрономической кабине"),

    INSPACESHIP("на корабле");

    private final String position;
    Position(String position){
        this.position = position;
    }

    @Override
    public String toString() {
        return position;
    }
}
