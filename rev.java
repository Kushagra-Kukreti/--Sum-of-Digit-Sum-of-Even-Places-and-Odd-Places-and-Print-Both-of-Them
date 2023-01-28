import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class rev {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        List<Integer> h = new ArrayList<>();

        while (true) {
            System.out.println("enter number to be reverse  ");

            int i = scanner.nextInt();
            int o = i, y = 0, u = 0, c = 0;
            while (o != 0) {
                o /= 10;
                c += 1;
            }
            o = i;
            System.out.println(c);
            int p = c;
            System.out.print("reverce");
            for (int j = 1; j <= c; j++) {
                int t = o % 10;
                o /= 10;

                if (p % 2 == 0) {
                    y = y + t;

                } else {
                    u = u + t;
                }
                p -= 1;
                System.out.print(t);

            }
            System.out.println("  ");
            System.out.println("Sum of Even" + y + "Sum of odd" + u);
            System.out.println("exit for 1");
            i = scanner.nextInt();
            if (i == 1) {
                break;
            } else {

            }

        }

    }
}
