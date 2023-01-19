package objects.solarSystem;


public class Sky extends Universe {
    public Sky(){
        super("Небо");
        this.connectToStory();
    }

    public static class Stars extends Sky{
        private String name;
        public Stars(){
            this.name = "звёзды";
        }
        public void be(Sun sun){
            System.out.println("Если " + this.name +  " есть, то нет " + sun.getName());
        }
    }
    public void togetdarker(){
        System.out.println(this.getName() + " чернело со звездами");
    }
}
