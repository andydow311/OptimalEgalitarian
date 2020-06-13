package TreeMap;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

import Utils.Coalition;

public class BinaryTree {
	
	public BinaryTree(Node root) {
		this.root = root;
	}
	
	Node root;
	
	public Node getRoot() {
		return root;
	}
	
	private Node addRecursive(Node current, Coalition coaliton) {
	   
		if (current == null) {
	        return new Node(coaliton);
	    }
	 
	    if (coaliton.getValue() > current.getCoalition().getValue()) {
	    	current.setLeftChild(
	    			addRecursive(
	    					current.getLeftChild(), 
	    					coaliton
	    					)
	    			);
	    } else if (coaliton.getValue() < current.getCoalition().getValue()) {
	    	current.setRightChild(
	    			addRecursive(
	    					current.getRightChild(), 
	    					coaliton
	    					)
	    			);
	    } else {
	        return current;
	    }
	 
	    return current;
	}
	
	public void add(Coalition coalition) {
	    root = addRecursive(root, coalition);
	}
	
	public String toString() {
		
		Node thisNode = root;
		
		String output = thisNode.getCoalition().toString();
		
		Set<Node> theseNodes = new HashSet<>();{
			theseNodes.add(root.getRightChild());
			theseNodes.add(root.getLeftChild());
		}
		
		while(!theseNodes.isEmpty()) {
		
			Set<Node> thesenewNodes = new HashSet<>();
			output = output +" -----> { ";
			for(Node node: theseNodes) {
				
				output = output + node.getLeftChild().getCoalition().toString() +" | ";
				output = output + node.getRightChild().getCoalition().toString() +" | ";
				thesenewNodes.add(node.getLeftChild());
				thesenewNodes.add(node.getRightChild());
				
			}
			
			output = output +" } ";
			
			theseNodes.clear();
			theseNodes.addAll(thesenewNodes);
		
		}
		
		
		return output;
	}

}
