package objects.solarSystem;


public class Sun extends Universe implements AbleToHaveSurface {
    public Sun(){
        super("Cолнце");
        this.connectToStory();
    }
    public void toshine(){
        System.out.println(this.getName() + " было такого же размера, каким оно обычно видно с Земли");
    }

    public void shinebright(){
        System.out.println(this.getName() + " ослепительно сияет");
    }

    @Override
    public void havesurface() {
        System.out.println(this.getName()+" имеет огненную поверхность");
    }

}
