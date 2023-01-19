package objects.UncertainThings;

public class TimeSpeed {

    String name;
    boolean isSpeedSet;
    boolean isRocketActive;
    public TimeSpeed(String name){
        this.name = name;
    }
    public void putTime(){
        System.out.println("Время установлено");
        this.isSpeedSet = true;
    }
    public void putStart(){
        System.out.println("Начало полёта установлено");
        isRocketActive = true;
    }
    public void launchFly() throws TimeSpeedException {

        System.out.println("Собираемся на взлёт");
        if (isSpeedSet && isRocketActive) {
            System.out.println("Ура, полетели");
            throw new TimeSpeedException("Полёт отменился");
        }
    }
}
