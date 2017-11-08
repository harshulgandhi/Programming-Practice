package com.practice.after2017.datastructures;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class FindPathGraph{

    public boolean doesPathExist(GraphNode root, GraphNode a, GraphNode b) {

        // find a
    	GraphNode findA = dfsStack(root, a);
    	if(findA != null) {
    		GraphNode findBFromA = dfsStack(findA, b);
    		return findBFromA != null;
    	}
    	return false;

    }

    public GraphNode dfs(GraphNode root, GraphNode a) {
//    	System.out.println("Checking values curr : "+root.getValue()+" a : "+a.getValue());
//    	if(root.getValue() == a.getValue()) return root;
        if(root.getAdjacentNodes().size() != 0) {
            for(GraphNode eachNeighbour : root.getAdjacentNodes()) {
            	System.out.println("Checking value "+ eachNeighbour.getValue());
//                if(eachNeighbour.getValue() == a.getValue()) {
//                	System.out.println("Returning : "+eachNeighbour.getValue());
//                    return eachNeighbour;
//                }
                dfs(eachNeighbour, a);
            }
        }
        return null;

    }

    public GraphNode dfsStack(GraphNode root, GraphNode a) {
        if(root == null) return null;
        Stack<GraphNode> stack = new Stack<GraphNode>();
        stack.push(root);

        while(stack.size() > 0) {
            GraphNode curr = stack.pop();
            if(curr.getValue() == a.getValue()) {
                return curr;
            }
            List<GraphNode> neighbours = curr.getAdjacentNodes();
            for(GraphNode each : neighbours){
                stack.push(each);
            }
        }
        return null;
    }

    public GraphNode bfs(GraphNode root, GraphNode a) {
    	if(root == null) return null;
        Queue<GraphNode> queue = new LinkedList<GraphNode>();
        queue.add(root);

        while(queue.size() > 0) {
            GraphNode curr = queue.poll();
            if(curr.getValue() == a.getValue()) {
                return curr;
            } 
            List<GraphNode> neighbours = curr.getAdjacentNodes();
            for(GraphNode each : neighbours) {
                queue.add(each);
            }
        }

        return null;
    }
    

    public static void main(String[] args) {
        FindPathGraph fpg  = new FindPathGraph();
        GraphNode root = new GraphNode(2);
        GraphNode node1 = new GraphNode(3);
        GraphNode node2 = new GraphNode(21);
        GraphNode node3 = new GraphNode(17);
        GraphNode node4 = new GraphNode(7);
        GraphNode node5 = new GraphNode(4);
        GraphNode node6 = new GraphNode(5);
        GraphNode node7 = new GraphNode(9);
        root.addNeighbour(node1);
        root.addNeighbour(node2);
        root.addNeighbour(node3);
        node1.addNeighbour(node4);
        node2.addNeighbour(node5);
        node2.addNeighbour(node6);
        node5.addNeighbour(node4);
        node5.addNeighbour(node7);
        node5.addNeighbour(node6);

//        GraphNode found = fpg.dfsStack(root, new GraphNode(21));
        GraphNode found = fpg.dfs(root, new GraphNode(21));
        System.out.println(found.getValue()+" No of neighbours : "+found.getAdjacentNodes().size());
        
        System.out.println(fpg.doesPathExist(root, new GraphNode(4), new GraphNode(7)));
    }
}