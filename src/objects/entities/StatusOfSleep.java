package objects.entities;

public enum StatusOfSleep {
    AWAKE("подроствует"),
    SLIGHTLYSLEEPY("сонный"),
    ASLEEP("во снах"),
    COMPLETELYASLEEP("видит 10-й сон");


    private final String sleep;
    StatusOfSleep(String sleep){
        this.sleep = sleep;
    }
    @Override
    public String toString(){
        return sleep;
    }
}
