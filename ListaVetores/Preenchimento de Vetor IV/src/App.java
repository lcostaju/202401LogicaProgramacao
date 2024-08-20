import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int qtdNum = 15;
        int num = 0;
        int arrImpar[] = new int[5];
        int arrPar[] = new int[5];
        int indexPar =0;
        int indexImpar =0;

        for (int i = 0; i < qtdNum; i++) {
            num = s.nextInt();
            if(num %2 == 0){                
                arrPar[indexPar] = num;
                indexPar++;
            }else{               
                arrImpar[indexImpar] = num; 
                indexImpar++;            
            }

            if(indexPar==5){
                indexPar=0;
                for (int j = 0; j < arrPar.length; j++) {
                    System.out.println("par[" + j + "] = " + arrPar[j]);
                }
            }else if(indexImpar==5){
                indexImpar=0;
                for (int k = 0; k < arrImpar.length; k++) {
                    System.out.println("impar[" + k + "] = " + arrImpar[k]);
                }
            }
        }
        for (int i = 0; i < indexImpar; i++) {
			System.out.println("impar[" + i + "] = " + arrImpar[i]);
        }
        for (int i = 0; i < indexPar; i++) {
			System.out.println("par[" + i + "] = " + arrPar[i]);
        }
    }
}
