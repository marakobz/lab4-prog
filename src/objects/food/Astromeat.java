package objects.food;


public class Astromeat extends AstroFood {
    public Astromeat() {
        super("астрономическая котлетка");
    }

    @Override
    public void eat() {
        System.out.println(this.getName() + " можно есть");
    }

    @Override
    public void besmelled() {
        System.out.println(this.getName() + " можно понюхать");

    }
}
