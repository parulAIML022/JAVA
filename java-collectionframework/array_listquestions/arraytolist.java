package array_listquestions;
import java.util.ArrayList;
import java.util.Collections;
public class arraytolist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(300);
        Integer[] arr = list.toArray(new Integer[0]);
        System.out.println(arr);
    }
}
