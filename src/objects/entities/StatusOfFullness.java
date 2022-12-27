package objects.entities;

public enum StatusOfFullness {
    HUNGRY("не ел"),
    FULL("наелся досыта"),
    SLIGHTLYHUNGRY("немного голоден");

    private final String fullness;
    StatusOfFullness(String fullness){
        this.fullness = fullness;
    }
    @Override
    public String toString(){
        return fullness;
    }
}
