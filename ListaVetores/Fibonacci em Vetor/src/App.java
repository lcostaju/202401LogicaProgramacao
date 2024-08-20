import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        int enesimo = 0;
        
        long fib[] = new long[61];

        fib[0] = 0;
        fib[1] = 1;

        for (int i = 2; i < fib.length; i++) {
            fib[i] = fib[i-1] + fib[i-2];
        }

        

        for (int j = 0; j < t; j++) {
            enesimo = s.nextInt();
            System.out.printf("Fib(%d) = %d\n",enesimo,fib[enesimo]);
        }
        

        

    }
}
