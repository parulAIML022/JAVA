package array_listquestions;
import java.util.ArrayList;
import java.util.Collections;
public class arraySort {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(5);
        list.add(0,40);
        Collections.sort(list);
        System.out.println(list);   
    }
    
}
