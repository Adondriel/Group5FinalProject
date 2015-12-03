package model;
/**
 * This is tested by the Model class.
 * @author Adam Pine
 *
 */
public interface Subject {
	public void attach(Observer o);
	public void detach(Observer o);
	public void update();
}
