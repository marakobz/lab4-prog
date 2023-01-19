package objects.food;


public abstract class AstroFood implements IEatable, ISmellable{
    private String name;
    private BeEaten foodeaten;
    private BeFresh freshness;
    private BeHotCold tempeture;

    public AstroFood(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public static class Astromeat extends AstroFood{
        public Astromeat() {
            super("астрономическая котлетка");
        }
    }

    public static class AstroSausage extends AstroFood{
        public AstroSausage() {
            super("космическая сосиска");
        }
    }

    public static class MeatCabbage extends AstroFood{
        public MeatCabbage(){
            super("трубочки с голубцами");
        }
    }

    public static class Slush extends AstroFood{
        public Slush() {
            super("киселевая жижа");
        }
    }

    public static class Soup extends AstroFood{
        public Soup() {
            super("трубочки с супом");
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

    public boolean changeEaten(BeEaten foodeaten){
        this.foodeaten = foodeaten;
        System.out.println(this.getName() + " " + this.foodeaten);
        return true;
    }
    public boolean changeFreshness(BeFresh freshness){
        this.freshness = freshness;
        System.out.println(this.getName() + " " + this.freshness);
        return true;
    }
    public boolean changeTempeture(BeHotCold tempeture){
        this.tempeture = tempeture;
        System.out.println(this.getName() + " " + this.tempeture);
        return true;
    }

    @Override
    public void eat() {
        System.out.println(this.getName() + " можно есть");
    }

    @Override
    public void besmelled() {
        System.out.println(this.getName() + " можно понюхать");

    }
}
