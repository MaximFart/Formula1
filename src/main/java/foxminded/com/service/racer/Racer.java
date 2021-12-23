package foxminded.com.service.racer;

import java.util.Objects;

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


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Racer racer = (Racer) obj;
        return Objects.equals(company, racer.company) && Double.compare(roundTime, racer.roundTime) == 0 && Objects.equals(name, racer.name);
    }



    @Override
    public int hashCode() {
        return Objects.hash(company, name, roundTime);
    }

}
