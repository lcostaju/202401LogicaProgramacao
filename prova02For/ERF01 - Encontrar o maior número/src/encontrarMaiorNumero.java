import java.util.Scanner;
public class encontrarMaiorNumero {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int num = Integer.MIN_VALUE;
        int maior = Integer.MIN_VALUE;
        //System.out.println("Hello, World!");

        for (int i = 0; i < n; i++) {
            num = s.nextInt();
            if(num>maior){
                maior = num;
            }
        }
        System.out.println("Maior = "+maior);
    }
}
