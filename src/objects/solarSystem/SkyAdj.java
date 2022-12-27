package objects.solarSystem;

public enum SkyAdj {
    BLACK("чёрное"),
    BOTTOMLESS("бездонное"),
    WITHBIGSTARS("усеянное крупными звездами");

    private final String adj;
    SkyAdj(String adj){
        this.adj = adj;
    }
    @Override
    public String toString(){
        return adj;
    }
}
