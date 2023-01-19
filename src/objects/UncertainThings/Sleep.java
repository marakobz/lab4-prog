package objects.UncertainThings;

import objects.entities.Ponchik;

public class Sleep {
    private String name;
    public Sleep(){
        this.name = "сон";
    }
    public void makesleepy(Ponchik ponchik){
        System.out.println("Задача оказалась непосильной, и " + this.name + " сморил " + ponchik.getName());
    }
}
