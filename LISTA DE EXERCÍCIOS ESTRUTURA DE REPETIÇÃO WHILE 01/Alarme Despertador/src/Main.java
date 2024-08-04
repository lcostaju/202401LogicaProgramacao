import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int h1 = s.nextInt();
        int m1 = s.nextInt();
        int h2 = s.nextInt();
        int m2 = s.nextInt();

        while (h1 > 0 || m1 > 0 || h2 > 0 || m2 > 0) {

            // Conversão das horas e minutos para minutos totais desde meia-noite
        int totalMinutos1 = h1 * 60 + m1;
        int totalMinutos2 = h2 * 60 + m2;

        // Se o segundo horário for menor que o primeiro, adicionamos 24 horas (1440 minutos) ao segundo horário
        if (totalMinutos2 < totalMinutos1) {
            totalMinutos2 += 24 * 60;
        }

        // Subtração dos minutos totais
        int resultado = totalMinutos2 - totalMinutos1;

        System.out.println(resultado);

            h1 = s.nextInt();
            m1 = s.nextInt();
            h2 = s.nextInt();
            m2 = s.nextInt();
        }
        s.close();
    }
}
