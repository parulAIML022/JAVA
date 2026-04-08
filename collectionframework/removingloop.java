class Node{
    int data;
    Node next;

Node(int data){
    this.data = data;
    this.next = null; 
}
}
public class removingloop {
    static boolean loopremoval(Node head){
        Node hare = head;
        Node tortoise = head;
        while(hare != null & tortoise != null){
            tortoise = head.next;
            hare = head.next.next;
            if(slow == fast){
                break;
            }
        }
        tortoise = head;
        while(tortoise.next != hare.next){
            tortoise = tortoise.next;
            hare = hare.next;
        }
        hare.next = null;
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = head.next.next;
        loopremoval(head);
    }
}
