package gameState;

/**
 * @author Benjamin Uleau
 *
 */
public abstract class PlayerTurn extends Turn
{
	/**
	 * @param turnSwitch
	 */
	public PlayerTurn(TurnChange turnSwitch){
		super(turnSwitch);
	}

	TurnChange tc;

	public abstract void takeTurn();
}
