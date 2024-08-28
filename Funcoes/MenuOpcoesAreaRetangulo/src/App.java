import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int opcao = 0;
        double base = 0.0,altura=0.0;
        while (opcao != 3) {     
            System.out.print("Digite o valor da base: ");      
            base = s.nextDouble();
            System.out.print("Digite o valor da altura: ");
            altura = s.nextDouble();
            System.out.println("Menu de opções\n1-Mostrar Area\n2-Mostrar Perímetro\n3-Sair\nDigite a opção desejada:");
            opcao = s.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Area: "+base*altura);
                    break;
                case 2:
                    System.out.println("Perimetro: "+ 2*(base+altura));
                    break;
                case 3:
                    System.out.println("Fim do programa!");    
                    break;
                default:
                    System.out.println("Opção Inválida!");
                    break;
            }

        }
    }
}
