package Methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.List;


import Utils.Agent;
import Utils.Coalition;

public class CoalitionMethods {
	
	public static Coalition generateCoalition(Set<Agent> agents) {
		
		int coalitionValue = (int) (agents.size() + Math.random());
	
		return new Coalition(agents,coalitionValue);
		
	}
	
	public static Map<Integer,Set<Coalition>> generateAllCoalitions(Set<Agent> agents, int size) {
		
		return createCoalitionTree(agents, size);
	}
	
	public static Set<Coalition> selectCoalitionsForEgalitarianCoalitionStructureGeneration(
			Map<Integer,Set<Coalition>> coalitionMap)
	{
		
		Set<Coalition> topCoalitions = new HashSet<>();
		
		Set<Coalition> coalitions = new HashSet<>();
		
		for(Integer level : coalitionMap.keySet()) {
			
			coalitions.addAll(coalitionMap.get(level));
			
		}
		
		List<Coalition> sortedList = new ArrayList<>(coalitions);
		Collections.sort(sortedList);
		
		int index = (int) (Math.floor((double) (coalitions.size()/2) ) + 1);
		
		int counter = 1;
		
		for(Coalition coalition : sortedList){
			topCoalitions.add(coalition);
			if(counter <= index) {
				counter++;
			}else {
				break;
			}
		
		}
		
		return topCoalitions;
	}
	
	
	private static Map<Integer,Set<Coalition>> createCoalitionTree(Set<Agent> agents, int size){
		
		Map<Integer,Set<Coalition>> coalitions = new LinkedHashMap<>();
		
		for(int i =1; i <= size; i++) {
			
			if(i==1) {
				
				for(Agent agent : agents) {
					
					Set<Agent> setOfAgents = new LinkedHashSet<>(); 
						
					setOfAgents.add(agent);
					
					Coalition coalition = new Coalition(setOfAgents, (int) (coalitions.size() + Math.random()));
					
					if(coalitions.get(i) == null) {
					     
					    Set<Coalition> setOfCoalitions = new LinkedHashSet<>(); 
					     
					    setOfCoalitions.add(coalition);
					     
					    coalitions.put(i, setOfCoalitions);
					    
					}else {
						
						coalitions.get(i).add(coalition);
						
					}
					
				}
				
			}else {
				
				Set<Coalition> previousLevelColaitions = coalitions.get(i-1);
				
				for(Coalition coalition : previousLevelColaitions) {
					
					for(Agent agent : agents) {
					
						if(!coalition.getAgents().contains(agent)) {
							Set<Agent> newAgents = new LinkedHashSet<>();
							newAgents.addAll(coalition.getAgents());
							newAgents.add(agent);
							Coalition newCoalition = new Coalition(newAgents, (int) (coalitions.size() + Math.random()));
							
							if(coalitions.get(i) == null) {
							     
							    Set<Coalition> setOfCoalitions = new LinkedHashSet<>(); 
							     
							    setOfCoalitions.add(newCoalition);
							     
							    coalitions.put(i, setOfCoalitions);
							    
							}else {
								
								coalitions.get(i).add(newCoalition);
								
							}
							
						}
					}
				}
				
				
			}
		}
		
		return coalitions;
		
	}

}
