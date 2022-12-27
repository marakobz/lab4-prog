package objects.solarSystem;

public enum StatusOfFarness {
    TOTHEMOON("к Луне"),
    INTHEMIDDLEOFSPACE("где-то в космосе"),
    FROMTHEEARTH("от Земли до Луны около четырехсот тысяч километров");

    private final String way;
    StatusOfFarness(String way){
        this.way = way;
    }
    @Override
    public String toString(){
        return way;
    }
}
