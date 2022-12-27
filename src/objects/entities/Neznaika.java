package objects.entities;

import objects.Rocket.Chair;
import objects.Rocket.FoodRoom;
import objects.Rocket.RocketEngine;
import story.Position;
import objects.food.Astromeat;


public class Neznaika extends Entity implements CharacterActionable, IThinkable, INoisiable{

    public Neznaika() {
        super("Незнайка");
        this.connectToStory();
    }
    private Position position;
    private StatusOfHunger hunger;


    public void allowtorest() {
        System.out.println(this.getName() + " решил дать Пончику отдохнуть");
    }

    public void togo() {
        System.out.println(this.getName() + " отправился " + this.position);
    }

    public void topeep() {
        System.out.println(this.getName() + " взглянул на Луну" );
    }

    public void notice() {
        System.out.println(this.getName() + " замечает такие подробности, которых не замечал раньше");
    }

    public void neversaw() {
        System.out.println(this.getName() + " не смотрел раньше внимательно на Луну");
    }

    public void fly() {
        System.out.println(this.getName() + " подлетел к Луне" + this.position);
    }

    public void tostartlooking() {
        System.out.println(this.getName() + " стал смотреть на Луну внимательно");
    }

    public void dontwanttoeat(){
        System.out.println(this.getName()+ " не хотел есть");
    }
    public void ateforcompany(Astromeat astromeat){
        System.out.println(this.getName()+ " съел за компанию "+ astromeat.getName());
    }
    public void watchedthemoon(){
        System.out.println(this.getName()+ " смотел на луну и не мог оторваться");
    }
    public void behungry(){
        System.out.println(this.getName()+ " почувствовал " + this.hunger);
    }
    public void timetoeat(FoodRoom foodroom){
        System.out.println(this.getName()+ " сообразил что пора обедать, спустился в " + foodroom.getName());
    }
    public void followexample(Ponchik ponchik){
        System.out.println(this.getName() + " решил последовать примеру " + ponchik.getName());
    }
    public void dontlike(){
        System.out.println(this.getName() + " не нравилось, что руки во время сна разъезжаются в стороны");
    }
    @Override
    public void tobe() {
        System.out.println(this.getName() + " существует");
    }

    public void putfoot(Chair chair){
        System.out.println(this.getName() + " заложил ногу за ногу, как будто сидел на  " + chair.getName());
    }

    public void puthands(){
        System.out.println(this.getName() + " сложил руки кренделем");
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
    public void tobetrembled(){
        System.out.println(this.getName() + " почувствовал тормошение");
    }

    public void openeyes(Ponchik ponchik){
        System.out.println(this.getName() + " открыл глаза и увидел " + ponchik.getName());
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

    @Override
    public void think(String thought) {
    }

    @Override
    public void noise() {

    }
}
//добавить действие не хотел есть, съел для компании + астрономическую котлетку//
//дд всё смотрел на луну и не мог оторваться//
//дд почувстовал голод, привзять статус голодности и тд//
//сообразил что пора обедать, спустился + пишевой отсек(класс)\\
//дд решил последовать примеру + пончик(класс)\\
//дд не нравилось, что руки во время сна разъезжаются в стороны//
//дд заложил ногу за ногу, как будто сидел на + стул(класс)\\
//дд сложил руки кренжлем\\
//дд приняв позу, стал пытаться заснуть\\
//дд прислушивался к + реактивный двигатель(класс)\\
//дд казалось всякое\\
//дд заснул\\
//дд почуствовал тормошение\\
//дд открыл глаза и увидел + пончик(класс)\\