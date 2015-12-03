package model;
/**
 * Does not require testing, it only has one method and this item is never instaniated. 
 * View is the tester for this, if the view gets updated correctly while playing the game, that means observer works.
 * @author Adam Pine
 *
 */
public interface Observer {
	//Update method, the only thing an observer cares about.
	public void update();
}
