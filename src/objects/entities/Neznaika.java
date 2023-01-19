package objects.entities;

import objects.Rocket.Furniture;
import objects.Rocket.RocketEngine;
import objects.Rocket.Rooms;
import objects.food.AstroFood;
import objects.solarSystem.Moon;
import story.Position;


public class Neznaika extends Entity implements CharacterActionable, IThinkable, INoisiable{

    public Neznaika() {
        super("Незнайка");
        this.connectToStory();
    }
    private Position position;
    private StatusOfHunger hunger;

    public void allowtorest(Ponchik ponchik) {
        System.out.println(this.getName() + " решил дать " + ponchik.getName() +"отдохнуть");
    }

    public void togo() {
        System.out.println(this.getName() + " отправился " + this.position);
    }

    public void topeep(Moon moon) {
        System.out.println(this.getName() + " взглянул на " + moon.getName() );
    }

    public void notice() {
        System.out.println(this.getName() + " замечает такие подробности, которых не замечал раньше");
    }

    public void neversaw(Moon moon) {
        System.out.println(this.getName() + " не смотрел раньше внимательно на " + moon.getName());
    }

    public void fly(Moon moon) {
        System.out.println(this.getName() + " подлетел к " + moon.getName());
    }

    public void tostartlooking(Moon moon) {
        System.out.println(this.getName() + " стал смотреть на " + moon.getName() + " внимательно");
    }

    public void dontwanttoeat(){
        System.out.println(this.getName()+ " не хотел есть");
    }
    public void ateforcompany(AstroFood.Astromeat astromeat){
        System.out.println(this.getName()+ " съел за компанию "+ astromeat.getName());
    }
    public void watchedthemoon(Moon moon){
        System.out.println(this.getName()+ " смотел на " + moon.getName() + " и не мог оторваться");
    }
    public void behungry(HumanBody.Tummy tummy){
        System.out.println(this.getName()+ " почувствовал " + this.hunger + " в " + tummy.getName());
    }
    public void timetoeat(Rooms.FoodRoom foodroom, Ponchik ponchik){
        System.out.println(this.getName()+ " сообразил что пора обедать, спустился в " + foodroom.getName() + " и увидел " + ponchik.getName());
    }
    public void followexample(Ponchik ponchik){
        System.out.println(this.getName() + " решил последовать примеру " + ponchik.getName());
    }
    public void dontlike(HumanBody.Hands hands){
        System.out.println(this.getName() + " не нравилось, что " + hands.getName() + " во время сна разъезжаются в стороны");
    }
    @Override
    public void tobe() {
        System.out.println(this.getName() + " существует");
    }

    public void putfoot(Furniture.Chair chair, HumanBody.Leg leg){
        System.out.println(this.getName() + " заложил " + leg.getName() + " за " + leg.getName() + " , как будто сидел на  " + chair.getName());
    }

    public void puthands(HumanBody.Hands hands){
        System.out.println(this.getName() + " сложил " + hands.getName() + " кренделем");
    }
    public void trytosleep(){
        System.out.println(this.getName() + " приняв позу, стал пытаться заснуть");
    }

    public void tolisten(RocketEngine rocketEngine){
        System.out.println(this.getName() + " прислушивался " + rocketEngine.getName());
    }

    public void tofeel(){
        System.out.println(this.getName() + " казалось всякое");
    }

    public void tofallasleep(){
        System.out.println(this.getName() + " заснул");
    }
    public void tobetrembled(HumanBody.Shoulder shoulder){
        System.out.println(this.getName() + " почувствовал тормошение за " + shoulder.getName());
    }

    public void openeyes(Ponchik ponchik, HumanBody.Eyes eyes){
        System.out.println(this.getName() + " открыл " + eyes.getName() + " и увидел " + ponchik.getName());
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
    public boolean changeHunger(StatusOfHunger hunger){
        this.hunger = hunger;
        System.out.println(this.getName() + " " + this.hunger);
        return true;
    }

    public void think(String thought) {}

    @Override
    public void noise() {}
}
