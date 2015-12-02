package model;

import java.util.ArrayList;

import gameState.TurnChange;
import gameplay.Computer;
import gameplay.Environment;
import gameplay.Player;

public class Model implements Subject {

	Environment e = Environment.getEnvironment();
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
		if (observers.size() > 0) {
			for (Observer o : observers) {
				o.update();
			}
		}
	}

	public Player getPlayer() {
		return (Player) e.getPlayer();
	}

	public void setPlayer(Player p) {
		e.setPlayer(p);
	}

	public Computer getComputer() {
		return (Computer) e.getComputer();
	}

	public void setComputer(Computer computer) {
		e.setComputer(computer);
	}

	public TurnChange getState() {
		return e.getTc();
	}
}
