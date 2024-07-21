import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int m, n, ini, fim, sum = 0;

        m = s.nextInt();
        n = s.nextInt();

        while (m != 0 || n != 0) {
            if (m > n) {
                ini = n;
                fim = m;
            } else {
                ini = m;
                fim = n;
            }
            for (int i = ini; i <= fim; i++) {
                System.out.println(i);
                sum += i;
            }
            System.out.println("Sum="+sum);
            m = s.nextInt();
            n = s.nextInt();
        }
    }
}
