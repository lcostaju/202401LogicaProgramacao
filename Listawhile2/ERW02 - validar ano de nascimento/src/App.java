import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        
        int ano = s.nextInt();

        while (ano<1900 || ano>2023) {
            System.out.println("Ano invalido");
            ano = s.nextInt();
        }
        System.out.println(ano);

    }
}
