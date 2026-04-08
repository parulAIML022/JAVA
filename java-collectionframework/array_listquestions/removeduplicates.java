package array_listquestions;
import java.util.ArrayList;
import java.util.Collections;
public class removeduplicates{
    static void duplicates(ArrayList<Integer> list){
        for(int i = 0 ; i < list.size() ; i++){
            for(int j = i+1 ; j < list.size() ; j++){
                if(list.get(i).equals(list.get(j))){
                    list.remove(j);
                    j--;
                }
            } 
        }
    }
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(10);
        list.add(30);
        duplicates(list);
        System.out.println(list);
    }
}