public class Arena
{
    // Fields
    private String venueName;
    private String city;
    private String state;

    private int maxCapacity;
    private int yearOpened;
    private final Tenant team;

    // Constructors
    public Arena() {
        this.venueName = "";
        this.city = "";
        this.state = "";
        this.maxCapacity = -1;
        this.yearOpened = -1;
        this.team = new Tenant();
    }

    public Arena(String v, String c, String s,
                 int m, int y,
                 String teamName, String sport, String league) {
        this.venueName = v;
        this.city = c;
        this.state = s;
        this.maxCapacity = m;
        this.yearOpened = y;
        this.team = new Tenant(teamName, sport, league);
    }

    // Setters
    public void setVenueName(String v) {
        this.venueName = v;
    }

    public void setCity(String c) {
        this.city = c;
    }

    public void setState(String s) {
        this.state = s;
    }

    public void setMaxCapacity(int m) {
        this.maxCapacity = m;
    }

    public void setYearOpened(int y) {
        this.yearOpened = y;
    }

    // Getters
    public String getVenueName() {
        return this.venueName;
    }

    public String getCity() {
        return this.city;
    }

    public String getState() {
        return this.state;
    }

    public int getMaxCapacity() {
        return this.maxCapacity;
    }

    public int getYearOpened() {
        return this.yearOpened;
    }

    // toString
    public String toString() {
        return String.format("%s %s %s %d %d %s",
                this.venueName, this.city, this.state,
                this.maxCapacity, this.yearOpened, this.team.toString());
    }
}