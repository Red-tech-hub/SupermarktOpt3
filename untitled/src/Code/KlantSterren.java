package Code;

public class KlantSterren extends Sterren {
    //Long parameter list voorkomen door het splitsen van sterren in klantsterren en leverancierssterren
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
