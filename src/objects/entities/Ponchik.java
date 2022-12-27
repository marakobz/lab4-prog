package objects.entities;

import objects.Rocket.FoodRoom;
import story.Position;
import objects.UncertainThings.Night;
import objects.food.AstroSausage;
import objects.food.MeatCabbage;
import objects.food.Slush;
import objects.food.Soup;

public class Ponchik extends Entity implements CharacterActionable,IThinkable, INoisiable {
    private Position position;

    public Ponchik(){
        super("Пончик");
        this.connectToStory();
    }

    public void tospin(){
        System.out.println(this.getName() + " прокувыркался всю ночь " + this.position);
    }
    public void tobesure() {
        System.out.println(this.getName() + " убедился");
    }
    public void calmdown(){
        System.out.println(this.getName() + " успокоился");
    }

    public void beserious(){
        System.out.println(this.getName() + " решил не теряться и отнесся к делу со всей серьезностью");
    }

    public void checkfood(){
        System.out.println(this.getName() + " провел ревизиюю и качество астрономических продуктов");
    }

    public void eat(FoodRoom foodRoom){
        System.out.println(this.getName() + " съел по одной порции каждого блюда из " + foodRoom.getName());
    }

    public void fallenasleep(AstroSausage astroSausage){
        System.out.println(this.getName() + " заснул с " + astroSausage.getName());
    }

    public void sleepless(Night night){
        System.out.println(this.getName() + " спал мало в " + night.getName());
    }

    public void tookout(Soup soup, Slush slush, MeatCabbage meatCabbage){
        System.out.println(this.getName() + " проснулся и жует что-то с аппетитом, достал из термостата " + soup.getName() + ", " + slush.getName() + ", " + meatCabbage.getName());
    }

    public void finishmeal(){
        System.out.println(this.getName() + " покончил с обедом");
    }

    public void relax(){
        System.out.println(this.getName() + " повис посреди пищевого отсека, разбросал в стороны руки и ноги");
    }

    public void totremble(Neznaika neznaika){
        System.out.println(this.getName() +  " стал тормошить " + neznaika.getName());
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

    @Override
    public void think(String thought) {

    }

    @Override
    public void noise() {

    }
}
//добавить действие убедился, успокоился\\
//добавить StatusOfFulness который будет индикатором сытости перса\\
//добавть действие решил не теряться и отнесся к делу со всей серьезностью\\
//добавить реплику что-то типа Я должен провести ревизию в пишевом отсеке и проверить качество продуктов\\
//добавить действия провел ревизиюю и качество астрономических продуктов\\
//дд съел по одной порции каждого блюда из пишевого отсека\\
//добавить степень засыпания\\
//дд заснул с + сосиска(класс)\\
//дд спал мало + ночь(класс)\\
// дд проснулся и жует что-то с аппетитом, достал из термостата нексколько + суп, голубцы, кисель(классы)\\
//дд покончил с обедом\\, добавить реплику Для правильного пищеварения после обеда полагается немного всхрапнуть
//дд повис посреди пищевого отсека, разбросал в стороны руки и ноги\\
//дд тормошить за плечо + незнайку(класс)\\