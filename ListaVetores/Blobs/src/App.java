import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int dias = 0;
        int n = s.nextInt();

        double c[] = new double[n];

        

        for (int j = 0; j < c.length; j++) {
            c[j] = s.nextDouble();
        }

        for (int i = 0; i < n; i++) {
            
            while (c[i]>1) {
                
                c[i] = c[i]-(c[i]/2);
                dias++;
            }
            System.out.println(dias+" dias");
            dias = 0;
        }
    }
}
