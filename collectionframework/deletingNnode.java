import java.util.LinkedList;
import java.util.Scanner;
public class deletingNnode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(23);
        list.add(43);
        list.add(39);
        list.add(42);
        list.add(12);
        for(int i = 0;i<list.size();i++){
            System.out.println(list.get(i)+"->");
    }
    System.out.println("enter the nth index to be removed:");
    int n = sc.nextInt();
    int index = list.size() - n;
    if(index>0 && index<=list.size()){
        list.remove(index);
    }
    System.out.println(list);
    sc.close();

    } 
    
    

}
