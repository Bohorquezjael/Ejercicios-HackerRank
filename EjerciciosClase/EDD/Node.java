package EDD;

public class Node {
    Node next;
    Object type;
    
    public Node(Object type2) {
        this.type = type2;
        this.next = null;
    }

    public Object getType() {
        return type;
    }

    public void setType(Object type) {
        this.type = type;
    }

    public Node getNext() {
        return next;
    }
    
    public void setNext(Node next) {
        this.next = next;
    }

}
