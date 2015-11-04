package view;

import javax.swing.JPanel;

import controller.Controller;
import model.Model;

public abstract class View extends JPanel{
	protected Model myModel;
	protected Controller myController;
}
