package controller;

import command.PokemonFacade;
import items.ItemBehavior;
import model.Model;
import view.BattleView;
import view.Display;

public class UseItemController implements Controller {
	Model myModel;
	ItemBehavior item;
	public UseItemController(Model m, ItemBehavior item){
		myModel = m;
		this.item = item;
	}
	@Override
	public void execute() {
		PokemonFacade pf = new PokemonFacade();
		pf.itemCommand(item);
		Display.globalDisplay.changeView(new BattleView());
	}
}
