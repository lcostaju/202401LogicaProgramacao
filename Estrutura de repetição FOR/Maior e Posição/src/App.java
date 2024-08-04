//Será que estou adicionando essa classeno repositório certo?
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int n=0,maior=0,posicao=0;

        for (int i = 1; i <=100; i++) {
            
            n=s.nextInt();

            if (n>maior) {
                maior=n;
                posicao=i;
            }

        }

        System.out.println(maior);
        System.out.println(posicao);
        s.close();
    }
}
