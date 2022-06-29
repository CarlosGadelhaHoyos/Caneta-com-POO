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

        System.out.println("Carga: " + this.carga + "(A carga por padrão vem inteira)");
        this.setCarga(100);

        System.out.println();
        tampada = true;
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

