package controller;

import gameState.PlayerTurn;
import heldItems.Pkmn;
import model.Model;
import view.BattleView;
import view.Display;
/**
 * This controller is used to equip items to the player.
 * @author Adam Pine
 *
 */
public class EquipItemController implements Controller {
	Model myModel;
	Pkmn item;
	/**
	 * Takes a model, so that it can get information about the game world
	 * Take a Pkmn, which is a decorator for what we are considering a held item.
	 * @param m
	 * @param item
	 */
	public EquipItemController(Model m, Pkmn item){
		myModel = m;
		this.item = item;
	}
	@Override
	/**
	 * This one does not have a facade interface for me to use so I had to do the logic myself
	 * The EquipItemView will actually unequip the item before calling this controller,
	 *	then this controller will ensure that they only have 1 held item equipped.
	 */
	public void execute(){
		myModel.getPlayer().getSelectedPokemon().equipItem(item);
		System.out.println(myModel.getPlayer().getSelectedPokemon().getPkmn().getClass().getSimpleName());
		if (myModel.getState().getCurrentTurn() instanceof PlayerTurn){
			PlayerTurn pt = (PlayerTurn) myModel.getState().getCurrentTurn();
			pt.actuallyTakeTurn();
		}
		Display.globalDisplay.changeView(new BattleView());
		
	}
}
