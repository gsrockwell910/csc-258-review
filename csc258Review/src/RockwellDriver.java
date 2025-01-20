// Import io package to read text files
import java.io.*;
// Import util package for ArrayList
import java.util.*;
/*
    RockwellDriver

    The RockwellDriver class holds the main method
**/
public class RockwellDriver
{
    /*
        main method

        The main method demonstrates the Arena and Tenant classes

        @param args     A string array of arguments
    **/
    public static void main(String[] args) throws IOException
    {
        // Declare all necessary variables
        String venueName;
        String city;
        String state;
        String teamName;
        String sport;
        String league;

        int maxCapacity;
        int yearOpened;

        Tenant team;

        // Create ArrayList to store objects
        ArrayList<Arena> arenaList = new ArrayList<Arena>();

        // Create an instance of the File class
        File file = new File("src/IndoorArenas.txt");

        // Create Scanner and pass file as argument
        Scanner inputFile = new Scanner(file);

        // Loop through input file
        while( inputFile.hasNext() ) {
            // Get data from file and store in variables
            venueName = inputFile.nextLine();
            city = inputFile.nextLine();
            state = inputFile.nextLine();
            maxCapacity = inputFile.nextInt();
            yearOpened = inputFile.nextInt();
            teamName = inputFile.nextLine();
            sport = inputFile.nextLine();
            league = inputFile.nextLine();

            // Check for end of file
            if( inputFile.hasNext() ) {
                // Skip blank line
                inputFile.nextLine();
            }
            if( inputFile.hasNext() ) {
                inputFile.nextLine();
            }

            // Create Tenant object and assign to team variable
            team = new Tenant(teamName, sport, league);
            // Add Arena object to ArrayList
            arenaList.add( new Arena(venueName, city, state, maxCapacity, yearOpened,
                    team.getTeamName(), team.getSport(), team.getLeague()) );

        }

        // Close file
        inputFile.close();

        // Display output using toString methods
        for(Arena arena : arenaList) {
            System.out.println(arena.toString());
        }
    }
}