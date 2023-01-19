package objects.Rocket;

import objects.entities.HumanBody;
import objects.entities.Neznaika;
import objects.solarSystem.Universe;

public class RocketEngine extends Universe {
    private String name;
    public RocketEngine(){
        super("Двигатель ракеты");
    }
    public void tobeloud(){
        System.out.println(this.getName() + " шумит");
    }
    public void towhisper(HumanBody.Ear ear){
        System.out.println(this.getName() + " шепчет на " + ear.getName());
    }

    public void makecalm(Neznaika neznaika){
        System.out.println("звуки убаюкивали" + neznaika.getName());
    }
    public void sayS(String phrase){
        System.out.println(this.getName() + ": " + phrase);
    }

    private class Sounds extends RocketEngine{
        @Override
        public void makecalm(Neznaika neznaika){
            System.out.println("звуки убаюкивали" + neznaika.getName());
        }
    }
}
