package objects.solarSystem;

public enum MoonAdj {
    SILVER("серебристая"),
    BRIGHT("яркая");

    private final String adj;
    MoonAdj(String adj){
        this.adj = adj;
    }
    @Override
    public String toString(){
        return adj;
    }
}
