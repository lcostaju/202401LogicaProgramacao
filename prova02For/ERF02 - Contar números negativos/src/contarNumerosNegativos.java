import java.util.Scanner;
public class contarNumerosNegativos {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int contNeg = 0;
        int num = 0;

        for (int i = 0; i < n; i++) {
            num = s.nextInt();
            if(num<0){
                contNeg++;
            }
        }
        System.out.println(contNeg);
    }
}
