package edu.kis.vh.nursery.list;

public class Node {

    private final int value;
    private Node prev, next;

    public Node(int i) {
        value = i;
    }
    
    public Node(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
    public Node getPrev() {
        return prev;
    }
    public Node getNext() {
        return next;
    }
}
