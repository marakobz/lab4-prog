package objects.Rocket;

public class Illuminators extends Raketa implements IClosable, IOpenable{
    private String name;
    public Illuminators(){
        this.name = "Иллюминаторы";
    }

    public static class SideWindows extends Illuminators{
        private String name;
        public SideWindows(){
            this.name = "боковые иллюминаторы";
        }
    }

    public static class UpWwindows extends Illuminators{
        private String name;
        public UpWwindows(){
            this.name = "верхние иллюминаторы";
        }
    }
    public void open(){
        System.out.println(this.getName() + " открываются ");
    }

    public void close(){
        System.out.println(this.getName() + " закрываются");
    }
}
