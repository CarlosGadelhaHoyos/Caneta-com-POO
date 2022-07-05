import java.util.Scanner;

public class MetodosDoLoop extends Caneta{

    public String cabeçalhoPergunta() {

        Scanner scan = new Scanner(System.in);
        String oQueDesejaFazer;

        System.out.println("\nO que deseja fazer?\n\nEscrever \t[e]\nRabiscar \t[r]\nDestampar \t[d]\nTampar \t\t[t]");
        System.out.print("\nResposta: ");
        oQueDesejaFazer = scan.nextLine();
        oQueDesejaFazer.strip();
        oQueDesejaFazer.toLowerCase();

        return oQueDesejaFazer;
    }

    public void tratandoAcao(String resp){

        if (resp.equals("e")){

            this.escrever();

        }else if (resp.equals("r")){

            this.rabiscar();

        }else if (resp.equals("d")){

            this.destampar();

        }else if(resp.equals("t")){

            this.tampar();

        }else{

            System.out.println("Tente novamente. Resposta inválida.");
        }
    }
}