package view;

import javax.swing.JFrame;
import javax.swing.JPanel;

import model.Model;
import model.Observer;
/**
 * This is the main part of the game, it is what displays the different views directly.
 * @author Adam Pine
 *
 */
public class Display implements Observer {
	JFrame frame = new JFrame();
	JPanel iv;
	Model myModel;
	//Global display is static and public so that views and other classes are able to change the current view.
	public static Display globalDisplay;
	//This main method is just used to run this file, use it for testing without time limits.
	public static void main(String args[]){
		Model m = new Model();
		globalDisplay = new Display(m);
	}
	/**
	 * Constructor Pass in a model, that it no longer uses, since the initial view is what sets up the model for all of the views.
	 * @param m
	 */
	public Display(Model m){
		globalDisplay = this;
		 iv = new InitialView();
		 
		 frame.add(iv);
		 frame.pack();
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 frame.setVisible(true);
	}
	
	@Override
	public void update() {
		//do nothing at this time.
	}
	
	public static void updateViews(){
		if (View.myModel != null){
			View.myModel.update();
		}
	}
	public void changeView(View v){
		frame.getContentPane().removeAll();
		frame.add(v);
		
		frame.pack();
		frame.setVisible(true);
	}
}
