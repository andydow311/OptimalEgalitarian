package Methods;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import TreeMap.BinaryTree;
import TreeMap.Node;
import Utils.Agent;
import Utils.Coalition;
import Utils.CoalitionStructure;


public class EgalitarianOptimalCoalitionStructure {
	
	
	
//	public static CoalitionStructure generateEgalitarianOptimalCoalitionStructure(
//			Set<Coalition> topCoalitions, 
//			Set<Agent> allAgents) {
//		
//		Coalition[] coalitionsArray = new Coalition[topCoalitions.size()];
//		topCoalitions.toArray(coalitionsArray);
//		
//		Set<Coalition> coalitions = new HashSet<>();
//		
//		for(int index =0; index < topCoalitions.size(); index++) {
//					
//			coalitions.clear();
//			
//			Coalition coalition = coalitionsArray[index];
//			
//			Set<Node> nodesForTree = new LinkedHashSet<>();
//			
//			Node root = new Node(coalition);
//			
//			nodesForTree.add(root);
//			
//			for(int innerIndex = index+1; innerIndex < topCoalitions.size()-1; innerIndex++) {
//				Coalition thisCoalition = coalitionsArray[innerIndex];
//				if(areSetsDisjoint(coalition.getAgents(),thisCoalition.getAgents())) {
//					nodesForTree.add(new Node(thisCoalition));
//				}
//			}
//			
//			BinaryTree binaryTree = new BinaryTree(nodesForTree,root);
//			
//			
//			
//			
//			
//		}
//		
//	}
//			
//			
//			
//			
//			
//			Set<Agent> agentLog = new HashSet<>();
//			
//			agentLog.addAll(coalition.getAgents());
//			
//			coalitions.add(coalition);
//			
//			System.out.println("coalition ==> " + coalition.toString());
//			
//			if(coalition.getAgents().equals(allAgents)) {
//				return CoalitionStructureMethods.generateEgalitarianCoalitionStructure(coalitions);
//			}
//			
//			System.out.println("-------------");
//			
//			for(int innerIndex = index+1; innerIndex < topCoalitions.size(); innerIndex++) {
//				
//				Coalition thisCoalition = coalitionsArray[innerIndex];
//				
//				
//				System.out.println("thisCoalition ==> " + thisCoalition.toString());				
//				
//				Set<Agent> agents = thisCoalition.getAgents();
//				
//				boolean disjointFlag = true;
//				
//				for(Coalition existingCoalition : coalitions) {
//					
//					boolean disjoint = areSetsDisjoint(
//							existingCoalition.getAgents(),
//							thisCoalition.getAgents()
//							); 
//							
//					if(!disjoint) {
//						disjointFlag = false;
//						System.out.println("break here");
//						break;
//					}else {
//						System.out.println("no intersection");
//					}
//					
//				}
//				
//				if(disjointFlag) {
//					coalitions.add(thisCoalition);
//					System.out.println("stuff added");
//					agentLog.addAll(agents);
//				}else {
//					System.out.println("nowt added");
//				}
//				
//				
//			}
//			
//			if(agentLog.equals(allAgents)) {
//				System.out.println("Complete Structure");
//				break;
//			}else {
//				System.out.println("Incomplete Structure");
//			}
//			System.out.println("-------------");
//		}
//		
//		return CoalitionStructureMethods.generateEgalitarianCoalitionStructure(coalitions);
//	}
//	
//	private static boolean areSetsDisjoint(Set<Agent> setOne,Set<Agent> setTwo) {
//	
//		if(setTwo.size() < setOne.size()) {
//			
//			for(Agent thisObject: setTwo) {
//				if(setOne.contains(thisObject)) {
//					return false;
//				}
//			}
//			
//		}else {
//			
//			for(Agent thatObject: setOne) {
//				if(setTwo.contains(thatObject)) {
//					return false;
//				}
//			}
//			
//		}
//		
//		return true;
//	}

}
