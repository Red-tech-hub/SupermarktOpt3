package Code;

public class LeveranciersSterren extends Sterren{
    private Leverancier leverancier;

    public LeveranciersSterren(Leverancier leverancier, Integer ster) {
        super(ster);
        this.leverancier = leverancier;
    }

    public LeveranciersSterren() {

    }

    public Leverancier getLeverancier() {
        return leverancier;
    }
}
