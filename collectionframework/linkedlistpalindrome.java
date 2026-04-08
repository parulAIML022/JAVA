import java.util.LinkedList;
public class linkedlistpalindrome {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(1);
        list.add(2);
        list.add(1);
        if(isPalindrome(list)){
            System.out.println("LinkedList is a Palindrome");
        }
        else{
            System.out.println("LinkedList is not a Palindrome");
        }
    }
    public static boolean isPalindrome(LinkedList<Integer> list){
        int left = 0;
        int right = list.size()-1;
        while(left<right){
            if(!list.get(left).equals(list.get(right))){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    
}
