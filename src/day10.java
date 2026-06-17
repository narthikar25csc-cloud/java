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
/*
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
*/
/*
import java.util.LinkedList;

public class Day10Linked {

    static class Student {
        String name;
        int regNo;
        int marks;

        Student(String name, int regNo, int marks) {
            this.name = name;
            this.regNo = regNo;
            this.marks = marks;
        }
    }

    static void removeStudent(LinkedList<Student> students) {
        System.out.println("Removed : " + students.removeFirst().name);
    }

    static void updateStudent(LinkedList<Student> students) {
        for (Student s : students) {
            if (s.name.equals("Narthi")) {
                s.marks = 95; // Update marks from 85 to 95
            }
        }
    }

    public static void main(String[] args) {

        LinkedList<Student> students = new LinkedList<>();

        students.add(new Student("Narthi", 101, 80));
        students.add(new Student("viveka", 102, 75));
        students.add(new Student("Nivetha", 103, 90));
        students.add(new Student("Subaa", 104, 85));
        students.add(new Student("Dhivya", 105, 88));

        removeStudent(students);

Student Details;
        updateStudent(students);

        System.out.println("\nStudent Details");
        for (Student s : students) {
            System.out.println(
                    s.name + " " +
                            s.regNo + " " +
                            s.marks
            );
        }
    }
}
 */

      public class day11 {
        static void main() {
            String name = null;
            try {
                name = null;
                System.out.println(name.charAt(3));
                System.out.println(45 / 0);
            } catch (ArithmeticException e) {
                System.out.println("Arithmetic Exception");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array Index of Bound Exception");
            } catch (Exception e) {
                System.out.println("Exception");
            } finally {
                System.out.println("This will always execute");
                name="VETIAS";
            }
            System.out.println("Still running");
            System.out.println("Name:" + name);
        }
    }











