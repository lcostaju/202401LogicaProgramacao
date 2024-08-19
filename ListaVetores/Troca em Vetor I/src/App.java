import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner s =  new Scanner(System.in);
        int nlength = 20;
        int n[] = new int[nlength];
        int nAux[] = new int[nlength];
        int i = 0;

        for (i = 0; i < n.length; i++) {
            n[i] = s.nextInt();
            nAux[i] = n[i];
        }

        for (int j = 0; j < n.length; j++) {
            n[j] = nAux[(nlength-1)-j];
            System.out.printf("N[%d] = %d\n",j,n[j]);
        }

    }
}
