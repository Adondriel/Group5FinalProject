package command;
/**
 * @author Bradley Solorzano
 * group 5 final project
 *
 */
public class Run implements RunCommand
{

	/**
	 * if you run away in the game you run away in real life
	 */
	
	@Override
	public void executeRun()
	{
				System.exit(0);
	}

}
