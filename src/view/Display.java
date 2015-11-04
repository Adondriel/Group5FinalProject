package view;

import javax.swing.JFrame;

import model.Model;
import model.Observer;

public class Display implements Observer {
	JFrame frame = new JFrame();
	InitialView iv;
	
	
	public Display(Model m){
		 iv = new InitialView(m);
	}
	
	@Override
	public void update() {
		
	}
	
	public void changeView(View v){
		frame.dispose();
		frame.add(v);
		
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
