/*
    The Tenant class models a sports team
**/
public class Tenant
{
    // Fields
    private String teamName;
    private String sport;
    private String league;

    // Constructors
    /*
        No-arg constructor

        The Tenant no-arg constructor assigns default values to all fields in the Tenant class
        if no arguments are given when creating a Tenant object
    **/
    public Tenant() {
        this.teamName = "";
        this.sport = "";
        this.league = "";
    }

    /*
        Constructor

        The Tenant constructor constructs a Tenant object with given arguments

        @param t    A string that represents the name of a sports team
        @param s    A string that represents a sport
        @param l    A string that represents a league
     **/
    public Tenant(String t, String s, String l) {
        this.teamName = t;
        this.sport = s;
        this.league = l;
    }

    // Setters
    /*
        setTeamName

        The setTeamName method assigns the teamName field the value of the argument t

        @param t    A string that represents the name of a sports team
    **/
    public void setTeamName(String t) {
        this.teamName = t;
    }

    /*
        setSport

        The setSport method assigns the sport field the value of the argument s

        @param s    A string that represents a sport
    **/
    public void setSport(String s) {
        this.sport = s;
    }

    /*
        setLeague

        The setLeague method assigns the league field the value of the argument l

        @param l    A string that represents a league
    **/
    public void setLeague(String l) {
        this.league = l;
    }

    // Getters
    /*
        getTeamName

        The getTeamName method returns the value stored in the teamName field

        @return     A string value stored in the teamName field
    **/
    public String getTeamName() {
        return this.teamName;
    }

    /*
        getSport

        The getSport method returns the value stored in the sport field

        @return     A string value stored in the sport field
    **/
    public String getSport() {
        return this.sport;
    }

    /*
        getLeague

        The getLeague method returns the value stored in the league field

        @return     A string value stored in the league field
    **/
    public String getLeague() {
        return this.league;
    }

    // toString method
    /*
        toString

        The toString method returns a string representation of a Tenant object

        @return     A formatted string representation of a Tenant object
    **/
    public String toString() {
        return String.format("%s %s %s", this.teamName, this.sport, this.league);
    }
}