package Code;

public class LeveranciersSterren extends Sterren{
    //code smell large class, leveranciersSterreb eb KlantSterren zijn hun eigen classes
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
