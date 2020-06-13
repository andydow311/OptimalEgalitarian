package Utils;

import java.util.Objects;
import java.util.Set;

public class CoalitionStructure implements Comparable<CoalitionStructure>{
	
	private Set<Coalition> coalitions;
	private int value;
	
	public CoalitionStructure(Set<Coalition> coalitions, int value){
		this.coalitions = coalitions;
		this.value = value;
	}
	
	public Set<Coalition> getCoalitions(){
		return coalitions;
	}
	
	public int getValue() {
		return value;
	}
	
	@Override
    public int compareTo(CoalitionStructure other) {
        if (this.value < other.value) {
            return 1;
        }
        if (this.value == other.value) {
            return 0;
        }
        return -1;
    }
	
	
	@Override
	public boolean equals(Object object) {
		
		if (object == this) { 
            return true; 
        } 

        if (!(object instanceof CoalitionStructure)) { 
            return false; 
        } 
        CoalitionStructure coalitionStructure = (CoalitionStructure) object; 

        return Objects.equals(coalitionStructure.getCoalitions(),
        		coalitions);		
	}
	
	@Override
    public int hashCode() {
        return Objects.hash(coalitions);
    }
	
	public String toString() {
		
		String coalitionString = "";
		
		for(Coalition coalition : coalitions) {
			coalitionString = coalitionString + "" + coalition.toString() + ",";
			
		}
		
		return  "[" +coalitionString.substring(0,coalitionString.length()-1) +"]";
	}

}
