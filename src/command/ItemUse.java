package command;

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

	/**
	 * @param t ai player
	 * @param p player
	 */
	public ItemUse(Player p)
	{
		this.p = p; //player
	}
	
	@Override
	public void executeItem(ItemBehavior i)
	{
		
		p.useItem(i);
		// gets the selected item and uses it
		p.removeItem(i);
		
		
	}

}
