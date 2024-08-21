import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        int qtdPar = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
            if (arr[i] % 2 == 0) {
                qtdPar++;
            }
        }

        System.out.println(qtdPar);

        for (int i = 0; i < arr.length; i++) {
            if(i==0){
                System.out.printf("{");
            }

            if (arr[i] %2 == 0) {
                if (i!=n-1) {
                    System.out.printf("%d;",arr[i]);
                }else{
                    System.out.printf("%d",arr[i]);
                }
            }          

            if (i==n-1) {
                System.out.printf("}\n");
            }
        }
    }
}
