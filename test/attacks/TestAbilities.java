package attacks;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import attacks.FireAttackAbilities.*;
import attacks.GrassAttackAbilities.*;
import attacks.WaterAttackAbilities.*;
import exceptions.StatusEffectException;
import gameplay.Environment;
import gameplay.Player;
import pokemon.MockFirePokeman;
import pokemon.MockGrassPokeman;
import pokemon.MockWaterPokeman;
import pokemon.Pokemon;
import statusEffects.Burn;


/**
 * @author Bradley Solorzano
 * group 5 final project
 *
 */

public class TestAbilities
{
	Environment e = Environment.getEnvironment();
	
	/**
	 * Test the Ember Ability
	 */
	
	public void testEmber()
	{
		
		Pokemon fire1 = new MockFirePokeman();
		Pokemon fireTarget = new MockFirePokeman();
		Pokemon waterTarget = new MockWaterPokeman();
		Pokemon grassTarget = new MockGrassPokeman();
		
		e.setPlayerPokemon(fire1);
		Ember embur = new Ember(e.getCurrentPlayerPokemon().getDamage());
		e.getCurrentPlayerPokemon().selectAttack(embur);
		
		//fire1 attacking grass target
		e.setComputerPokemon(fireTarget);
		try
		{
			e.getCurrentPlayerPokemon().attack(e.getCurrentComputerPokemon());
			
		} catch (StatusEffectException e)
		{
			e.printStackTrace();
		}
		
		//assertTrue(e.getCurrentComputerPokemon().getStatus() instanceof Burn);
		assertEquals(663, e.getCurrentComputerPokemon().getCurrentHealth());
		
		//fire1 attacking water target
		e.setComputerPokemon(waterTarget);
		try
		{
			e.getCurrentPlayerPokemon().attack(e.getCurrentComputerPokemon());
			
		} catch (StatusEffectException e)
		{
			e.printStackTrace();
		}
		
		assertEquals(325, e.getCurrentComputerPokemon().getCurrentHealth());
		
		//fire1 attacking grass target
		e.setComputerPokemon(grassTarget);
		try
		{
			e.getCurrentPlayerPokemon().attack(e.getCurrentComputerPokemon());
			
		} catch (StatusEffectException e)
		{
			e.printStackTrace();
		}
		assertEquals(249, e.getCurrentComputerPokemon().getCurrentHealth());
		
	}
	
	/**
	 * test FireFang Ability
	 */
	@Test
	public void testFireFang()
	{
		Pokemon fire1 = new MockFirePokeman();
		Pokemon fireTarget = new MockFirePokeman();
		Pokemon waterTarget = new MockWaterPokeman();
		Pokemon grassTarget = new MockGrassPokeman();
		
		e.setPlayerPokemon(fire1);
		FireFang firefang = new FireFang(e.getCurrentPlayerPokemon().getDamage());
		e.getCurrentPlayerPokemon().selectAttack(firefang);
		
		//attack firetarget
		e.setComputerPokemon(fireTarget);
		try
		{
			e.getCurrentPlayerPokemon().attack(e.getCurrentComputerPokemon());
		} catch (StatusEffectException e1)
		{
			e1.printStackTrace();
		}
		assertEquals(642, e.getCurrentComputerPokemon().getCurrentHealth());
		
		//attack water target
		e.setComputerPokemon(waterTarget);
		try
		{
			e.getCurrentPlayerPokemon().attack(e.getCurrentComputerPokemon());
		} catch (StatusEffectException e1)
		{
			e1.printStackTrace();
		}
		assertEquals(304, e.getCurrentComputerPokemon().getCurrentHealth());
		
		//attack grass target
		e.setComputerPokemon(grassTarget);
		try
		{
			e.getCurrentPlayerPokemon().attack(e.getCurrentComputerPokemon());
		} catch (StatusEffectException e1)
		{
			e1.printStackTrace();
		}
		assertEquals(228, e.getCurrentComputerPokemon().getCurrentHealth());
		
	}
	
	@Test
	public void testFireSpin()
	{
		
	}
	
