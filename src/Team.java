public class Team {

    Team(String title, String country, int bag) {
        this.title = title;
        this.country = country;
        this.bag = bag;
        this.point = 0;
        this.scored = 0;
        this.goaltaken = 0;
    }

    private String title;
    private String country;
    private int point;
    private int bag;
    private int scored;
    private int goaltaken;
    private int average;

    // SETTERS & GETTERS
    public void setAverage(int average) {
        this.average = average;
    }

    public int getAverage() {
        return average;
    }

    public void setGoaltaken(int goaltaken) {
        this.goaltaken = goaltaken;
    }

    public void setScored(int scored) {
        this.scored = scored;
    }

    public int getGoaltaken() {
        return goaltaken;
    }

    public int getScored() {
        return scored;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public int getPoint() {
        return point;
    }

    public void setBag(int bag) {
        this.bag = bag;
    }

    public int getBag() {
        return bag;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String getCountry() {
        return country;
    }
}
