package objects.Rocket;

public enum StatusOfSoftness {
    HARD("имеет жесткую обивку"),
    LIKEONCLOUD("имеет обивку такую, что мягко как на облаке");

    private final String softness;
    StatusOfSoftness(String softness){
        this.softness = softness;
    }
    @Override
    public String toString() {
        return softness;
    }
}
