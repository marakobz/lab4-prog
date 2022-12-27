package objects.Rocket;

public enum StatusOfSpeed {
    MEDIUM("средняя скорость"),
    SLOW("низкая скорость"),
    FAST("быстрая скорость"),
    SPEEDINPROCESS("12 км/с"),
    SCARYFAST("страшно быстрая скорость");

    private final String speed;
    StatusOfSpeed(String speed){
        this.speed = speed;
    }
    @Override
    public String toString(){
        return speed;
    }
}
