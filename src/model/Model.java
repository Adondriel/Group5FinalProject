package model;

import java.util.ArrayList;

import gameState.TurnChange;
import gameplay.Computer;
import gameplay.Environment;
import gameplay.Player;
/**
 * The model, which holds the data on the Environment, and which views need to be updated.
 * @author Adam Pine
 *
 */
public class Model implements Subject {
	//Environment, used to ensure that code is not split between multiple classes.
	private Environment e = Environment.getEnvironment();
	//The observer list, keeps track of the views that need to be updated.
	//Generally is only one, but there could theoretically be multiple in here at one time.
	private ArrayList<Observer> observers = new ArrayList<Observer>();

	@Override
	/**
	 * attaches the observer o, to the ArrayList of observers.
	 */
	public void attach(Observer o) {
		observers.add(o);
	}

	@Override
	/**
	 * Detaches the observer o, from the ArrayList of observers.
	 */
	public void detach(Observer o) {
		observers.remove(o);
	}

	@Override
	/**
	 * Updates all of the observers
	 */
	public void update() {
		if (observers.size() > 0) {
			for (Observer o : observers) {
				o.update();
			}
		}
	}

	/**
	 * Gets the player from the environment
	 * @return Player
	 */
	public Player getPlayer() {
		return (Player) e.getPlayer();
	}
	/**
	 * Sets the player of the environment to p
	 * @param p
	 */
	public void setPlayer(Player p) {
		e.setPlayer(p);
	}
	/**
	 * Gets the computer from the environment.
	 * @return Computer
	 */
	public Computer getComputer() {
		return (Computer) e.getComputer();
	}
	/**
	 * Sets the computer of the Environment.
	 * @param computer
	 */
	public void setComputer(Computer computer) {
		e.setComputer(computer);
	}

	/**
	 * Returns the current state of the environment. 
	 * @return TurnChange
 	 */
	public TurnChange getState() {
		return e.getTc();
	}
	/**
	 * Set's the Environments TurnChange(state)
	 * @param turnChange
	 */
	public void setTC(TurnChange turnChange) {
		e.setTC(turnChange);
	}
}
