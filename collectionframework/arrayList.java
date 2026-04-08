import java.util.ArrayList;
import java.util.Collections;

public class arrayList {
    public static void main(String[] args){
        ArrayList<Integer> list  = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(8);
        System.out.println(list);
        int element = list.get(2);
        System.out.println(element);
        list.add(2,3);
        list.set(0,1);
        list.remove(3);
        System.out.println(list);
        Collections.sort(list);    
    }  

}
