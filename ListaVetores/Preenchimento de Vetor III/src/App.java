import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        double x = s.nextDouble();
        double n[] = new double[100];
        n[0] = x;

        for (int i = 1; i < n.length; i++) {
            n[i] = n[i-1]/2;
        }

        for (int j = 0; j < n.length; j++) {
            System.out.printf("N[%d] = %.4f\n",j,n[j]);
        }
    }
}
