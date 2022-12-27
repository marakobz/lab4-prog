package objects.food;

public class MeatCabbage extends AstroFood {
    public MeatCabbage() {
        super("трубочки с голубцами");
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
