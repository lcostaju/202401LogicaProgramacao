import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }        

        for (int i = n-1; i >=0; i--) {
            
            if (arr[i]<0) {
                System.out.println(arr[i]);
            }
        }
    }
}
