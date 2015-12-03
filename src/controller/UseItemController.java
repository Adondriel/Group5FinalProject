package controller;

import command.PokemonFacade;
import items.ItemBehavior;
import model.Model;
import view.BattleView;
import view.Display;
/**
 * This controller is used so that pokemon can use items.
 * @author Adam Pine
 *
 */
public class UseItemController implements Controller {
	Model myModel;
	ItemBehavior item;
	/**
	 * Takes in a model because it used to use a model.
	 * Takes in the ItemBehavior that the player wants to use.
	 * @param m
	 * @param item
	 */
	public UseItemController(Model m, ItemBehavior item){
		myModel = m;
		this.item = item;
	}
	@Override
	/**
	 * Uses a pokemon Facade to call lower level functions.
	 */
	public void execute() {
		PokemonFacade pf = new PokemonFacade();
		pf.itemCommand(item);
		Display.globalDisplay.changeView(new BattleView());
	}
}
