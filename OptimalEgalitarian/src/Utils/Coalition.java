package Utils;

import java.util.Objects;
import java.util.Set;

public class Coalition implements Comparable<Coalition>{
	
	private Set<Agent> agents;
	private int value;
	
	public Coalition(Set<Agent> agents, int value){
		this.agents = agents;
		this.value = value;
	}
	
	public Set<Agent> getAgents(){
		return agents;
	}
	
	public int getValue() {
		return value;
	}
	
	@Override
    public int compareTo(Coalition other) {
        if (this.value > other.getValue()) {
            return -1;
        }
        if (this.value == other.getValue()) {
            return 0;
        }
        return 1;
    }
	
	
	@Override
	public boolean equals(Object object) {
		
		if (object == this) { 
            return true; 
        } 

        if (!(object instanceof Coalition)) { 
            return false; 
        } 
        Coalition coalition = (Coalition) object; 

        return Objects.equals(coalition.getAgents(),agents);		
	}
	
	@Override
    public int hashCode() {
        return Objects.hash(agents);
    }
	
	@Override
	public String toString() {
		
		String agentString = "";
		
		for(Agent agent : agents) {
			agentString = agentString + "" + agent.toString() + ",";
			
		}
		
		
		return "(" + agentString.substring(0,agentString.length()-1) + ")";
	}
	
	

}