	/**
	 * test Heat Wave Ability
	 */
	@Test
	public void testHeatWave()
	{
		Pokemon fire1 = new MockFirePokeman();
		Pokemon fireTarget = new MockFirePokeman();
		Pokemon waterTarget = new MockWaterPokeman();
		Pokemon grassTarget = new MockGrassPokeman();
		
		e.setPlayerPokemon(fire1);
		HeatWave heatwave = new HeatWave(e.getCurrentPlayerPokemon().getDamage());
		e.getCurrentPlayerPokemon().selectAttack(heatwave);
		
		//attack firetarget
		e.setComputerPokemon(fireTarget);
		try
		{
			e.getCurrentPlayerPokemon().attack(e.getCurrentComputerPokemon());
		} catch (StatusEffectException e1)
		{
			e1.printStackTrace();
		}
		assertEquals(617, e.getCurrentComputerPokemon().getCurrentHealth());
		
		//attack water target
		e.setComputerPokemon(waterTarget);
		try
		{
			e.getCurrentPlayerPokemon().attack(e.getCurrentComputerPokemon());
		} catch (StatusEffectException e1)
		{
			e1.printStackTrace();
		}
		assertEquals(279, e.getCurrentComputerPokemon().getCurrentHealth());
		
		//attack grass target
		e.setComputerPokemon(grassTarget);
		try
		{
			e.getCurrentPlayerPokemon().attack(e.getCurrentComputerPokemon());
		} catch (StatusEffectException e1)
		{
			e1.printStackTrace();
		}
		assertEquals(203, e.getCurrentComputerPokemon().getCurrentHealth());
	}
	
	@Test
	public void testInferno()
	{
		
	}
	
	@Test
	public void testWill_O_Wisp()
	{
		
	}
	
	@Test
	public void testBugBite()
	{
		
	}
	
	/**
	 * test Leech Seed
	 */
	@Test
	public void testLeechSeed()
	{
		Pokemon grass1 = new MockGrassPokeman();
		Pokemon fireTarget = new MockFirePokeman();
		Pokemon waterTarget = new MockWaterPokeman();
		Pokemon grassTarget = new MockGrassPokeman();
		
		e.setPlayerPokemon(grass1);
		LeechSeed leechseed = new LeechSeed(e.getCurrentPlayerPokemon().getDamage());
		e.getCurrentPlayerPokemon().selectAttack(leechseed);
		
		//attack firetarget
		e.setComputerPokemon(fireTarget);
		try
		{
			e.getCurrentPlayerPokemon().attack(e.getCurrentComputerPokemon());
		} catch (StatusEffectException e1)
		{
			e1.printStackTrace();
		}
		assertEquals(749, e.getCurrentComputerPokemon().getCurrentHealth());
		
		//attack water target
		e.setComputerPokemon(waterTarget);
		try
		{
			e.getCurrentPlayerPokemon().attack(e.getCurrentComputerPokemon());
		} catch (StatusEffectException e1)
		{
			e1.printStackTrace();
		}
		assertEquals(295, e.getCurrentComputerPokemon().getCurrentHealth());
		
		//attack grass target
		e.setComputerPokemon(grassTarget);
		try
		{
			e.getCurrentPlayerPokemon().attack(e.getCurrentComputerPokemon());
		} catch (StatusEffectException e1)
		{
			e1.printStackTrace();
		}
		assertEquals(394, e.getCurrentComputerPokemon().getCurrentHealth());
	}
	
