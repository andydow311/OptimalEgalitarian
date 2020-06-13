package Utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class AgentTest {
	
	
	@Test
	public void equals_should_render_agents_with_same_id_as_equal(){
		
		Agent agentOne = new Agent(1);
		Agent agentTwo = new Agent(1);
		
		assertTrue(agentOne.equals(agentTwo));
		
	}
	
	@Test
	public void equals_should_render_agents_with_different_id_as_not_equal(){
		
		Agent agentOne = new Agent(1);
		Agent agentTwo = new Agent(2);
		
		assertFalse(agentOne.equals(agentTwo));
		
	}
	
	
	@Test
	public void equals_should_correctly_compare_agents(){
		
		Agent agentOne = new Agent(1);
		Agent agentTwo = new Agent(2);
		Agent agentThree = new Agent(2);
		
		assertEquals(agentOne.compareTo(agentTwo),-1);
		assertEquals(agentThree.compareTo(agentTwo),0);
		assertEquals(agentThree.compareTo(agentOne),1);
		
	}
	

}
