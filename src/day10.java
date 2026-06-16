/*
import java.util.ArrayList;
public class day10 {
    static void main() {
        ArrayList<String> list = new ArrayList();
        list.add("Narthika Raja");
        list.add("Nivetha");
        list.add("Menaga");
        list.add("Monisha");
        list.add("Meenakshi");
        System.out.println();
        list.remove("Meenakshi");
        list.add("Mithra");

        for (String s : list) {
            System.out.println(s);
        }
        System.out.println();
    }
}
 */
import java.util.LinkedList;
public class day10 {
    static void main() {
        LinkedList<String> queue = new LinkedList<String>();
        queue.add("Sweatha");
        queue.add("Menaga");
        queue.add("Narthika");
        queue.add("Mithra");
        queue.add("Nivetha");
        while(!queue.isEmpty()) {
            process(queue);
        }
    }
    static void process(LinkedList<String> queue){
        String removed=queue.removeFirst();
        System.out.println("Removed:"+removed);

    }
}