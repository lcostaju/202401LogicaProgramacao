import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        //Recebe valor do raio
        double raio = s.nextDouble();
        calculaVolume(raio);
        s.close();
    }
    static void calculaVolume(double raio){
        double volume = (4*3.1416*Math.pow(raio, 3))/3;
        System.out.printf("Volume : %.2f\n",volume);
    }
}
