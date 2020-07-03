package Code;

public class Veiligheid {
    private String werknemer;
    private Integer handschoenen;

    public Veiligheid(String werknemer, Integer handschoenen) {
        this.werknemer = werknemer;
        this.handschoenen = handschoenen;
    }

    //Code smell: setters weggehaald

    public String getWerknemer() {
        return werknemer;
    }

    public Integer getHandschoenen() {
        return handschoenen;
    }

    private static final Veiligheid instance = new Veiligheid();

        private Veiligheid(){}

        public static Veiligheid getInstance(){
            return instance;
        }

}
