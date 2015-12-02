package controller;

import gameState.PlayerTurn;
import heldItems.Pkmn;
import model.Model;
import view.BattleView;
import view.Display;

public class EquipItemController implements Controller {
	Model myModel;
	Pkmn item;
	public EquipItemController(Model m, Pkmn item){
		myModel = m;
		this.item = item;
	}
	@Override
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
