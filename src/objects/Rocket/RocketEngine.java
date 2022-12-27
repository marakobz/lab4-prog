package objects.Rocket;

import objects.solarSystem.Universe;

public class RocketEngine extends Universe {
    private String name;
    public RocketEngine(){
        super("Двигатель ракеты");
    }
    public void tobeloud(){
        System.out.println(this.getName() + " шумит");
    }
    public void towhisper(){
        System.out.println(this.getName() + " шепчет");
    }

    private class Sounds{
        public void makecalm(){
            System.out.println("звуки убаюкивали");
        }
    }
    public void bib(Sounds sounds){
        //System.out.println(this.getName() + sounds.g); //доработать
    }
}
//дд шумит, шепчет,\\
// добавить реплику
// добавить вложенный класс звуки и их действие убаюкали
