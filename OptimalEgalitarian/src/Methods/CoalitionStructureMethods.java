package Methods;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import Utils.Coalition;
import Utils.CoalitionStructure;

public class CoalitionStructureMethods {
	
	public static CoalitionStructure generateEgalitarianCoalitionStructure(Set<Coalition> coalitions) {
		
		Coalition[] coalitionsArray = new Coalition[coalitions.size()];
		coalitions.toArray(coalitionsArray);
		Arrays.sort(coalitionsArray);
		
		if(coalitions.size() == 0) {
			
			return new CoalitionStructure(new HashSet<>(),0);
			
		} else {
			
			int value = 0;
			int counter = 1; 
			for(Coalition coalition: coalitions) {
					
				if(counter ==1) {
					value = coalition.getValue();
					System.out.println("value ==> " + value);
					counter++;
				}else {			
					if(value > coalition.getValue()) {
						value = coalition.getValue();
						System.out.println("value ==> " + value);
					}
				}
			}
			
			return new CoalitionStructure(coalitions,value);
		}
	}
	
	public static CoalitionStructure generateUtilitarianCoalitionStructure(Set<Coalition> coalitions) {
		
		int structureValue = 0;
		
		for(Coalition coalition: coalitions) {
			structureValue = structureValue  +coalition.getValue();
		}
		
		return new CoalitionStructure(coalitions,structureValue);
	}
	
//	public static CoalitionStructure generateElitistCoalitionStructure(Set<Coalition> coalitions) {
//		
//		Coalition[] coalitionsArray = new Coalition[coalitions.size()];
//		coalitions.toArray(coalitionsArray);
//		Arrays.sort(coalitionsArray);
//		
//		if(coalitions.size() == 0) {
//			
//			return new CoalitionStructure(new HashSet<>(),0);
//			
//		} else if(coalitions.size() == 1) {
//			
//			return new CoalitionStructure(coalitions,0);
//			
//		}else {
//			
//			int index = coalitions.size() -1;
//			
//			int structureValue =  coalitionsArray[index].getValue();
//			
//			return new CoalitionStructure(coalitions,structureValue);
//		
//		}
//	}

}
