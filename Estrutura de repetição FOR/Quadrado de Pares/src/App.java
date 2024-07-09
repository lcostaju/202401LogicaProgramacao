import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        // execicio1
        int n = 0, pow = 0;
        n = s.nextInt();

        for (int i = 1; i <= n; i++) {

            if (i % 2 == 0) {
                pow = i * i;
                System.out.printf("%d^2 = %d\n", i, pow);
            }

        }
        s.close();
    }
}
