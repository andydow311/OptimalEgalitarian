package Methods;
//
//import static org.junit.Assert.assertEquals;
//
//import java.util.HashSet;
//import java.util.LinkedHashMap;
//import java.util.LinkedHashSet;
//import java.util.Map;
//import java.util.Set;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//
//import org.junit.Test;
//
//import Utils.Agent;
//import Utils.Coalition;
//import Utils.CoalitionStructure;
//
public class EgalitarianOptimalCoalitionStructureTest {
	
}

//	
//	@Test
//	public void generateEgalitarianOptimalCoalitionStructure_should_generate_optimal_structure_when_grand_coalition_is_optimal() {
//		
//		Agent agentOne = new Agent(1);
//		Agent agentTwo = new Agent(2);
//		Agent agentThree = new Agent(3);
//		
//		Set<Agent> agents = new LinkedHashSet<>();{
//			agents.add(agentOne);
//			agents.add(agentTwo);
//			agents.add(agentThree);
//		}
//		
//		Coalition coalitionFour = new Coalition(Stream.of(agentOne,agentTwo).collect(Collectors.toSet()),4);
//		Coalition coalitionFive = new Coalition(Stream.of(agentOne,agentThree).collect(Collectors.toSet()),5);
//		Coalition coalitionSix = new Coalition(Stream.of(agentTwo,agentThree).collect(Collectors.toSet()),6);
//		
//		Coalition grandCoalition = new Coalition(agents,7);
//		
//		Set<Coalition> topCoalitions = new LinkedHashSet<>(); {
//			topCoalitions.add(coalitionFour);
//			topCoalitions.add(coalitionFive);
//			topCoalitions.add(coalitionSix);
//			topCoalitions.add(grandCoalition);
//		}
//		
//		Set<Coalition> coalitions = new HashSet<>(); {
//			coalitions.add(grandCoalition);
//		}
//		
//		CoalitionStructure expectedOptimal = new CoalitionStructure(coalitions,7);
//		
//		CoalitionStructure actualOptimal =  
//				EgalitarianOptimalCoalitionStructure.generateEgalitarianOptimalCoalitionStructure(
//					topCoalitions,
//					agents
//				);
//		
//		assertEquals(expectedOptimal, actualOptimal);
//		
//	}
//	
//	@Test
//	public void generateEgalitarianOptimalCoalitionStructure_should_generate_optimal_structure() {
//		
//		Agent agentOne = new Agent(1);
//		Agent agentTwo = new Agent(2);
//		Agent agentThree = new Agent(3);
//		
//		Set<Agent> agents = new LinkedHashSet<>();{
//			agents.add(agentOne);
//			agents.add(agentTwo);
//			agents.add(agentThree);
//		}
//		
//		Coalition coalitionNewOne = new Coalition(Stream.of(agentThree).collect(Collectors.toSet()),6);
//		Coalition coalitionNewFour = new Coalition(Stream.of(agentOne,agentTwo).collect(Collectors.toSet()),4);
//		Coalition coalitionNewFive = new Coalition(Stream.of(agentOne).collect(Collectors.toSet()),5);
//		Coalition coalitionNewSix = new Coalition(Stream.of(agentTwo,agentThree).collect(Collectors.toSet()),5);
//		
//
//		
//		Set<Coalition> topCoalitions = new HashSet<>(); {
//			topCoalitions.add(coalitionNewOne);
//			topCoalitions.add(coalitionNewFour);
//			topCoalitions.add(coalitionNewFive);
//			topCoalitions.add(coalitionNewSix);
//		
//		}
//		
//		Set<Coalition> coalitions = new HashSet<>(); {
//			coalitions.add(coalitionNewSix);
//			coalitions.add(coalitionNewFive);
//		}
//		
//		CoalitionStructure expectedOptimal = new CoalitionStructure(coalitions,5);
//		
//		CoalitionStructure actualOptimal =  
//				EgalitarianOptimalCoalitionStructure.generateEgalitarianOptimalCoalitionStructure(
//					topCoalitions,
//					agents
//				);
//		
//		assertEquals(expectedOptimal, actualOptimal);
//		
//	}
//
//}
