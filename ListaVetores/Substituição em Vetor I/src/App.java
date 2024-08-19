import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int x[] = new int [10];
        int i = 0;

        for (i = 0; i < x.length; i++) {
            x[i] = s.nextInt();
        }

        for(i=0;i<x.length;i++){
            if(x[i]<=0){
                x[i] = 1;
            }
            System.out.printf("X[%d] = %d\n",i,x[i]);
        }
        s.close();

    }
}
