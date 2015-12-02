package command;

import gameState.PlayerTurn;
import gameplay.Environment;
import gameplay.Player;
import items.ItemBehavior;

/**
 * @author Bradley Solorzano
 * group 5 final project
 *
 */
public class ItemUse implements ItemCommand
{

	private Player p;
	private Environment e = Environment.getEnvironment();

	/**
	 * @param t ai player
	 * @param p player
	 */
	public ItemUse(Player p)
	{
		this.p = p; //player
	}
	
	@Override
	public void executeItem(ItemBehavior i){
		boolean hasItem=p.getItem(i);
		// gets the selected item and uses it
		if(hasItem){
			i.UseItem(p.getSelectedPokemon().getCurrentHealth(), p.getSelectedPokemon().getMaxHealth());
			p.removeItem(i);
		}
		if (e.getTc().getCurrentTurn() instanceof PlayerTurn){
			PlayerTurn pt = (PlayerTurn) e.getTc().getCurrentTurn();
			pt.actuallyTakeTurn();
		}
}

}
