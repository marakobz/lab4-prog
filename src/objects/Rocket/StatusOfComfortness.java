package objects.Rocket;

public enum StatusOfComfortness {
    COMFORTABLE("имеет удобную поверхность"),
    UNCOMFORTABLE("имеет жесткую поверхность");

    private final String comfortness;
    StatusOfComfortness(String comfortness){
        this.comfortness = comfortness;
    }
    @Override
    public String toString() {
        return comfortness;
    }
}
