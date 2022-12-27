package objects.food;

import objects.food.AstroFood;

public class Soup extends AstroFood {
    public Soup() {
        super("трубочки с супом");
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
