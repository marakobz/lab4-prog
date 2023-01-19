package objects.Rocket;


public abstract class Rooms {
    private String name;
    public Rooms(String name){
        this.name = name;
    }

    public static class FoodRoom extends Rooms{
        public FoodRoom() {
            super("пищевой отсек");
        }
    }

    public static class AstroCabine extends Rooms{
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

}
