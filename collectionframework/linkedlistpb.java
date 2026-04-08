import java.util.LinkedList;
public class linkedlistpb {
    public static void main(String[] args){
        LinkedList<Integer> list = new LinkedList<>();
    list.add(5);
    list.addFirst(1);
    list.add(7);
    list.add(3);
    list.add(8);
    list.add(2);
    list.add(3);
    System.out.println(list);
    int value =7;
    for(int i = 0;i<list.size();i++){
        if(value == list.get(i)){
            System.out.println(i);
        }
    }
    }
    }
