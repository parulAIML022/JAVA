public class stackusinglinkedlist{
    static class Node{ //create class node
        int data;
        Node next;
        static Node(int data){ // constructor created
            this.data = data;
            this.next = null;
        }
    }
    static class Stack{
        public static Node head = null;
        public static void push(int data){
            Node newNode = new Node(data);
            if(head == null){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            Node top = head;
            head = head.next;
            return top.data;
        }
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            Node top = head;
            return top.data;
        }
    }
    public static void main(String[] args){
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
    }
}

