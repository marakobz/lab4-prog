import objects.Rocket.*;
import objects.UncertainThings.*;
import objects.entities.*;
import objects.food.*;
import story.Position;
import objects.solarSystem.*;

public class Main {
    public static void main(String args[]) {

        var Neznaika = new Neznaika();
        var Ponchik = new Ponchik();
        var Raketa = new Raketa();
        var Moon = new Moon();
        var Sky = new Sky();
        var Sun = new Sun();
        var Way = new Way();
        var Illuminators = new Illuminators();
        var AstroCabine = new Rooms.AstroCabine();
        var Earth = new Earth();
        var Astromeat= new AstroFood.Astromeat();
        var FoodRoom = new Rooms.FoodRoom();
        var Chair = new Furniture.Chair();
        var Bed = new Furniture.Bed();
        var Soup = new AstroFood.Soup();
        var Slush = new AstroFood.Slush();
        var MeatCabbage = new AstroFood.MeatCabbage();
        var RocketEngine = new RocketEngine();
        var Sounds = new RocketEngine();
        var Person = new Person("Незнайка", "пищевой отсек");
        var randomPlanet = new Planet(){
            @Override
            public void exist(){
                System.out.println("Рандомная планета существует где-то в космосе");
            }
        };
        var notRandomPlanet = new Planet().new BlackHole();
        var Night = new DayChange.Night();
        var Shoulder = new HumanBody.Shoulder();
        var TimeSpeed = new TimeSpeed("Скорость");

        TimeSpeed.putTime();
        TimeSpeed.putStart();
        try {
            TimeSpeed.launchFly();
        } catch (TimeSpeedException e){
            System.out.println(e.getMessage());
        }

        var TimeOfDay = new TimeOfDay("Время суток");
        TimeOfDay.dayTime();

        try{
            TimeOfDay.launchDay();
        } catch (TimeOfDayException e){
            System.out.println(e.getMessage());
        }
        TimeOfDay.nightTime();
        try {
            TimeOfDay.launchNight();
        } catch (TimeOfDayException e){
            System.out.println(e.getMessage());
        }

        var Friends = new Friends();
        var SideWindows = new Illuminators.SideWindows();
        var Day = new DayChange.Day();
        var UpIlluminators = new Illuminators.UpWwindows();
        var Sleep = new Sleep();
        var AstroSausage = new AstroFood.AstroSausage();
        var Mounth = new HumanBody.Mounth();
        var Tummy = new HumanBody.Tummy();
        var Hands = new HumanBody.Hands();
        var Leg = new HumanBody.Leg();
        var Ear = new HumanBody.Ear();
        var Eyes = new HumanBody.Eyes();
        var Stars = new Sky.Stars();

        System.out.println();

        randomPlanet.exist();
        notRandomPlanet.exist();
        Person.SpotContainer spot = Person.getSpotsContainer();
        System.out.println("Место: " + spot.getRoom());
        Chair.changeComfort(StatusOfComfortness.UNCOMFORTABLE);
        Chair.changeSoft(StatusOfSoftness.HARD);
        Chair.setean();
        Chair.lay();
        Bed.changeComfort(StatusOfComfortness.COMFORTABLE);
        Bed.changeSoft(StatusOfSoftness.LIKEONCLOUD);
        Bed.setean();
        Bed.lay();

        Neznaika.changeSleep(StatusOfSleep.AWAKE);
        Neznaika.changeFullness(StatusOfFullness.SLIGHTLYHUNGRY);
        Neznaika.changeHunger(StatusOfHunger.NOTHUNGRY);
        Ponchik.changeSleep(StatusOfSleep.AWAKE);
        Ponchik.changeHunger(StatusOfHunger.ALITTLEBITHUNGRY);

        Astromeat.changeEaten(BeEaten.UNTOUCHED);
        AstroSausage.changeEaten(BeEaten.UNTOUCHED);
        Soup.changeEaten(BeEaten.UNTOUCHED);
        Slush.changeEaten(BeEaten.UNTOUCHED);
        MeatCabbage.changeEaten(BeEaten.UNTOUCHED);

        Astromeat.changeFreshness(BeFresh.FRESH);
        AstroSausage.changeFreshness(BeFresh.FRESH);
        Soup.changeFreshness(BeFresh.FRESH);
        Slush.changeFreshness(BeFresh.FRESH);
        MeatCabbage.changeFreshness(BeFresh.FRESH);

        Astromeat.changeTempeture(BeHotCold.COLD);
        AstroSausage.changeTempeture(BeHotCold.COLD);
        Soup.changeTempeture(BeHotCold.COLD);
        Slush.changeTempeture(BeHotCold.COLD);
        MeatCabbage.changeTempeture(BeHotCold.COLD);

        Astromeat.eat();
        Astromeat.besmelled();
        AstroSausage.eat();
        AstroSausage.besmelled();
        Soup.eat();
        Soup.besmelled();
        Slush.eat();
        Slush.besmelled();
        MeatCabbage.eat();
        MeatCabbage.besmelled();

        Illuminators.open();
        AstroCabine.beempty();
        Earth.havesurface();
        Ponchik.tobe();
        Ponchik.ridespaceship();
        Neznaika.tobe();
        Neznaika.ridespaceship();

        Friends.getup(AstroCabine);
        Friends.saw(SideWindows,Sky);
        Stars.be(Sun);
        Friends.haveadjj(SkyAdj.BLACK.BOTTOMLESS.WITHBIGSTARS);
        Sun.shinebright();
        Day.felt(Night);
        Moon.shine(UpIlluminators);
        Moon.bebigger(Earth);

        Ponchik.tobesure(Earth);
        Ponchik.calmdown();
        Ponchik.say("Раз на Землю не вернуться, нужно найти себе занятие, пойду-ка в пищевой отсек");

        Friends.getdown(FoodRoom);

        Neznaika.dontwanttoeat();
        Neznaika.ateforcompany(Astromeat);

        Ponchik.beserious();
        Ponchik.say("Я должен провести ревизию в пищевом отсеке и проверить качество всех космических блюд");
        Ponchik.changeHunger(StatusOfHunger.DEADHUNGRY);
        Ponchik.checkfood();
        Ponchik.eat(FoodRoom);
        Sleep.makesleepy(Ponchik);
        Ponchik.fallenasleep(AstroSausage, Mounth);

        AstroSausage.changeEaten(BeEaten.NOFULLYEATEN);

        Ponchik.sleepless(Night);
        Ponchik.fallinsleep(Bed);

        Ponchik.changePos(Position.INSPACESHIP);
        AstroCabine.befull();

        Ponchik.tospin(Night);
        Ponchik.changePos(Position.OUTOFSPACESHIP);
        AstroCabine.beempty();

        Neznaika.changePos(Position.INSPACE.INSPACESHIP);
        AstroCabine.befull();
        Illuminators.close();
        Neznaika.allowtorest(Ponchik);
        Neznaika.togo();
        Neznaika.changePos(Position.INASTROCABINE);
        Raketa.havespeed(StatusOfSpeed.SLOW);
        Neznaika.topeep(Moon);
        Raketa.haveway(StatusOfFarness.TOTHEMOON);
        Raketa.havespeed(StatusOfSpeed.MEDIUM);

        Sky.togetdarker();
        Sun.toshine();
        Sun.havesurface();
        Moon.haveadj(MoonAdj.SILVER);
        Moon.haveadj(MoonAdj.BRIGHT);
        Moon.havesurface();
        Moon.changepos(StatusOfFarness.INTHEMIDDLEOFSPACE);
        Moon.tobecome();

        Neznaika.notice();
        Neznaika.neversaw(Moon);
        Raketa.havespeed(StatusOfSpeed.FAST);
        Neznaika.fly(Moon);
        Neznaika.tostartlooking(Moon);
        Raketa.havespeed(StatusOfSpeed.SCARYFAST);
        Raketa.havespeed(StatusOfSpeed.SPEEDINPROCESS);

        Raketa.dontmove();
        Way.haveway(StatusOfFarness.FROMTHEEARTH);

        Neznaika.watchedthemoon(Moon);
        Moon.getlook(Neznaika);
        Neznaika.behungry(Tummy);
        Neznaika.changeHunger(StatusOfHunger.NORMALLYHUNGRY);
        Neznaika.changeFullness(StatusOfFullness.HUNGRY);
        Neznaika.timetoeat(FoodRoom, Ponchik);

        Astromeat.changeFreshness(BeFresh.MIDDLEFRESH);
        AstroSausage.changeFreshness(BeFresh.MIDDLEFRESH);
        Soup.changeFreshness(BeFresh.MIDDLEFRESH);
        Slush.changeFreshness(BeFresh.MIDDLEFRESH);
        MeatCabbage.changeFreshness(BeFresh.MIDDLEFRESH);

        Soup.changeTempeture(BeHotCold.ICY);
        Soup.changeTempeture(BeHotCold.HOT);
        Slush.changeTempeture(BeHotCold.HOTASHELL);
        MeatCabbage.changeTempeture(BeHotCold.MIDDLE);

        Ponchik.tookout(Soup, Slush, MeatCabbage);
        Ponchik.changeSleep(StatusOfSleep.SLIGHTLYSLEEPY);

        Slush.changeEaten(BeEaten.EATEN);

        Friends.starteating();
        Ponchik.finishmeal();
        Ponchik.changeFullness(StatusOfFullness.FULL);
        Ponchik.say("Для правильного пищеварения после обеда полагается немного всхрапнуть");
        Ponchik.relax(Hands, Leg, FoodRoom);
        Ponchik.changeSleep(StatusOfSleep.ASLEEP);
        Ponchik.changeSleep(StatusOfSleep.COMPLETELYASLEEP);

        Astromeat.changeFreshness(BeFresh.SPOILED);
        AstroSausage.changeFreshness(BeFresh.SPOILED);
        Soup.changeFreshness(BeFresh.SPOILED);
        Slush.changeFreshness(BeFresh.SPOILED);
        MeatCabbage.changeFreshness(BeFresh.SPOILED);

        Neznaika.followexample(Ponchik);
        Neznaika.dontlike(Hands);
        Neznaika.putfoot(Chair, Leg);
        Neznaika.puthands(Hands);
        Neznaika.trytosleep();
        RocketEngine.tobeloud();
        Neznaika.tolisten(RocketEngine);
        Neznaika.tofeel();
        RocketEngine.towhisper(Ear);
        RocketEngine.sayS("Чаф-чафчаф-чаф");
        Sounds.makecalm(Neznaika);
        Neznaika.tofallasleep();
        Ponchik.totremble(Neznaika, Shoulder);
        Neznaika.tobetrembled(Shoulder);
        Neznaika.openeyes(Ponchik, Eyes);



        System.out.println("Рассказ завершен");
    }
}