package foxminded.com.service.racer;

public class Racer {

    private String company;
    private String name;
    private double roundTime;

    public Racer(String company, String name, double roundTime) {
        this.company = company;
        this.name = name;
        this.roundTime = roundTime;
    }

    public Racer() {
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public void setLastName(String name) {
        this.name = name;
    }

    public double getRoundTime() {
        return roundTime;
    }

    public void setRoundTime(double roundTime) {
        this.roundTime = roundTime;
    }
}
