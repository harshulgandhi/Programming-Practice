package com.practice.after2017.datastructures;

import java.util.List;
import java.util.ArrayList;

public class GraphNode{
    private int value;
    private List<GraphNode> adjacentNodes;

    public GraphNode(int value) {
        this.value = value;
        adjacentNodes = new ArrayList<GraphNode>();
    }

    public void addNeighbour(GraphNode node) {
        adjacentNodes.add(node);
    }

    public List<GraphNode> getAdjacentNodes() {
        return adjacentNodes;
    }

    public int getValue() {
        return this.value;
    }

}