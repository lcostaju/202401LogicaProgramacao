import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr1[] = new int[n];
        int arr2[] = new int[n];
        int arrResult[] = new int[n];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = s.nextInt();
        }

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = s.nextInt();
        }

        for (int i = 0; i < arrResult.length; i++) {
            arrResult[i] = arr1[i]*arr2[i];
        }
        

        
        for (int i = 0; i < arrResult.length; i++) {
            if(i==0){
                System.out.printf("{");
            }

            if(i!=n-1){
                System.out.printf(arrResult[i]+",");
            }else{
                System.out.printf("%d",arrResult[i]);
            }
            

            if (i==n-1) {
                System.out.printf("}\n");
            }
            
        }
    }
}
