package view;

import controller.UseItemController;
import model.Model;

public class SelectItemView extends View {
	public SelectItemView(Model m){
		myModel = m;
		myController = new UseItemController(m);
	};
}
