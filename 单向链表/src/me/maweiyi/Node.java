package me.maweiyi;

/**
 * Created by maweiyi on 9/14/16.
 */
public class Node {
    private NodeData nodeData;
    private Node next;

    public Node addNode(Node head, NodeData nodeData) {
        if (head == null || nodeData == null) return null;
        Node node = new Node();
        node.nodeData = nodeData;
        node.next = null;

        if (head.next == null) {
            head.next = node;
            return head;
        }

        while (head.next != null) {
            head = head.next;
        }

        head.next = node;

        return head;
    }
}
