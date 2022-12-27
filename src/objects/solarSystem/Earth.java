package objects.solarSystem;

public class Earth extends Universe implements AbleToHaveSurface {
    public Earth(){
        super("Земля");
        this.connectToStory();
    }
    @Override
    public void havesurface() {
        System.out.println(this.getName() + " имеет поверхность с людьми");
    }
}

