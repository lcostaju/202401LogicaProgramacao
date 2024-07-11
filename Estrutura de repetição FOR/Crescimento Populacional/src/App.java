import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();
        int pa,pb,anos,popa=0,popb=0;
        double ga,gb;

        for (int i = 0; i < t; i++) {
           pa =s.nextInt();
           pb =s.nextInt();
           ga = s.nextDouble();
           gb = s.nextDouble();

           popa = pa;
           popb = pb;
           anos = 0;

           int maior = 0;
           
           for (int j = 1; j <= 101 && maior<1 ; j++) {

            popa += popa*(ga/100.0);
            popb += popb*(gb/100.0);

            if(popa>popb||j>100){
                maior=1;
                anos=j;
            }
            
           }
           if(anos>100){
            System.out.println("Mais de 1 seculo.");
           }else{
            System.out.println(anos+" anos.");
           }
           


        }
    }
}
