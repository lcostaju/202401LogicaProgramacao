package Pova320240805;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double numEnt = 0.00,soma=0.00;
        int stopCont = 0,qtdNum=0;

        while (stopCont==0) {
            numEnt = s.nextDouble();
            if(numEnt>=0){
                qtdNum++;
                soma+=numEnt;
            }else{
                stopCont = 1;
            }
        }
        System.out.printf("Soma = %.2f\n",soma);
        System.out.println("Quantidade = "+qtdNum);
    }
}
