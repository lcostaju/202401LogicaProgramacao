import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int n[] = new int[10];
        int posUm = 0;
        n[0] = s.nextInt();

        for (int i = 1; i < n.length; i++) {
            n[i] = n[i-1]*2;
        }

        for (int j = 0; j < n.length; j++) {
            System.out.printf("N[%d] = %d\n",j,n[j]);
        }
        
        s.close();
    }
}
