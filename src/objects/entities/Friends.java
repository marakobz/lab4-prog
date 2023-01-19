package objects.entities;

import objects.Rocket.Illuminators;
import objects.Rocket.Rooms;
import objects.solarSystem.Sky;
import objects.solarSystem.SkyAdj;

public class Friends extends Entity implements IThinkable {
    public Friends() {
        super("Друзья");
    }
    private SkyAdj adjj;

    public void getup(Rooms.AstroCabine astroCabine){
            System.out.println(this. getName() + " быстро поднялись в " + astroCabine.getName());
    }

    public void saw(Illuminators.SideWindows sideWindows, Sky sky){
        System.out.println(this.getName() + " , посмотрев в "+ sideWindows.getName() + " , увидели вокруг " + sky.getName() + this.adjj);
    }
    public void getdown(Rooms.FoodRoom foodroom){
        System.out.println(this.getName() + " спустились вниз в " + foodroom.getName());
    }
    public void starteating(){
        System.out.println(this.getName() + " принялись обедать");
    }


    public void think(String thought) {
    }

    public boolean haveadjj(SkyAdj adjj){
        this.adjj = adjj;
        System.out.println(this.getName() + " " + this.adjj);;
        return true;
    }

}

