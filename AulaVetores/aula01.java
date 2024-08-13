import java.util.Scanner;

class aula01 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);		

	
	int n = s.nextInt();
	int numeros[] = new int[n];
	
	for(int i=0; i<n; i++){
		numeros[i] = s.nextInt();
	}

	for(int i=0; i<n; i++){
		System.out.println("Numero " + (i + 1) + " = " + numeros[i]);
	}
	//Numero 1 = 4
	//Numero 2 = 4
	//Numero 3 = 2

	// modificar o for acima para imprimir no formato : [4,4,2]
	for(int i=0; i<n; i++){
		//modificar aqui
	}

	
  }
}