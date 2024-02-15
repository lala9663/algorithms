import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int oneone = sc.nextInt();
        int onetwo = sc.nextInt();
        sc.nextLine();
        int twoone = sc.nextInt();
        int twotwo = sc.nextInt();

        int son = oneone * twotwo + onetwo * twoone;
        int mother = onetwo * twotwo;

        int a= div(son, mother);

        System.out.println(son/a+ " " + mother/a);

    }

    public static int div(int a, int b) {
        if(a%b==0) {
            return b;
        }
        return div(b, a%b);
    }
}
