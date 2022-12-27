package objects.food;

public class AstroSausage extends AstroFood {
    public AstroSausage() {
        super("космическая сосиска");
    }

    @Override
    public void eat() {
        System.out.println(this.getName() + "съеденобно");

    }

    @Override
    public void besmelled() {
        System.out.println(this.getName() + " можно понюхать");
    }
}
