import java.util.ArrayList;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] all = new int[30];
        for (int i = 0; i < all.length ; i++) {
            all[i] = i+1;
        }
        int[] student = new int[28];
        for (int i = 0; i < student.length ; i++) {
            student[i] = sc.nextInt();
        }
        ArrayList<Integer> allList = new ArrayList<>();
        ArrayList<Integer> studentList = new ArrayList<>();
        for (int i = 0; i <all.length ; i++) {
            allList.add(all[i]);
        }
        for (int i = 0; i <student.length ; i++) {
            studentList.add(student[i]);
        }

        for (int i = 0; i <studentList.size() ; i++) {
            if (allList.contains(studentList.get(i))) {
                allList.remove(Integer.valueOf(studentList.get(i)));
            }
        }
        for (int i = 0; i <allList.size() ; i++) {
            System.out.println(allList.get(i));
        }
//        System.out.println(allList.get(0));
//        System.out.println(allList.get(1));
    }
}
