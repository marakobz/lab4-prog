package objects.solarSystem;

import story.ForStory;

public abstract class Universe implements ForStory{
    private String name;
    public Universe(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void connectToStory(){
        System.out.println(this.getName()+" присоединяется к рассказу");
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

