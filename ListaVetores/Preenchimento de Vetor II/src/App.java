import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int n[] = new int[10];
        int val = 0;
        int t = s.nextInt();

        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < t; j++) {
                n[i] = j;                
            }
        }
        
        for (int j2 = 0; j2 < n.length; j2++) {
            System.out.printf("N[%d] = %d\n",j2,n[j2]);
        }
        s.close();
    }
}
