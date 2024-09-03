import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println(somaInteiros(s.nextInt(),s.nextInt()));
        s.close();
    }

    static int somaInteiros (int numero1, int numero2){
        int resultado;
        resultado = numero1 + numero2;
        return resultado;
    }
}
