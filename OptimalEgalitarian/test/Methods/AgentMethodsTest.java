package Methods;

import static org.junit.Assert.assertEquals;

import java.util.LinkedHashSet;
import java.util.Set;

import org.junit.Test;

import Utils.Agent;

public class AgentMethodsTest {
	
	@Test
	public void generateAgents_should_correctly_generate_agents() {
		
		Set<Agent> expectedAgents = new LinkedHashSet<>();{
			expectedAgents.add(new Agent(1));
			expectedAgents.add(new Agent(2));
			expectedAgents.add(new Agent(3));
			expectedAgents.add(new Agent(4));
		}
		
		assertEquals(AgentMethods.generateAgents(4),expectedAgents);
		
	}

}
