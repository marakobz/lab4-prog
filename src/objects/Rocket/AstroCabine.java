package objects.Rocket;

import objects.solarSystem.Universe;

public class AstroCabine extends Universe {
    private String name;
    public AstroCabine(){
        super("Астрономическая кабина");
    }
    public void befull(){
        System.out.println(this.getName()+ " наполненна");
    }
    public void beempty(){
        System.out.println(this.getName() + " пуста");
    }
}
