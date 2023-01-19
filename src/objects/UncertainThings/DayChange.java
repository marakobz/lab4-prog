package objects.UncertainThings;

public abstract class DayChange {
    private String name;
    public DayChange(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public static class Night extends DayChange{
        public Night() {
            super("ночь");
        }
    }

    public static class Day extends DayChange{
        public Day(){
            super("день");
        }
        public void felt(Night night){
            System.out.println("Казалось, что был " + this.getName() + " , но в то же время была " + night.getName());
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
}
