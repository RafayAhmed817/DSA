package dsalab06;
public class LinkedListStack {
    LinkedList l1= new LinkedList();
    public void pushElements(int element){
        l1.insertFirst(element);
    }
    public void pop(){
        l1.deleteFirst();
    }
    public void displaystack(){
        System.out.println(" ");
        l1.displayList();
    }
    
}
class LinkedList {
private Node  top;
public static class Node{
    public int data;
    public Node next;
 
public Node(int data){
    this.data=data;
}

}
public void insertFirst(int data){
    Node n = new Node(data);
    n.next=top;
    top=n;
}
public Node deleteFirst(){
    Node temp=top;
    top=top.next;
    return temp;
}
public void displayList(){
    Node current = top;
    while(current!=null){
        System.out.println(current.data);
        current=current.next;
    }
}
}
class LinkedListclient {
public static void main(String[] args){
        LinkedListStack st = new LinkedListStack();
        st.pushElements(50);
        st.pushElements(70);
        st.pushElements(190);
        System.out.println("1. stack after push operation ");
        st.displaystack();
        System.out.println("2. stack after pop operation ");
        st.displaystack();
    }
}

