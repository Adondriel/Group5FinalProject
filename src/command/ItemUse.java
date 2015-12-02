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
<<<<<<< HEAD
	{	
		p.useItem(i);

=======
>>>>>>> ab208f3bbb92e6f3099dc689f14e3e76b8d223bf
	{
		boolean hasItem=p.getItem(i);
		// gets the selected item and uses it
		if(hasItem){
			i.UseItem(p.getSelectedPokemon().getCurrentHealth(), p.getSelectedPokemon().getMaxHealth());
			p.removeItem(i);
		}
<<<<<<< HEAD

=======
>>>>>>> ab208f3bbb92e6f3099dc689f14e3e76b8d223bf
		p.removeItem(i);
	}

}
