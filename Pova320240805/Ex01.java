package Pova320240805;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numEnt = 0,primNum=0,qtdPares=0,qtdImpar=0,contAuxMedia = 0;
        double media = 0.0000,soma = 0;

        numEnt = s.nextInt();
        primNum = numEnt;

        while (soma<=primNum) {
            numEnt = s.nextInt();
            if(numEnt % 2 == 0){
                qtdPares++;
            }else{
                qtdImpar++;
            }
            soma+=numEnt;
            media = soma/(qtdImpar+qtdPares);
            //media = 11.0/2.0;
        }
        
        System.out.println("Pares = "+qtdPares);
        System.out.println("Impares = "+qtdImpar);
        System.out.printf("Média = %.2f\n",media);
        s.close();
    }
}
