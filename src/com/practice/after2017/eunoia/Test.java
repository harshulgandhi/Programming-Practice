package com.practice.after2017.eunoia;

/*
1. Only write your code in the methods that have the comment 'write your code here' or in the section 'write optional helper methods here'
2. Do not modify anything else
3. If your code cannot compile or fails the test cases in 'main()', you will not receive a response from us
*/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
	public static void main(String... args) {

		/*
		 * Consider the following tree:
		 * 
		 * 1 / | \ 2 4 6 / | / \ | \ 3 9 5 7 11 12 / \ / | \ 13 16 14 23 17 / \
		 * 24 32
		 * 
		 * 
		 * Assuming the numbers are the ids of each node, the tree can be
		 * written down as follows:
		 * 
		 * 1(2,4,6) 2(3,9) 4(5,7) 6(11,12) 5(13,16) 12(14,23,17) 16(24,32)
		 * 
		 * In the example above, for the group 1(2,4,6), node 2, 4 and 6 are the
		 * child nodes of node 1. Note that extra whitespaces should be
		 * accepted. Assume ids are positive integers only.
		 */

		Tree first = new Tree("1(2,4, 6) 2(3, 9) 4(5,7)  6(11,12 ) 5(13,16)   12(14, 23, 17) 16( 24,32 )");
		assertTrue(first.getLevelOfNodeWithId(1) == 5);
		assertTrue(first.getLevelOfNodeWithId(4) == 4);
		assertTrue(first.getLevelOfNodeWithId(5) == 3);
		assertTrue(first.getLevelOfNodeWithId(12) == 3);
		assertTrue(first.getLevelOfNodeWithId(16) == 2);
		assertTrue(first.getLevelOfNodeWithId(23) == 2);
		assertTrue(first.getLevelOfNodeWithId(32) == 1);
		assertTrue(first.getLevelOfNodeWithId(99) == -1);

		/*
		 * 2 / | | \ 5 4 3 1 | \ 7 9 / \ / \ 12 10 11 14 | 13 / | \ 16 8 15
		 */

		Tree second = new Tree(" 2(5, 4, 3,1) 5(7) 3(9) 7(12, 10) 9(11, 14)10(13) 13(16,8,15)");
		assertTrue(second.getLevelOfNodeWithId(2) == 6);
		assertTrue(second.getLevelOfNodeWithId(5) == 5);
		assertTrue(second.getLevelOfNodeWithId(3) == 5);
		assertTrue(second.getLevelOfNodeWithId(12) == 3);
		assertTrue(second.getLevelOfNodeWithId(11) == 3);
		assertTrue(second.getLevelOfNodeWithId(13) == 2);
		assertTrue(second.getLevelOfNodeWithId(8) == 1);

		Tree third = new Tree(" 1");
		assertTrue(third.getLevelOfNodeWithId(1) == 1);

	}

	private static void assertTrue(boolean v) {
		if (!v) {
			Thread.dumpStack();
			System.exit(0);
		}
	}
}

class Tree {
	private Node root;

	// do not add new properties

	public Tree(String treeData) {
		// write your code here
		treeData = treeData.replaceAll("\\s+", "");
		List<String> nodesData = Arrays.asList(treeData.split("\\)"));
		createNodes(nodesData);
	}

	private void createNodes(List<String> nodesData) {
		Map<Integer, Node> nodeMap = new HashMap<>();
		for (String nodeData : nodesData) {
			createNode(nodeData, nodeMap);
		}
	}

	// convert string "2(5,4,3,1" to a node with 2 as root
	// and 5,4,3,1 as children
	private void createNode(String nodeData, Map<Integer, Node> nodeMap) {
		String[] dataArray = nodeData.split("\\(");
		int subTreeRootId = Integer.parseInt(dataArray[0]);
		Node subTreeRoot = nodeMap.get(subTreeRootId);
		if (subTreeRoot == null) {
			subTreeRoot = new Node(subTreeRootId);
			root = subTreeRoot;
			nodeMap.put(subTreeRootId, subTreeRoot);
		}
		if (dataArray.length == 1) {
			return;
		}
		List<String> childrenIds = Arrays.asList(dataArray[1].split(","));
		for (String childId : childrenIds) {
			Node child = new Node(Integer.parseInt(childId), subTreeRoot);
			nodeMap.put(Integer.parseInt(childId), child);
			subTreeRoot.appendChild(child);
		}
	}

	/**
	 * Finds a node with a given id and return it's level. The nodes at the
	 * bottom of the tree have a level of 1.
	 *
	 * @param id
	 *            The id of node
	 * @return The level of the the node of that id, or -1 if a node is not
	 *         found
	 */
	public int getLevelOfNodeWithId(int id) {
		if (findNode(root, id) == null) {
			return -1;
		}
		return maxDepth(root) - getLevelUtil(root, id, 1) + 1;
	}

	// write optional helper methods here

	// get level of a node starting from tree root as level 1
	private int getLevelUtil(Node root, int id, int level) {
		if (root == null) {
			return 0;
		}
		if (root.getId() == id) {
			return level;
		}
		List<Node> children = root.getChildren();
		int currLevel = 0;
		for (Node child : children) {
			currLevel = getLevelUtil(child, id, level + 1);
			if (currLevel != 0) {
				return currLevel;
			}
		}
		return currLevel;
	}

	private int maxDepth(Node root) {
		if (root == null) {
			return 0;
		}
		List<Node> children = root.getChildren();
		int depth = 0;
		for (Node child : children) {
			depth = Math.max(depth, maxDepth(child));
		}
		return depth + 1;
	}

	// find node with id findId
	public Node findNode(Node root, int findId) {
		if (null == root)
			return root;
		if (root.getId() == findId) {
			return root;
		}
		List<Node> children = root.getChildren();
		if (children.isEmpty()) {
			return null;
		}
		for (Node child : children) {
			Node result = findNode(child, findId);
			if (result != null) {
				return result;
			}
		}
		return null;
	}

	private void printTree(Node root) {
		List<Node> children = root.getChildren();
		if (!children.isEmpty()) {
			StringBuilder childIdStr = new StringBuilder();
			for (Node child : children) {
				childIdStr.append(child.getId() + ", ");
			}
			System.out.println(root.getId() + "->" + childIdStr);
			children.forEach(child -> printTree(child));
		}
	}

}

class Node {
	private Node parent;
	private List<Node> children;
	private int id;

	public Node(int id) {
		this.id = id;
		this.children = new ArrayList<Node>();
	}

	public Node(int id, Node parent) {
		this(id);
		this.parent = parent;
	}

	public void appendChild(Node child) {
		children.add(child);
	}

	public int getId() {
		return id;
	}

	public List<Node> getChildren() {
		return Collections.unmodifiableList(children);
	}
}
