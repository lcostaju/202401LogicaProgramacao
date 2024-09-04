import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int x[] = new int[n];
        int y[] = new int[n];

        for (int i = 0; i < x.length; i++) {
            x[i] = s.nextInt();
        }

        for (int i = 0; i < y.length; i++) {
            y[i] = s.nextInt();
        }

        somaVetor(x,y);
        produtoVetor(x,y);
        s.close();
    }

    static void somaVetor(int x[],int y[]){
        System.out.print("Soma : {"+(x[0]+y[0]));
        for (int i = 1; i < y.length; i++) {

            // if (i!= y.length -1) {
            //     System.out.print(x[i]+y[i]+",");
            // }else{
            //     System.out.print(x[i]+y[i]);
            // }
            System.out.print(", "+(x[i]+y[i]));

        }
        System.out.print("}\n");
    }

    static void produtoVetor(int x[],int y[]){
        System.out.print("Produto : {"+x[0]*y[0]);
        for (int i = 1; i < y.length; i++) {

            // if (i!= y.length -1) {
            //     System.out.print(x[i]*y[i]+",");
            // }else{
            //     System.out.print(x[i]*y[i]);
            // }
            System.out.print(", "+x[i]*y[i]);

        }
        System.out.print("}\n");
    }
}
