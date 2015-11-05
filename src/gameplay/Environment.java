package gameplay;

public class Environment 
{
	private Player player;
	private Computer computer;
	private Environment battleField;
	
	/**
	 * Creates a battleField for the Player's and Computer's Pokemon to do battle.
	 * @param p The player to be in the battleField.
	 * @param c The computer to be in the battleField.
	 */
	private Environment(Player p, Computer c)
	{
		player = p;
		computer = c;
	}
	
	/**
	 * Will create OR return the Environment for the Pokemon. 
	 * @return the battleField for the Pokemon to battle in.
	 */
	public Environment getEnvironment(Player p, Computer c)
	{
		if (battleField == null)
		{
			synchronized (Environment.class)
			{
				if (battleField == null)
				{
					battleField = new Environment(p,c);
				}
			}
		}
		return battleField;	
	}
}