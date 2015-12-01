package command;

import gameplay.Trainer;

/**
 * @author Bradley Solorzano
 * group 5 final project
 *
 */
public class ItemUse implements ItemCommand
{

	private Trainer t;
	private Trainer p;

	/**
	 * @param t ai player
	 * @param p player
	 */
	public ItemUse(Trainer t, Trainer p)
	{
		this.t = t; //A.I
		this.p = p; //PLAYER
	}
	
	@Override
	public void executeItem()
	{
		
		Trainer.useItem(/*get paramater from adam*/);
		// gets the selected item and uses it
		Trainer.removeItem(/*paramater from the input*/);
		
		
	}

}
