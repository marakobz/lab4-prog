package objects.UncertainThings;


public class TimeOfDay {
    String name;
    boolean isStarsAreHere;
    boolean isSunIsHere;
    public TimeOfDay(String name){
        this.name = name;
    }
    public void nightTime(){
        System.out.println("Звёзды светят, значит ночь");
        this.isStarsAreHere = true;
    }
    public void dayTime(){
        System.out.println("Солнце горит, значит день");
        isSunIsHere = true;
    }
    public void launchDay() throws TimeOfDayException {

        System.out.println("Собираемся прожить день");
        if (isSunIsHere) {
            System.out.println("Настал день");
            throw new TimeOfDayException("Наступила ночь");
        }
    }
    public void launchNight() throws TimeOfDayException {

        System.out.println("Собираемся проспать ночь");
        if (isStarsAreHere) {
            System.out.println("Наступила ночь, спим");
            throw new TimeOfDayException("Настал день, идём работать");
        }
    }

}
