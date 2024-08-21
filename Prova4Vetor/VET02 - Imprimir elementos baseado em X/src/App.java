import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }

        int x = s.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if(i%x==0){
                System.out.printf("Pos[%d] = %d\n",i,arr[i]);
            }
        }
    }
}
