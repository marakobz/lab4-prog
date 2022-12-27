package objects.Rocket;

import objects.solarSystem.Universe;

public class Illuminators extends Universe {
    private String name;
    public Illuminators(){
        super("Иллюминаторы");
    }
    public void open(){
        System.out.println(this.getName() + " открываются ");
    }

    public void close(){
        System.out.println(this.getName() + " закрываются");
    }
}
