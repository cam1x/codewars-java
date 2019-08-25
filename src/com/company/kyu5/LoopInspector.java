package com.company.kyu5;

import java.util.*;

/*
    Condition: https://www.codewars.com/kata/52a89c2ea8ddc5547a000863
 */

public class LoopInspector {

    public int loopSize(Node node) {
        Node myNode = node;
        Set<Node> setOfNodes = new HashSet<>();
        for(int i = 0; i < Integer.MAX_VALUE ; i++) {
            if (!setOfNodes.add(myNode)) {
                Node startNode = myNode;
                int counter;
                for (counter = 1; myNode.getNext() != startNode; counter++) {
                    myNode = myNode.getNext();
                }
                return counter;
            }
            myNode = myNode.getNext();
        }
        return 0;
    }
}

class Node {
    public Node getNext() {
        return new Node();
    }
}