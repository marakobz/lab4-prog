package objects.solarSystem;


public class Sky extends Universe {
    public Sky(){
        super("Небо");
        this.connectToStory();
    }

    public void togetdarker(){
        System.out.println(this.getName() + " чернело со звездами");
    }
}
//добавить енам в небо что оно черное и бездонное, усенянное крупными здвездами\\