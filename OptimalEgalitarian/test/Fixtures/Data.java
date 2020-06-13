package Fixtures;

import java.util.Set;

import Utils.Agent;
import Utils.Coalition;

public class Data {
	
	public static Agent agentBuilder(int identifier) {
		return new Agent(identifier);
	}
	
	public static Coalition coalitionBuilder(Set<Agent> agents, int value) {
		return new Coalition(agents, value);
	}


}
