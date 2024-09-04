import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        //Entrada de parametros
        double altura = s.nextDouble();
        char sexo = s.next().charAt(0);

        calculaPeso(altura,sexo);
        s.close();
    }

    static void calculaPeso(double altura, char sexo){
        double pesoIdeal = 0.0;
        if (sexo == 'M') {
            pesoIdeal = (72.7 * altura) - 58;
        }else{
            pesoIdeal = (62.1 * altura) - 44.7;
        }

        System.out.printf("%.2f\n",pesoIdeal);
    }
}
