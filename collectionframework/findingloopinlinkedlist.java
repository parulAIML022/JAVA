// hare and tortoise method where hare moves two steps ahead and tortoise only one
import java.util.LinkedList;
class ListNode {
    int val;
    ListNode next;
    ListNode(int val){
        this.val = val;
        this.next = next;
    }
}
public class findingloopinlinkedlist {
        static boolean detectLoop(ListNode head){
            ListNode hare = head;
            ListNode tortoise = head;
            while(hare != null && tortoise.next != null){
                tortoise = tortoise.next;
                hare = hare.next.next;
                if(hare == tortoise){
                    return true;
                }
            }
            return false;
        }
        public static void main(String[] args) {
            ListNode head = new ListNode(1);
            head.next = new ListNode(2);
            head.next.next = new ListNode(3);
            head.next.next.next = new ListNode(4);
            head.next.next.next.next = head.next;
            System.out.println(detectLoop(head));
    }
}
