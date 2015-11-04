package items;
/**
 * Interface that calculates the HP gained by an item.
 * @author Jason LoBianco
 */
public interface ItemBehavior 
{
	public int UseItem(int currentLife,int maxLife);
}