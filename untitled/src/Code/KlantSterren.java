package Code;

public class KlantSterren extends Sterren {
    private Klant klant;

    public KlantSterren(Integer ster, Klant klant) {
        super(ster);
        this.klant = klant;
    }

    public KlantSterren() {

    }

    public Klant getKlant() {
        return klant;
    }
}
