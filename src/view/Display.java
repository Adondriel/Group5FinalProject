package view;

import javax.swing.JFrame;
import javax.swing.JPanel;

import model.Model;
import model.Observer;

public class Display implements Observer {
	JFrame frame = new JFrame();
	JPanel iv;
	Model myModel;
	
	public static Display globalDisplay;
	
	public static void main(String args[]){
		Model m = new Model();
		globalDisplay = new Display(m);
		//globalDisplay.changeView(new BattleView(m));
	}
	
	public Display(Model m){
		 iv = new InitialView(m);
		 myModel=m;
		 
		 frame.add(iv);
		 frame.pack();
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 frame.setVisible(true);
	}
	
	@Override
	public void update() {
		//do nothing at this time.
	}
	
	public void changeView(View v){
		frame.getContentPane().removeAll();
		frame.add(v);
		
		frame.pack();
		frame.setVisible(true);
	}
}
