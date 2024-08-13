import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        
        int contIn = 0,contOut=0;
        int n = s.nextInt();
        int num[] = new int[n];


        for (int i = 0; i < n; i++) {
            num[i] = s.nextInt();
        }

        for (int j = 0; j < n; j++) {
            if (num[j]>=10 && num[j]<=20) {
                contIn++;
            }else{
                contOut++;
            }
        }

        System.out.println(contIn+" in");
        System.out.println(contOut+" out");
    }
}
