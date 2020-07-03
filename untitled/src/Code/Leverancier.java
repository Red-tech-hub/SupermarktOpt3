package Code;

public class Leverancier {
    private String leverancier;
    private String goederen;
    private String hoeveelheid;
    private String tijd;

    public Leverancier(String leverancier, String goederen, String hoeveelheid, String tijd) {
        this.leverancier = leverancier;
        this.goederen = goederen;
        this.hoeveelheid = hoeveelheid;
        this.tijd = tijd;
    }

    public String getLeverancier() {
        return leverancier;
    }


    public String getGoederen() {
        return goederen;
    }


    public String getHoeveelheid() {
        return hoeveelheid;
    }


    public String getTijd() {
        return tijd;
    }

    @Override
    public String toString() {
        return leverancier;
    }
}
