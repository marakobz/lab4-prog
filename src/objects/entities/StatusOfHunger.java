package objects.entities;

public enum StatusOfHunger {
    NOTHUNGRY("сыт"),
    ALITTLEBITHUNGRY("немного голоден"),
    NORMALLYHUNGRY("голоден"),
    DEADHUNGRY("умирает сголоду");

    private final String hunger;
    StatusOfHunger(String hunger){
        this.hunger = hunger;
    }
    @Override
    public String toString(){
        return hunger;
    }
}
