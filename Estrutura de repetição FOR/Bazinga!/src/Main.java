import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();
		//s.nextLine();

        for (int i = 1; i <= t; i++) {
            
            String sheldon = s.next();
            String raj = s.next(); 
			
			
			 
            if((sheldon.equals("tesoura")&&(raj.equals("papel")||raj.equals("lagarto")))||
            (sheldon.equals("papel")&&(raj.equals("pedra")||raj.equals("Spok")))||
            (sheldon.equals("pedra")&&(raj.equals("lagarto")||raj.equals("tesoura")))||
            (sheldon.equals("lagarto")&&(raj.equals("Spok")||raj.equals("papel")))||
            (sheldon.equals("Spok")&&(raj.equals("tesoura")||raj.equals("pedra")))
            ){
                System.out.println("Caso #"+i+": Bazinga!");
            }else if(sheldon.equals(raj)){
                System.out.println("Caso #"+i+": De novo!");
            }else{
                System.out.println("Caso #"+i+": Raj trapaceou!");
            }
				

				//System.out.println(sheldon+" "+raj);
                

                
        }
            

            

        s.close();
    }
}
