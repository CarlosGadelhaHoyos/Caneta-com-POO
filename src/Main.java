import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        MetodosDoLoop ml = new MetodosDoLoop();
        Scanner scan = new Scanner(System.in);
        String respostaMetodosLoop;
        String querContinuar;

        do{

            respostaMetodosLoop = ml.cabeçalhoPergunta();
            ml.tratandoAcao(respostaMetodosLoop);

            System.out.print("Deseja continuar? [s]/[n]: ");
            querContinuar = scan.nextLine();
            querContinuar.toLowerCase();
            querContinuar.strip();

        }while(querContinuar.equals("s"));
    }
}