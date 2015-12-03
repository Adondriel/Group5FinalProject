package view;

import javax.swing.JPanel;

import controller.Controller;
import model.Model;
/**
 * There is no test for this, it is just an abstract class. This does not need a test, as it has no methods.
 * @author Adam Pine
 *
 */
public abstract class View extends JPanel{
	//myModel is public and static so that other classes can call View.myModel.update()
	public static Model myModel;
	//myController is just a shared variable that changes with declaration of each View.
	protected Controller myController;
}