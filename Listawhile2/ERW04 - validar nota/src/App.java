import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        double nota = s.nextDouble();

        while ((nota<0 || nota>10)&&(nota<100 || nota>200)) {
            nota = s.nextDouble();
            System.out.println("nota invalida");
        }
        System.out.printf("%.1f\n",nota);
        s.close();
    }
}
