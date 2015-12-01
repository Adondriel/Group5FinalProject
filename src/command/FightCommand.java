package command;

import attacks.Attack;

/**
 * @author Bradley Solorzano
 * group 5 final project
 *
 */
public interface FightCommand
{
	/**
	 * @param a
	 */
	public void execute(Attack a);
}
