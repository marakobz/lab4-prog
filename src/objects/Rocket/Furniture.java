package objects.Rocket;

public abstract class Furniture implements ISittable, ILayable{
    private String name;
    private StatusOfComfortness comfortness;
    private StatusOfSoftness softness;
    public Furniture(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public static class Bed extends Furniture{
        public  Bed() {
                super("Кровать");
            }

        @Override
        public void setean() {
            System.out.println("может быть использована для сидения");
        }

        @Override
        public void lay() {
            System.out.println("может быть использован для лежания");
        }
    }

    public static class Chair extends Furniture{
        public Chair() {
            super("Стул");
        }
        @Override
        public void setean() {
            System.out.println("может быть использован для сидения");
        }

        @Override
        public void lay() {
            System.out.println("может быть использован для лежания");

        }
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
