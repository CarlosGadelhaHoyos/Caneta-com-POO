import java.util.Scanner;

public class Caneta {

    String cor;
    String modelo;
    int carga;
    boolean tampada;
    Scanner scan = new Scanner(System.in);

    //Metodos 
    public Caneta(){

        System.out.println("Caneta criada com sucesso!");
        System.out.println("Antes de proceguir. Atribua as características da sua caneta:\n ");
        
        System.out.println("\tCor: ");
        this.setCor();

        System.out.println("Modelo: ");
        this.setModelo();

        System.out.println("Carga: " + this.carga + "(A carga por padrão vem inteira)");
        this.setCarga(100);

        System.out.println("(A caneta por padrão vem tampada)");
        tampada = true;

        this.status();
    }


    public void escrever(){

        String respostaDestampar;

        if(this.tampada = false){

            System.out.println("Escrevendo...");
            this.setCarga(this.getCarga() - 5);

        }else if(this.tampada = true){

            System.out.println("ERRO! A caneta nao pode escrever se estiver tampada.");
            System.out.println("Destampar? [s]/[n]");
            respostaDestampar = scan.nextLine();

            respostaDestampar.toLowerCase();
            respostaDestampar.strip();

            if(respostaDestampar.equals("s")){

                this.destampar();

            }else if(respostaDestampar.equals("n")){

                System.out.println("Ah, ok.");
            }else{

                System.out.println("Tente novamente. Resposta inválida.");
            }
        }
    }

    public void tampar() {

        this.tampada = true;
        System.out.println("Caneta tampada.");
    }

    public void destampar(){

        this.tampada = false;
        System.out.println("Caneta destampada.");
    }

    public void status(){

        System.out.println("Caneta STATUS");
        System.out.println("\tCor: " + this.getCor());
        System.out.println("\tCarga: " + this.getCarga());
        System.out.println("\tModelo: " + this.getModelo());
        System.out.println("\tTampada? : " + this.getTampada());

    }

    //Metodos acessores
    public void setCor(){

        this.cor = scan.nextLine();
    }

    public String getCor(){

        return this.cor;
    }

    public void setModelo(){

        this.modelo = scan.nextLine();
    }

    public String getModelo(){

        return this.modelo;
    }

    public void setCarga(int c){

        this.carga = c;
    }

    public int getCarga(){

        return this.carga;
    }

    //A variável tampada não terá metodo setter, por ter os metodos "tampar" e "destampar"
    public boolean getTampada(){

        return this.tampada;
    }
}