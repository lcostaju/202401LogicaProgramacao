import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int n[] = new int[1000];
        int val = 0;
        int t = s.nextInt();

        while (val <999) {
            for (int i = 0; i < t; i++) {
                if(val >999) break;
                n[val] = i;
                val++;
            }
        }
        
        for (int j2 = 0; j2 < n.length; j2++) {
            System.out.printf("N[%d] = %d\n",j2,n[j2]);
        }
        s.close();
    }
}
