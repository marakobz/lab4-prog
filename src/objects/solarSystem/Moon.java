package objects.solarSystem;


import objects.Rocket.Illuminators;
import objects.entities.Neznaika;

public class Moon extends Universe implements AbleToHaveSurface {

    private MoonAdj adj;
    private StatusOfFarness way;

    public Moon(){
        super("Луна");
        this.connectToStory();
    }
    public void tobecome(){
        System.out.println(this.getName() + " сделалась уже вдвое больше");
    }
    public void havesurface(){System.out.println(this.getName() + "имеет поверхность с лунками");}

    public void shine(Illuminators illuminators){
        System.out.println(this.getName() + " светится в " + illuminators.getName());
    }
    public void bebigger(){
        System.out.println(this.getName() + " казалась крупнее");
    }

    public void getlook(Neznaika neznaika){
        System.out.println(this.getName() + " притягивала взоры " + neznaika.getName());
    }
    public boolean haveadj(MoonAdj adj){
        this.adj = adj;
        System.out.println(this.getName() + " " + this.adj);;
        return true;
    }

    public boolean changepos(StatusOfFarness way){
        this.way = way;
        System.out.println(this.getName() + " " + this.way);
        return true;
    }

}
//добавить действие светиться и место где происходит(в иллюминаторах)\\
//добавить действие казалась крупнее, добавить что -то про дальность от земли до луны
//дд притягивала взоры + незнайки(класс)\\