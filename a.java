import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        ArrayList<String> lnames = new ArrayList<>();
        ArrayList<Integer> llist = new ArrayList<>();
        
        int list[] = {1,2,4,1};
        double dlist[] = {1.3,2.01,0.01,4.43};
        for (int i=0;i<list.length;i++) {
            llist.add(list[i]);
        }
        String names[] = {"kurt","peter","anton","xavier"};
        System.out.println(Arrays.toString(list));
        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(dlist));
        
        Collections.sort(llist);
          Arrays.sort(names);
     Arrays.sort(dlist);
        System.out.println(Arrays.toString(list));
         System.out.println(Arrays.toString(names));
 System.out.println(Arrays.toString(dlist));
    }
}
