import objects.Rocket.*;
import objects.UncertainThings.Way;
import objects.entities.Neznaika;
import objects.entities.Ponchik;
import objects.entities.StatusOfFullness;
import objects.entities.StatusOfHunger;
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
        var AstroCabine = new AstroCabine();
        var Earth = new Earth();
        var Astromeat = new Astromeat();
        var FoodRoom = new FoodRoom();
        var Chair = new Chair();
        var Bed = new Bed();
        var Soup = new Soup();
        var Slush = new Slush();
        var MeatCabbage = new MeatCabbage();
        var RocketEngine = new RocketEngine();

        System.out.println();

        Neznaika.ateforcompany(Astromeat);
        Neznaika.changeHunger(StatusOfHunger.DEADHUNGRY);
        Neznaika.timetoeat(FoodRoom);
        Neznaika.followexample(Ponchik);
        Astromeat.changeEaten(BeEaten.UNTOUCHED);
        Chair.changeComfort(StatusOfComfortness.COMFORTABLE);
        Bed.changeSoft(StatusOfSoftness.HARD);
        Ponchik.changeFullness(StatusOfFullness.SLIGHTLYHUNGRY);
        Ponchik.tookout(Soup,Slush,MeatCabbage);
        Ponchik.totremble(Neznaika);
        Ponchik.say("Я должен провести ревизию в пишевом отсеке и проверить качество продуктов");
        Soup.eat();
        Moon.getlook(Neznaika);
        Neznaika.fallinsleep(Bed);


        Illuminators.open();
        AstroCabine.beempty();

        Earth.havesurface();

        Ponchik.tobe();
        Ponchik.changePos(Position.INSPACESHIP);
        AstroCabine.befull();
        Ponchik.ridespaceship();
        Ponchik.tospin();
        Ponchik.changePos(Position.OUTOFSPACESHIP);
        AstroCabine.beempty();

        Neznaika.tobe();
        Neznaika.ridespaceship();
        Neznaika.changePos(Position.INSPACE.INSPACESHIP);
        AstroCabine.befull();
        Illuminators.close();
        Neznaika.allowtorest();
        Neznaika.togo();
        Neznaika.changePos(Position.INASTROCABINE);
        Raketa.havespeed(StatusOfSpeed.SLOW);
        Neznaika.topeep();
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
        Neznaika.neversaw();
        Raketa.havespeed(StatusOfSpeed.FAST);
        Neznaika.fly();
        Neznaika.tostartlooking();
        Raketa.havespeed(StatusOfSpeed.SCARYFAST);
        Raketa.havespeed(StatusOfSpeed.SPEEDINPROCESS);

        Raketa.dontmove();
        Way.haveway(StatusOfFarness.FROMTHEEARTH);


        System.out.println("Рассказ завершен");
    }
}