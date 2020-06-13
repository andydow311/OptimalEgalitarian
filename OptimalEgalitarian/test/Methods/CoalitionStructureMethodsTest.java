package Methods;

import static org.junit.Assert.assertEquals;

import java.util.LinkedHashSet;
import java.util.Set;

import org.junit.Test;

import Utils.Agent;
import Utils.Coalition;
import Utils.CoalitionStructure;

import Methods.CoalitionStructureMethods;

public class CoalitionStructureMethodsTest {
	
	@Test
	public void gcoalition_structure_generation_methods_should_correctly_generate_cs_with_egalitarian_value() {
		
		Set<Agent> agentsOne = new LinkedHashSet<>();{
			agentsOne.add(new Agent(1));
			agentsOne.add(new Agent(2));
		}
	
		Set<Agent> agentsTwo = new LinkedHashSet<>();{
			agentsTwo.add(new Agent(3));
			agentsTwo.add(new Agent(4));
		}
		
		Set<Agent> agentsThree = new LinkedHashSet<>();{
			agentsThree.add(new Agent(3));
			agentsThree.add(new Agent(4));
		}
		
		Set<Coalition> coalitions = new LinkedHashSet<>();{
			coalitions.add(new Coalition(agentsOne,10));
			coalitions.add(new Coalition(agentsTwo,15));
			coalitions.add(new Coalition(agentsThree,20));
		}
		
		assertEquals(
				CoalitionStructureMethods
				.generateEgalitarianCoalitionStructure(coalitions),new CoalitionStructure(coalitions,10)
				);
		
		assertEquals(
				CoalitionStructureMethods.generateUtilitarianCoalitionStructure(coalitions),new CoalitionStructure(coalitions,45)
				);
		

		
		
	}

}
