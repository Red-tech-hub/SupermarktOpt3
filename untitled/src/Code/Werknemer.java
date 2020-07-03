package Code;

public class Werknemer {
    private String werknemer;
    private Integer uren;
    private Integer leeftijd;
    private Double uurloon;

    public Werknemer(String werknemer, Integer uren, Integer leeftijd, Double uurloon) {
        this.werknemer = werknemer;
        this.uren = uren;
        this.leeftijd = leeftijd;
        this.uurloon = uurloon;
    }

    public String getWerknemer() {
        return werknemer;
    }

    public Integer getUren() {
        return uren;
    }

    public Integer getLeeftijd() {
        return leeftijd;
    }

    public Double getUurloon() {
        return uurloon;
    }
}
