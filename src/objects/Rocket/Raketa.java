package objects.Rocket;

import objects.solarSystem.Universe;
import objects.solarSystem.StatusOfFarness;

public class Raketa extends Universe implements AbleToFly {
    public Raketa(){
        super("Ракета");
        this.connectToStory();
    }

    private StatusOfFarness way;

    public boolean haveway(StatusOfFarness way){
        this.way = way;
        System.out.println(this.getName() + " летит " + this.way);
        return true;
    }
    private StatusOfSpeed speed;
    public void dontmove(){
        System.out.println(this.getName() + " не приближается к Луне");
    }

    @Override
    public void fly() {
        System.out.println(this.getName() + " летит ");
    }
    public boolean havespeed(StatusOfSpeed speed){
        this.speed = speed;
        System.out.println(this.getName() + " имеет " + this.speed);
        return true;
    }

}
