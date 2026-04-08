import java.util.LinkedList;
import java.util.Scanner;
public class linkedlistpbtwo {
    public static void main(String[] args){
        LinkedList<Integer> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of elements(enter elements only in the range of 1-50):");
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i<n;i++){
            System.out.println("enter element at"+i+"position:");
            int value = sc.nextInt();
            list.add(value);
        }
        System.out.println(list);
        for(int i = 0;i < n;i++){
            if(list.get(i)>25){
                list.remove(i);
            }
        }
        System.out.println(list);
        sc.close();
    }
}

