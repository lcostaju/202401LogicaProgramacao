import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        double sal = 0,totalSal=0,mediaSal=0;
        int contSal = 0;
        while (sal<100000.00 && sal>=0) {
            sal = s.nextDouble();
            if(sal<100000.00 && sal>=0){
            contSal++;                       
            totalSal+=sal;
            mediaSal=totalSal/contSal;
            }
            
        }
        System.out.printf("R$ %.2f\n",mediaSal);
        
        
        s.close();
    }
}
