package Utils;

public class Agent implements Comparable<Agent>{
	
	private int identifier;
	
	public Agent(int identifier) {
		this.identifier = identifier;
	}
	
	public int getIdentifier() {
		return this.identifier;
	}
	
	@Override
    public int compareTo(Agent other) {
        if (this.identifier < other.identifier) {
            return -1;
        }
        if (this.identifier == other.identifier) {
            return 0;
        }
        return 1;
    }
	
	@Override
	public boolean equals(Object object) {
		
		if (object == this) { 
            return true; 
        } 

        if (!(object instanceof Agent)) { 
            return false; 
        } 
         Agent agent = (Agent) object; 

        return agent.getIdentifier() == this.identifier;		
	}
	
	@Override
    public int hashCode() {
        return identifier;
    }
	
	public String toString() {
		return "" +identifier+"";
	}

}
