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
	public void executeItem(ItemBehavior i){
		boolean hasItem=p.getItem(i);
		// gets the selected item and uses it
		if(hasItem){
			i.UseItem(p.getSelectedPokemon().getCurrentHealth(), p.getSelectedPokemon().getMaxHealth());
			p.removeItem(i);
		}
		p.removeItem(i);
	}

}
