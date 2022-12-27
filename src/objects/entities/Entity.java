package objects.entities;


import objects.Rocket.Bed;
import story.ForStory;

public abstract class Entity implements ForStory {
    private String name;
    private StatusOfSleep sleep;
    private StatusOfFullness fullness;
    private StatusOfHunger hunger;

    public Entity(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void connectToStory(){
        System.out.println(this.getName()+" присоединяется к рассказу");
    }
    public void say(String phrase){
        System.out.println(this.getName() + ": " + phrase);
    }

    public void fallinsleep(Bed bed){
        System.out.println(this.getName() + " имеет способность заснуть в любой позе в невесомости, не укладываясь в " + bed.getName());
    }
    public boolean changeSleep(StatusOfSleep sleep){
        this.sleep = sleep;
        System.out.println(this.getName() + " " + this.sleep);
        return true;
    }
    public boolean changeFullness(StatusOfFullness fullness){
        this.fullness = fullness;
        System.out.println(this.getName() + " " + this.fullness);
        return true;
    }
    public boolean changeHunger(StatusOfHunger hunger){
        this.hunger = hunger;
        System.out.println(this.getName() + " " + this.hunger);
        return true;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
//дд заснуть в любой позе в невесомости, не укладываясь в + кровать(класс)\\
//добавить статус насыщения и голода, сонливости и выспанности\\