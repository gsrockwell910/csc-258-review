/*
    Arena

    The Arena class models an arena for sports teams
**/
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
    /*
        No-arg constructor

        The Arena no-arg constructor assigns default values to all fields in the Arena class
        if no arguments are given when creating an Arena object
    **/
    public Arena() {
        this.venueName = "";
        this.city = "";
        this.state = "";
        this.maxCapacity = -1;
        this.yearOpened = -1;
        this.team = new Tenant();
    }

    /*
        Constructor

        The Arena constructor constructs an Arena object with given arguments

        @param v    A string that represents the name of a venue
        @param c    A string that represents a city
        @param s    A string that represents a state
        @param m    An int that represents the maximum capacity of a venue
        @param y    An int that represents the year that a venue was opened
        @param teamName     A string that represents the name of a sports team
        @param sport        A string that represents a sport
        @param league       A string that represents a sports league
     **/
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
    /*
        setVenueName

        The setVenueName method assigns the venueName field the value of the argument v

        @param v    A string that represents a venue name
    **/
    public void setVenueName(String v) {
        this.venueName = v;
    }

    /*
        setCity

        The setCity method assigns the city field the value of the argument c

        @param c    A string that represents a city
    **/
    public void setCity(String c) {
        this.city = c;
    }

    /*
        setState

        The setState method assigns the state field the value of the argument s

        @param c    A string that represents a city
    **/
    public void setState(String s) {
        this.state = s;
    }

    /*
        setMaxCapacity

        The setMaxCapacity method assigns the maxCapacity field the value of the argument m

        @param m    An int that represents the maximum capacity of a venue
    **/
    public void setMaxCapacity(int m) {
        this.maxCapacity = m;
    }

    /*
        setYearOpened

        The setYearOpened method assigns the yearOpened field the value of the argument y

        @param y    An int that represents the year that a venue was opened
    **/
    public void setYearOpened(int y) {
        this.yearOpened = y;
    }

    // Getters
    /*
        getVenueName

        The getVenueName method returns the value stored in the venueName field

        @return     A string value stored in the venueName field
    **/
    public String getVenueName() {
        return this.venueName;
    }

    /*
        getCity

        The getCity method returns the value stored in the city field

        @return     A string value stored in the city field
    **/
    public String getCity() {
        return this.city;
    }

    /*
        getState

        The getState method returns the value stored in the state field

        @return     A string value stored in the state field
    **/
    public String getState() {
        return this.state;
    }

    /*
        getMaxCapacity

        The getMaxCapacity method returns the value stored in the maxCapacity field

        @return     An int value stored in the maxCapacity field
    **/
    public int getMaxCapacity() {
        return this.maxCapacity;
    }

    /*
        getYearOpened

        The getYearOpened method returns the value stored in the yearOpened field

        @return     An int value stored in the yearOpened field
    **/
    public int getYearOpened() {
        return this.yearOpened;
    }

    // toString method
    /*
        toString

        The toString method returns a string representation of an Arena object

        @return     A formatted string representation of an Arena object
    **/
    public String toString() {
        return String.format("Venue:\t\t\t%s\nLocation:\t\t%s, %s\nCapacity:\t\t%d\nYear Opened:\t%d\n%s\n",
                this.venueName, this.city, this.state,
                this.maxCapacity, this.yearOpened, this.team);
    }
}