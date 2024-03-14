package EDD;

public class LinkedList {
    private Node head;
    private Node tail;

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public void addElementTail(Object type) {
        Node n = new Node(type);
        if (head == null) {
            head = n;
            tail = head;
            return;
        } else {
            tail.next = n;
            tail = n;

        }
    }

    public void addElementHead() {
        // TODO
    }

    public void removeElement() {
        // TODO
    }
    
    public void imprimeElementos(){
        Node tmp = head;
        while(tmp != null){
            System.out.println(tmp.type);
            tmp = tmp.next;
        }
    }

}