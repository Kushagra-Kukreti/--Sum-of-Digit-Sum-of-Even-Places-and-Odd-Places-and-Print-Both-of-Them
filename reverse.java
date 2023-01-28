import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        List<Integer> h = new ArrayList<>();

        while (true) {
            System.out.println("enter number to be reverse");

            int i = scanner.nextInt();
            int o = i, c = 0;
            while (o != 0) {
                o /= 10;
                c += 1;
            }
            System.out.println(c);
            int u = c / 2;
            Double r = Math.pow(10, u);
            System.out.println(r + "  " + u);
            double t = (i % r);
            double y = (i / r);
            double g = (t * r * 10) + y;
            System.out.println(t + "   " + y);
            System.out.println(g);
            System.out.println("exit for 1");
            i = scanner.nextInt();
            if (i == 1) {
                break;
            } else {

            }

        }

    }
}
