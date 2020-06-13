package Methods;

import java.util.LinkedHashSet;
import java.util.Set;

import Utils.Agent;

public class AgentMethods {
	
		
		public static Set<Agent> generateAgents(int agentSize) {
			
			Set<Agent> agents = new LinkedHashSet<>();
			
			for(int i=1; i <= agentSize; i++) {
				agents.add(new Agent(i));
			}
			
			return agents;
		}

	

}
