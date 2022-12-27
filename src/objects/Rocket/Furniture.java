package objects.Rocket;

public abstract class Furniture {
    private String name;
    private StatusOfComfortness comfortness;
    private StatusOfSoftness softness;
    public Furniture(String name){
        this.name = name;
    }
    public String getName(){
        return name;
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
    public boolean changeComfort(StatusOfComfortness comfortness){
        this.comfortness = comfortness;
        System.out.println(this.getName() + " " + this.comfortness);
        return true;
    }
    public boolean changeSoft(StatusOfSoftness softness){
        this.softness = softness;
        System.out.println(this.getName() + " " + this.softness);
        return true;
    }
}
//добавить вложенные классы кровать и стул, наделить\\
// их степенью мягкости и удобства\\
//свзять удобство с комфортом через сравнение или исключение