	@Test
	public void testPetalBlizzard()
	{
		Pokemon grass1 = new MockGrassPokeman();
		Pokemon fireTarget = new MockFirePokeman();
		Pokemon waterTarget = new MockWaterPokeman();
		Pokemon grassTarget = new MockGrassPokeman();
		
		e.setPlayerPokemon(grass1);
		PetalBlizzard petablizzard = new PetalBlizzard(e.getCurrentPlayerPokemon().getDamage());
		e.getCurrentPlayerPokemon().selectAttack(petablizzard);
		
		//attack firetarget
		e.setComputerPokemon(fireTarget);
		try
		{
			e.getCurrentPlayerPokemon().attack(e.getCurrentComputerPokemon());
		} catch (StatusEffectException e1)
		{
			e1.printStackTrace();
		}
		assertEquals(712, e.getCurrentComputerPokemon().getCurrentHealth());
		
		//attack water target
		e.setComputerPokemon(waterTarget);
		try
		{
			e.getCurrentPlayerPokemon().attack(e.getCurrentComputerPokemon());
		} catch (StatusEffectException e1)
		{
			e1.printStackTrace();
		}
		assertEquals(258, e.getCurrentComputerPokemon().getCurrentHealth());
		
		//attack grass target
		e.setComputerPokemon(grassTarget);
		try
		{
			e.getCurrentPlayerPokemon().attack(e.getCurrentComputerPokemon());
		} catch (StatusEffectException e1)
		{
			e1.printStackTrace();
		}
		assertEquals(357, e.getCurrentComputerPokemon().getCurrentHealth());
	}
	@Test
	public void testRazorLeaf()
	{
		
	}
	/**
	 * test Solar beam ability
	 */
	@Test
	public void testSolarBeam()
	{
		Pokemon grass1 = new MockGrassPokeman();
		Pokemon fireTarget = new MockFirePokeman();
		Pokemon waterTarget = new MockWaterPokeman();
		Pokemon grassTarget = new MockGrassPokeman();
		
		e.setPlayerPokemon(grass1);
		SolarBeam solarbeam = new SolarBeam(e.getCurrentPlayerPokemon().getDamage());
		e.getCurrentPlayerPokemon().selectAttack(solarbeam);
		
		//attack firetarget
		e.setComputerPokemon(fireTarget);
		try
		{
			e.getCurrentPlayerPokemon().attack(e.getCurrentComputerPokemon());
		} catch (StatusEffectException e1)
		{
			e1.printStackTrace();
		}
		assertEquals(698, e.getCurrentComputerPokemon().getCurrentHealth());
		
		//attack water target
		e.setComputerPokemon(waterTarget);
		try
		{
			e.getCurrentPlayerPokemon().attack(e.getCurrentComputerPokemon());
		} catch (StatusEffectException e1)
		{
			e1.printStackTrace();
		}
		assertEquals(244, e.getCurrentComputerPokemon().getCurrentHealth());
		
		//attack grass target
		e.setComputerPokemon(grassTarget);
		try
		{
			e.getCurrentPlayerPokemon().attack(e.getCurrentComputerPokemon());
		} catch (StatusEffectException e1)
		{
			e1.printStackTrace();
		}
		assertEquals(343, e.getCurrentComputerPokemon().getCurrentHealth());
	}
	/**
	 * test String shot ability
	 */
	@Test
	public void testStringShot()
	{
		Pokemon grass1 = new MockGrassPokeman();
		Pokemon fireTarget = new MockFirePokeman();
		Pokemon waterTarget = new MockWaterPokeman();
		Pokemon grassTarget = new MockGrassPokeman();
		
		e.setPlayerPokemon(grass1);
		StringShot stringshot = new StringShot(e.getCurrentPlayerPokemon().getDamage());
		e.getCurrentPlayerPokemon().selectAttack(stringshot);
		
		//attack firetarget
		e.setComputerPokemon(fireTarget);
		try
		{
			e.getCurrentPlayerPokemon().attack(e.getCurrentComputerPokemon());
		} catch (StatusEffectException e1)
		{
			e1.printStackTrace();
		}
		assertEquals(710, e.getCurrentComputerPokemon().getCurrentHealth());
		
		//attack water target
		e.setComputerPokemon(waterTarget);
		try
		{
			e.getCurrentPlayerPokemon().attack(e.getCurrentComputerPokemon());
		} catch (StatusEffectException e1)
		{
			e1.printStackTrace();
		}
		assertEquals(256, e.getCurrentComputerPokemon().getCurrentHealth());
		
		//attack grass target
		e.setComputerPokemon(grassTarget);
		try
		{
			e.getCurrentPlayerPokemon().attack(e.getCurrentComputerPokemon());
		} catch (StatusEffectException e1)
		{
			e1.printStackTrace();
		}
		assertEquals(355, e.getCurrentComputerPokemon().getCurrentHealth());
	}
	@Test
	public void testTackle()
	{
		
	}
	@Test
	public void testVineWhip()
	{
		
	}
	
	@Test
	public void testBubble()
	{
		
	}
	@Test
	public void testBubbleBeam()
	{
		
	}
	@Test
	public void testHydroPump()
	{
		
	}
	
	@Test
	public void WaterGun()
	{
		
	}
	@Test
	public void testWaterPulse()
	{
		
	}
	@Test
	public void testWithdraw()
	{
		
	}

}
