package objects.entities;

import javax.swing.plaf.PanelUI;

public abstract class HumanBody{
    private String name;
    public HumanBody(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public static class Mounth extends HumanBody{
        public Mounth(){
            super("рот");
        }
    }

    public static class Leg extends HumanBody{
        public Leg(){
            super("нога");
        }
    }

    public static class Hands extends HumanBody{
        public Hands(){
            super("руки");
        }
    }

    public static class Tummy extends HumanBody{
        public Tummy(){
            super("живот");
        }
    }

    public static class Ear extends HumanBody{
        public Ear(){
            super("ухо");
        }
    }

    public static class Shoulder extends HumanBody{
        public Shoulder(){
            super("плечо");
        }
    }

    public static class Eyes extends HumanBody{
        public Eyes(){
            super("глаза");
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
