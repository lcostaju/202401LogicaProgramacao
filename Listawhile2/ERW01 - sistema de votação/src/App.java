import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int c1=0,c2=0,c3=0,nu=0,branco=0;
        int voto = s.nextInt();
        while (voto>0) {
            
            switch (voto) {
                case 1:
                    c1++;
                    break;
                case 2:
                    c2++;
                    break;
                case 3:
                    c3++;
                    break;
                case 4:
                    nu++;
                    break;
                case 5:
                    branco++;
                    break;
                default:
                    break;
            }
            voto = s.nextInt();

            }
            System.out.println("Candidato 1 : "+c1+" voto(s)");
            System.out.println("Candidato 2 : "+c2+" voto(s)");
            System.out.println("Candidato 3 : "+c3+" voto(s)");
            System.out.println("Nulos : "+nu+" voto(s)");
            System.out.println("Brancos : "+branco+" voto(s)");
        }


    }

