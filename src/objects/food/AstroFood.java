package objects.food;

public abstract class AstroFood implements IEatable, ISmellable{
    private String name;
    private BeEaten foodeaten;
    private BeFresh freshness;
    private BeHotCold tempeture;

    public AstroFood(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }


    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public boolean changeEaten(BeEaten foodeaten){
        this.foodeaten = foodeaten;
        System.out.println(this.getName() + " " + this.foodeaten);
        return true;
    }
    public boolean changeFreshness(BeFresh freshness){
        this.freshness = freshness;
        System.out.println(this.getName() + " " + this.freshness);
        return true;
    }
    public boolean changeTempeture(BeHotCold tempeture){
        this.tempeture = tempeture;
        System.out.println(this.getName() + " " + this.tempeture);
        return true;
    }
}
//сделать абстрактным, затем наследовать или сделать с вложенными классами\\
//добавить классы
// астрономическая котлетка, космическая сосиска, трубочки супа, трубочки с голубцами, трубочка с киселем\\
//сделать все продукты вложенными или частями класса холодильник, куда их поместить и наделить свойством\\
// портиться, быть холодным или горячим, доеденными и недоеденными\\