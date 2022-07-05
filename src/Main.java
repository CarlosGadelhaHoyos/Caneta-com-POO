import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Caneta c1 = new Caneta();
        Scanner scan = new Scanner(System.in);
        String querContinuar;
        String oQueDesejaFazer;

        
        do{

            System.out.println("\nO que deseja fazer?\n\nEscrever \t[e]\nRabiscar \t[r]\nDestampar \t[d]\nTampar \t[t]");
            oQueDesejaFazer = scan.nextLine();
            oQueDesejaFazer.toLowerCase();
            oQueDesejaFazer.strip();

            if (oQueDesejaFazer.equals("e")){

                c1.escrever();

            }else if (oQueDesejaFazer.equals("r")){

                c1.rabiscar();

            }else if (oQueDesejaFazer.equals("d")){

                c1.destampar();

            }else if(oQueDesejaFazer.equals("t")){

                c1.tampar();

            }else{

                System.out.println("Tente novamente. Resposta inválida.");
            }

            System.out.println("Deseja continuar? [s]/[n]");
            querContinuar = scan.nextLine();
            querContinuar.toLowerCase();
            querContinuar.strip();

        }while(querContinuar.equals("s"));
    }
}