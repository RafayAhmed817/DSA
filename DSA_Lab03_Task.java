package lab03tasks;

class Node {
    int data;
    Node address;
    
    public Node(int data) {
        this.data = data;
        this.address = null;
    }
}

class LinkedList {
    Node head, tail;
    int size;

    public LinkedList() {
        head = tail = null;
        size = 0;  
    }
    
    public void add(int d) {
        Node n = new Node(d);
        
        if (head == null) {
            head = tail = n;  
        } else {
            tail.address = n;  
            tail = n;  
        }
        
        size++;  
    }
    
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.address;
        }
        System.out.println();
    }
    
    public void printSize() {
        System.out.println("Size of the list: " + size);  
    }
}

public class main {
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        
        l1.printList();  
        l1.printSize();  
    }
}
