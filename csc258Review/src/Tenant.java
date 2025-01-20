public class Tenant
{
    // Fields
    private String teamName;
    private String sport;
    private String league;

    // Constructors
    public Tenant() {
        this.teamName = "";
        this.sport = "";
        this.league = "";
    }

    public Tenant(String t, String s, String l) {
        this.teamName = t;
        this.sport = s;
        this.league = l;
    }

    // Setters
    public void setTeamName(String t) {
        this.teamName = t;
    }

    public void setSport(String s) {
        this.sport = s;
    }

    public void setLeague(String l) {
        this.league = l;
    }

    // Getters
    public String getTeamName() {
        return this.teamName;
    }

    public String getSport() {
        return this.sport;
    }

    public String getLeague() {
        return this.league;
    }

    // toString
    public String toString() {
        return String.format("%s %s %s", this.teamName, this.sport, this.league);
    }
}