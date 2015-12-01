package model;

import java.util.ArrayList;

import gameplay.Computer;
import gameplay.Environment;
import gameplay.Player;

public class Model implements Subject{
	

	Environment e;
	Player player;
	Computer computer;
	ArrayList<Observer> observers = new ArrayList<Observer>();

	@Override
	public void attach(Observer o) {
		observers.add(o);
	}
	@Override
	public void detach(Observer o) {
		observers.remove(o);
	}
	@Override
	public void update() {
		for (Observer o : observers){
			o.update();
		}
	}
	
	public Player getPlayer() {
		return player;
	}
	
	public void setPlayer(Player p){
		player = p;
	}
}
	
	
	
	