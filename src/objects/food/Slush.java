package objects.food;

import objects.food.AstroFood;

public class Slush extends AstroFood {
    public Slush() {
        super("киселевая жижа");
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
