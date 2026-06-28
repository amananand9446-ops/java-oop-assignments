package Node;

public class Node {
    int data;
    Node next;

    public Node(int data){
        this.data=data;
        this.next=null;
    }
    public Node(Node other){
        this.data=other.data;
        if(other.next!=null){
            this.next=new Node(other.next); //deep copy
        }
        else{
            this.next=null;
        }
    }
}

