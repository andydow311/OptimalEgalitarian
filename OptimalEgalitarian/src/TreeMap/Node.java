package TreeMap;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import Utils.Coalition;
import Utils.CoalitionStructure;

public class Node {
	
	public Node(Coalition coalition) {
		this.coalition = coalition;
	}
	
	Coalition coalition;
	
	Node leftChild;
	
	Node rightChild;
	
	public Coalition getCoalition() {
		return coalition;
	}
	
	public Node getLeftChild() {
		return leftChild;
	}
	
	public Node getRightChild() {
		return rightChild;
	}
	
	public void setLeftChild(Node leftChild) {
		this.leftChild = leftChild;
	}
	
	public void setRightChild(Node rightChild) {
		this.rightChild = rightChild;
	}
	
	@Override
	public boolean equals(Object object) {
		
		if (object == this) { 
            return true; 
        } 

        if (!(object instanceof CoalitionStructure)) { 
            return false; 
        } 
        
        Node node = (Node) object; 

        return Objects.equals(node.getCoalition(),coalition);
        
	}
	
	@Override
    public int hashCode() {
        return Objects.hash(coalition);
    }
	
	@Override
	public String toString() {	
		return coalition.toString();
	}

}
