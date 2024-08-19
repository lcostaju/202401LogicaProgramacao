import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        
        double a[] = new double[100];

        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextDouble();
        }

        for (int j = 0; j < a.length; j++) {
            
            if (a[j]<=10.0) {
                System.out.printf("A[%d] = %.1f\n",j,a[j]);
            }
        }

        s.close();
    }
}
