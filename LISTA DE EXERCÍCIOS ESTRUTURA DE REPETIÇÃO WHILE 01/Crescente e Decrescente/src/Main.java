import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        
        int x = s.nextInt();
        int y = s.nextInt();

        while (x!=y) {
            
            if(x>y){

                System.out.println("Decrescente");

            }else{
                System.out.println("Crescente");
            }

            x = s.nextInt();
            y = s.nextInt();
        }

        s.close();
    }
}
