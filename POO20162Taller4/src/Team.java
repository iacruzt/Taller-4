import java.util.*;

public class Team
{

    // -------------------------------------------------------------------------- ATTRIBUTES

    private String name;
    private ArrayList<Player> players; // This is a list of references to Player type objects!
    private int maxSize;

    // -------------------------------------------------------------------------- CONSTRUCTOR

    public Team ()
    {
        // Default constructor here!
    }

    public Team (String newName)
    {
        this.setName(newName);
        this.players = new ArrayList<Player>(); /* If an object is to have another object as an attribute, such object
                                                   HAS TO BE INSTANTIATED in order to be used as an effective
                                                   attribute. This is the case of the ArrayList<Player> type object
                                                   "players", an attribute of the class Team. That's why there is a
                                                   constructor for the ArrayList<Player> players object within the
                                                   constructor of the Team object. */
        this.setMaxSize(16);
    }

    // -------------------------------------------------------------------------- METHODS

    public void setName (String newName)
    {
        this.name = newName;
    }

    public String getName ()
    {
        return this.name;
    }

    public void addPlayer (Player newPlayer)
    {
        if ( players.size() < this.getMaxSize() )
        {
            players.add(newPlayer);
        }
    }

    public void setMaxSize (int newMaxSize)
    {
        this.maxSize = newMaxSize;
    }

    public int getMaxSize ()
    {
        return this.maxSize;
    }

    public int size ()
    {
        return players.size();
    }

    public int goals ()
    {
        int goals;

        goals = 0;
        for (Player player : players)
        {
            goals = goals + player.getNumOfGoals();
        }

        return goals;
    }

    public void printPlayers ()
    {
        for (Player player : players)   // foreach: <type-of-element> <reference-to-the-element> : <ref-to-ArrayList>
        {
            System.out.println(player); // This will work because I defined a toString method on the Player class...
        }
    }

    // -------------------------------------------------------------------------- TEST MAIN

    public static void main(String[] args) {
        Team barcelona = new Team("FC Barcelona");

        Player brian = new Player("Brian");
        Player pekka = new Player("Pekka", 39);
        barcelona.addPlayer(brian);
        barcelona.addPlayer(pekka);
        barcelona.addPlayer(new Player("Mikael", 1)); // works similarly as the above

        System.out.println("Total goals: " + barcelona.goals());
        }
    }

