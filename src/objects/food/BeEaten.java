package objects.food;
public enum BeEaten{
    EATEN("съедена"),
    NOFULLYEATEN("недоеденна"),
    UNTOUCHED("не тронута");

    private final String foodeaten;
    BeEaten(String foodeaten){
        this.foodeaten = foodeaten;
    }
    @Override
    public String toString() {
        return foodeaten;
    }
}
