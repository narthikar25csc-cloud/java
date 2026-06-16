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



