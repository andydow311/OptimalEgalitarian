package TreeMap;

import static org.junit.Assert.assertEquals;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;

import Utils.Agent;
import Utils.Coalition;

public class BinaryTreeTest {
	
	@Test
	public void add_should_build_a_binary_tree() {
		
		Agent agentOne = new Agent(1);
		Agent agentTwo = new Agent(2);
		Agent agentThree = new Agent(3);
		
		Set<Agent> agents = new LinkedHashSet<>();{
			agents.add(agentOne);
			agents.add(agentTwo);
			agents.add(agentThree);
		}
		
		Coalition coalitionNewOne = new Coalition(Stream.of(agentThree).collect(Collectors.toSet()),6);
		Coalition coalitionNewFour = new Coalition(Stream.of(agentOne,agentTwo).collect(Collectors.toSet()),4);
		Coalition coalitionNewFive = new Coalition(Stream.of(agentOne).collect(Collectors.toSet()),5);
		Coalition coalitionNewSix = new Coalition(Stream.of(agentTwo,agentThree).collect(Collectors.toSet()),5);
		
		BinaryTree binaryTree = new BinaryTree(new Node(coalitionNewOne));
		
		binaryTree.add(coalitionNewFour);
		binaryTree.add(coalitionNewFive);
		binaryTree.add(coalitionNewSix);
		
		System.out.println("root == " + binaryTree.getRoot().toString());
		System.out.println("left == " + binaryTree.getRoot().getLeftChild().toString());
	//	System.out.println("right == " + binaryTree.getRoot().getRightChild().toString());
		//System.out.println("new == " + new Node(coalitionNewOne).toString());
		
		assertEquals(binaryTree.getRoot().toString(), new Node(coalitionNewOne).toString());
		//assertEquals(binaryTree.getRoot().toString(), new Node(coalitionNewOne).toString());
	}

}
