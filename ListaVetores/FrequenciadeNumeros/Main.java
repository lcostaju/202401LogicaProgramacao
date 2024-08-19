package ListaVetores.FrequenciadeNumeros;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int numeros[] = new int[n];        
        int numV[] = new int[2001];        

        for (int i = 0; i < n; i++) {
            numeros[i] = s.nextInt();
        }

        for (int j = 0; j < 2001; j++) {
            numV[j] = 0;
        }

        for (int k = 0; k < n; k++) {
            numV[numeros[k]]++;
        }

        for (int l = 0; l < 2001; l++) {
            if(numV[l]!=0)
            System.out.println(l+" aparece "+numV[l]+" vez(es)");
        }

    }
    
}
