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

    public void beseen(){
        System.out.println(this.getName() + " видно");
    }
    @Override
    public void havesurface() {
        System.out.println(this.getName()+" имеет огненную поверхность");
    }

}
//ослепительно сиет добавить действие\\
// видно добавить действие\\