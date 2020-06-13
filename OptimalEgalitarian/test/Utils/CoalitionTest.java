package Utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.LinkedHashSet;
import java.util.Set;

import org.junit.Test;

public class CoalitionTest {
	
	@Test
	public void equals_should_render_agents_with_same_agents_as_equal(){
		
		Agent agentOne = new Agent(1);
		Agent agentTwo = new Agent(1);
		
		Set<Agent> agents = new LinkedHashSet<>();{
			agents.add(agentOne);
			agents.add(agentTwo);
		}
		
		
		Coalition coalitionOne = new Coalition(agents,100);
		Coalition coalitionTwo = new Coalition(agents,10);
		
		assertTrue(coalitionOne.equals(coalitionTwo));
		
	}
	
	@Test
	public void equals_should_render_agents_with_different_id_as_not_equal(){
		
		Agent agentOne = new Agent(1);
		Agent agentTwo = new Agent(2);
		
		Set<Agent> agentsOne = new LinkedHashSet<>();{
			agentsOne.add(agentOne);
		}
		
		Set<Agent> agentsTwo = new LinkedHashSet<>();{
			agentsTwo.add(agentTwo);
		}

		
		Coalition coalitionOne = new Coalition(agentsOne,100);
		Coalition coalitionTwo = new Coalition(agentsTwo,10);
		
		assertFalse(coalitionOne.equals(coalitionTwo));
		
	}
	
	
	@Test
	public void equals_should_correctly_compare_agents(){
		
		Agent agentOne = new Agent(1);
		Agent agentTwo = new Agent(2);
		
		Set<Agent> agentsOne = new LinkedHashSet<>();{
			agentsOne.add(agentOne);
		}
		
		Set<Agent> agentsTwo = new LinkedHashSet<>();{
			agentsTwo.add(agentTwo);
		}

		
		Coalition coalitionOne = new Coalition(agentsOne,100);
		Coalition coalitionTwo = new Coalition(agentsTwo,100);
		Coalition coalitionThree = new Coalition(agentsTwo,10);
		
		assertEquals(coalitionThree.compareTo(coalitionOne),1);
		assertEquals(coalitionTwo.compareTo(coalitionOne),0);
		assertEquals(coalitionOne.compareTo(coalitionThree),-1);
		
	}

}
