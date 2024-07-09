import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        String parImpar = "";
        String negPos = "";
        int n=s.nextInt();
        
        for(int i=0;i<n;i++){
            
            int x = s.nextInt();

            if(x==0){
                
                System.out.println("NULL");

            }else{
                if(x%2==0){
                    parImpar = "EVEN";
                }else{
                    parImpar = "ODD";
                }
    
                if (x>0) {
                    negPos = "POSITIVE";                
                }else{
                    negPos = "NEGATIVE";
                }
                System.out.println(parImpar+" "+negPos);
            }

            

            
        }
        
    }
}
