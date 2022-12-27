package objects.UncertainThings;

import objects.solarSystem.StatusOfFarness;
import objects.solarSystem.Universe;

public class Way extends Universe {
    public Way() {
        super("Путь");
    }
    private StatusOfFarness way;
    public boolean haveway(StatusOfFarness way){
        this.way = way;
        System.out.println(this.getName() + " " + this.way);
        return true;
    }
}
