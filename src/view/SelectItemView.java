package view;

import controller.UseItemController;
import model.Model;
import model.Observer;

public class SelectItemView extends View implements Observer{
	public SelectItemView(Model m){
		myModel = m;
		myController = new UseItemController(m);
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	};
}
