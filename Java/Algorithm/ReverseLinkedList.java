class ReverseLinkedList{
static class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}
static Node head;
static void print(){
    Node temp=head;
    while(temp!=null){
        System.out.print(temp.data+" ");
        temp=temp.next;
    }
}
static void reverse(){
    Node previous=null;
    Node next=null;
    Node current=head;
    while(current!=null){
        next=current.next;
        current.next=previous;
        previous=current;
        current=next;
    }
    head=previous;

}
public static void main(String[] args) {
    head=new Node(1);
    head.next=new Node(2);
    head.next.next=new Node(3);
    print();
    System.out.println();
    System.out.println("Reverse Order LinkedList");
    reverse();
    print();
    
}
}