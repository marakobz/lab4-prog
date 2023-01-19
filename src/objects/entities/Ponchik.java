package objects.entities;

import objects.Rocket.Rooms;
import objects.UncertainThings.DayChange;
import objects.UncertainThings.TimeOfDay;
import objects.food.AstroFood;
import objects.solarSystem.Earth;
import story.Position;

public class Ponchik extends Entity implements CharacterActionable,IThinkable, INoisiable {
    private Position position;

    public Ponchik(){
        super("Пончик");
        this.connectToStory();
    }

    public void tospin(DayChange.Night night){
        System.out.println(this.getName() + " прокувыркался всю  " + night.getName() + this.position);
    }
    public void tobesure(Earth earth) {
        System.out.println(this.getName() + " убедился, что о возвращении на " + earth.getName() + " не может быть и речи");
    }
    public void calmdown(){
        System.out.println(this.getName() + " по-немногу успокоился");
    }

    public void beserious(){
        System.out.println(this.getName() + " решил не теряться и отнесся к делу со всей серьезностью");
    }

    public void checkfood(){
        System.out.println(this.getName() + " провел ревизиюю и качество продуктов");
    }

    public void eat(Rooms.FoodRoom foodRoom){
        System.out.println(this.getName() + " съел по одной порции каждого блюда из " + foodRoom.getName());
    }

    public void fallenasleep(AstroFood.AstroSausage astroSausage, HumanBody.Mounth mounth){
        System.out.println(this.getName() + " заснул с " + astroSausage.getName() + " во " + mounth.getName());
    }

    public void sleepless(DayChange.Night night){
        System.out.println(this.getName() + " спал мало в " + night.getName());
    }

    public void tookout(AstroFood.Soup soup, AstroFood.Slush slush, AstroFood.MeatCabbage meatCabbage){
        System.out.println(this.getName() + " проснулся и жует что-то с аппетитом, достал из термостата " + soup.getName() + ", " + slush.getName() + ", " + meatCabbage.getName());
    }

    public void finishmeal(){
        System.out.println(this.getName() + " покончил с обедом");
    }

    public void relax(HumanBody.Hands hands, HumanBody.Leg leg, Rooms.FoodRoom foodRoom){
        System.out.println(this.getName() + " заснул и повис посреди " + foodRoom.getName() + " , разбросал в стороны" + hands.getName() + " и " + leg.getName());
    }

    public void totremble(Neznaika neznaika, HumanBody.Shoulder shoulder){
        System.out.println(this.getName() +  " стал тормошить " + neznaika.getName() + " за " + shoulder.getName());
    }
    @Override
    public void tobe() {
        System.out.println(this.getName() + " существует");
    }

    @Override
    public void ridespaceship() {
        System.out.println(this.getName() + " умеет управлять ракетой");
    }

    public boolean changePos(Position position){
        this.position = position;
        System.out.println(this.getName() + " " + this.position);;
        return true;
    }


    public void think(String thought) {}

    @Override
    public void noise() {}
}
