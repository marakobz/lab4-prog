package objects.entities;

import objects.Rocket.FoodRoom;
import objects.entities.Entity;

public class Friends extends Entity implements IThinkable {
    public Friends() {
        super("Друзья");
    }
    private FoodRoom foodroom;

    public void getdown(FoodRoom foodroom){
        System.out.println(this.getName() + " спустились вниз в " + foodroom);
    }
    public void starteating(){
        System.out.println(this.getName() + " принялись обедать");
    }

    @Override
    public void think(String thought) {
    }
}
//прописать связь между незнайкой и пончиком, объеденить их\\
//добавить действие спустились + место спуска(пищевой отсек)\\
// дд принялись обедать//
