package objects.solarSystem;

public class Planet {
    public void exist(){
        System.out.println("существует в пространстве космоса");
    }

    public class BlackHole extends Planet{
        @Override
        public void exist(){
            System.out.println("Черная дыра не планета, но она тоже существует");
        }
    }
}
