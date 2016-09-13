public class Player
{

    // -------------------------------------------------------------------------- ATTRIBUTES

    private String name;
    private int numOfGoals;

    // -------------------------------------------------------------------------- CONSTRUCTOR

    public Player ()
    {
        // Default constructor here!
    }

    public Player (String newName)
    {
        this.setName(newName);
    }

    public Player (String newName, int newNumOfGoals)
    {
        this.setName(newName);
        this.setNumOfGoals(newNumOfGoals);
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

    public void setNumOfGoals (int newNumOfGoals)
    {
        this.numOfGoals = newNumOfGoals;
    }

    public int getNumOfGoals ()
    {
        return this.numOfGoals;
    }

    public String toString ()
    {
        return ( this.getName() + ", goals " + this.getNumOfGoals() );
    }


}
