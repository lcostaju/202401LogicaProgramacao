import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        char sexo = 'm';
        int idade = Integer.MIN_VALUE;
        double salario = Integer.MIN_VALUE;
        char seguir = 's';

        double mediaSal=0.00;
        double totalSal=0.00;
        int contSal=0;
        int contSalM=0;

        int menorIdade=Integer.MAX_VALUE;
        int maiorIdade=Integer.MIN_VALUE;

        while (seguir!='n') {

            idade = s.nextInt();
            sexo = s.next().charAt(0);
            salario = s.nextDouble();
            seguir = s.next().charAt(0);

            //Acumua salario
            totalSal+=salario;
            contSal++;
            //Fazendo média de slarios
            mediaSal=totalSal/contSal;

            //calcula maior idade
            if(idade>maiorIdade){
                maiorIdade = idade;
            }
            //calcula menor idade
            if(idade<menorIdade){
                menorIdade=idade;
            }
            if(sexo=='f'&& salario>3000.00){
                contSalM++;
            }
        }
        System.out.println(mediaSal);
        System.out.println(menorIdade+' '+maiorIdade);
        System.out.println(contSalM);
        //System.out.println();
    }
}
