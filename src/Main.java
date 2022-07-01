import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Caneta c1 = new Caneta();
        Scanner scan = new Scanner(System.in);
        String querContinuar;

        do{

            
            querContinuar = scan.nextLine();
            querContinuar.toLowerCase();
            querContinuar.strip();

        }while(querContinuar.equals("s"));
    }
}