package objects.UncertainThings;

public abstract class TimeOfDay {
    private String name;
    public TimeOfDay(String name){
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
}

//прописать изменение времени суток и вытекающие штуки такие как ночью темно, днем светло,
//добавить сравнение суток
//сделатт исключение
