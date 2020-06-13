package Methods;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Collections.*;
import java.util.LinkedHashMap;

import org.junit.Test;

import Utils.Agent;
import Utils.Coalition;



public class CoalitionMethodsTest {
	
	@Test
	public void colaition_methods_should_be_correct() {
		
		Agent agentOne = new Agent(1);
		Agent agentTwo = new Agent(2);
		
		Set<Agent> agents = new LinkedHashSet<>();{
			agents.add(agentOne);
			agents.add(agentTwo);
		}
		
		Coalition coalition = CoalitionMethods.generateCoalition(agents);
		
		boolean valueAssertion = coalition.getValue() >= 2 && coalition.getValue() <= 3;
		
		assertTrue(valueAssertion);
		
		assertEquals(coalition.getAgents(),agents);
		
	}
	
	@Test
	public void generateAllCoalitions_should_be_correctly_return_all_coaliton_values() {
		
		Agent agentOne = new Agent(1);
		Agent agentTwo = new Agent(2);
		Agent agentThree = new Agent(3);
		
		Set<Agent> agents = new LinkedHashSet<>();{
			agents.add(agentOne);
			agents.add(agentTwo);
			agents.add(agentThree);
		}
		
		Coalition coalitionOne = new Coalition(java.util.Collections.singleton(agentOne),1);
		Coalition coalitionTwo = new Coalition(java.util.Collections.singleton(agentTwo),1);
		Coalition coalitionThree = new Coalition(java.util.Collections.singleton(agentThree),1);
		
		Coalition grandCoalition = new Coalition(agents,3);
		
		Map<Integer,Set<Coalition>> coalitions = CoalitionMethods.generateAllCoalitions(agents, agents.size());
		
		assertEquals(coalitions.keySet().size(),3);
		
		Set<Coalition> levelOneCoalition = new LinkedHashSet<>(); {
			levelOneCoalition.add(coalitionOne);
			levelOneCoalition.add(coalitionTwo);
			levelOneCoalition.add(coalitionThree);
		}
		
		Set<Coalition> levelThreeCoalition = new LinkedHashSet<>(); {
			levelThreeCoalition.add(grandCoalition);
		}
		
		assertEquals(coalitions.get(1),levelOneCoalition);
		assertEquals(coalitions.get(3),levelThreeCoalition);
		
	}
	
	@Test
	public void selectCoalitionsForEgalitarianCoalitionStructureGeneration_should_correctly_get_the_top_Coalitions() {
		
		Agent agentOne = new Agent(1);
		Agent agentTwo = new Agent(2);
		Agent agentThree = new Agent(3);
		
		Set<Agent> agents = new LinkedHashSet<>();{
			agents.add(agentOne);
			agents.add(agentTwo);
			agents.add(agentThree);
		}
		
		Coalition coalitionOne = new Coalition(java.util.Collections.singleton(agentOne),1);
		Coalition coalitionTwo = new Coalition(java.util.Collections.singleton(agentTwo),2);
		Coalition coalitionThree = new Coalition(java.util.Collections.singleton(agentThree),3);
		
		Coalition coalitionFour = new Coalition(Stream.of(agentOne,agentTwo).collect(Collectors.toSet()),4);
		Coalition coalitionFive = new Coalition(Stream.of(agentOne,agentThree).collect(Collectors.toSet()),5);
		Coalition coalitionSix = new Coalition(Stream.of(agentTwo,agentThree).collect(Collectors.toSet()),6);
		
		Coalition grandCoalition = new Coalition(agents,7);
		
		Map<Integer,Set<Coalition>> coalitions = new LinkedHashMap<>();
		
		Set<Coalition> levelOneCoalition = new LinkedHashSet<>(); {
			levelOneCoalition.add(coalitionOne);
			levelOneCoalition.add(coalitionTwo);
			levelOneCoalition.add(coalitionThree);
		}
		
		Set<Coalition> levelTwoCoalition = new LinkedHashSet<>(); {
			levelTwoCoalition.add(coalitionFour);
			levelTwoCoalition.add(coalitionFive);
			levelTwoCoalition.add(coalitionSix);
		}
		
		Set<Coalition> levelThreeCoalition = new LinkedHashSet<>(); {
			levelThreeCoalition.add(grandCoalition);
		}
		
		coalitions.put(1, levelOneCoalition);
		coalitions.put(2, levelTwoCoalition);
		coalitions.put(3, levelThreeCoalition);
		
		
		Set<Coalition> topCoalitions = new LinkedHashSet<>(); {
			topCoalitions.add(coalitionFour);
			topCoalitions.add(coalitionFive);
			topCoalitions.add(coalitionSix);
			topCoalitions.add(grandCoalition);
		}
		
		assertEquals(
				topCoalitions,
				CoalitionMethods.selectCoalitionsForEgalitarianCoalitionStructureGeneration(coalitions)
				);
		
		
		
	}

}
