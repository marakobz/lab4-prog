package objects.food;

public enum BeHotCold{
    HOTASHELL("адски горяч"),
    HOT("горяч"),
    MIDDLE("тепленький"),
    COLD("холоден"),
    ICY("как лед");

    private final String tempeture;
    BeHotCold(String tempeture){
        this.tempeture = tempeture;
    }

    @Override
    public String toString() {
        return tempeture;
    }
}