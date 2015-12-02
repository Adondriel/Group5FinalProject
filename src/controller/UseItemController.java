package controller;

import items.ItemBehavior;
import model.Model;

public class UseItemController implements Controller {
	Model myModel;
	ItemBehavior item;
	public UseItemController(Model m, ItemBehavior item){
		myModel = m;
		this.item = item;
	}
	@Override
	public void execute() {
		
	}
}
