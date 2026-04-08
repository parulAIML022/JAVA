import java.util.LinkedList;
public class linkedlisteg {
    public static void main(String[] args){
        LinkedList<String> list = new LinkedList<>();
    list.addFirst("this");
    list.add("is");
    list.add("a");
    list.add("linkedlist");
    System.out.println("current size:"+list.size());
    for(int i = 0; i<list.size();i++){
        System.out.println(list.get(i));
    }
    list.removeFirst();
    list.removeLast();
    list.remove(1);
    System.out.println(list);
}
    }
    