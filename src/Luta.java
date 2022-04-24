package Guanabara;
import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    public void MarcaLuta(Lutador l1 , Lutador l2){
        if(l1.getCategoria().equals(l2.getCategoria()) && l1 !=l2 ){
           this.aprovada = true;
           this.desafiado= l1;
           this.desafiante = l2;

        }else{
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;

        }
    }

    public void Lutar(){
        if (this.aprovada){
            System.out.println("--------#DESAFIADO#---------");
            this.desafiado.apresentar();
            System.out.println("--------#DESAFIANTE#---------");
            this.desafiante.apresentar();
            Random aleatorio = new Random();
            int vencedor =  aleatorio.nextInt(3);
            System.out.println("==========Resultado Da Luta===========");
            switch(vencedor){
             case 0:
                 System.out.println("Empatou");
                 this.desafiante.empates();
                 this.desafiado.empates();
                 break;
             case 1:
                 System.out.println("vencedor: " + this.desafiado.getName());
                 this.desafiado.ganharLuta();
                 this.desafiante.perderLuta();
                 break;
             case 2:
                 System.out.println("vencedor: " +  this.desafiante.getName());
                 this.desafiante.ganharLuta();
                 this.desafiado.perderLuta();
                 break;
            }
            System.out.println("==========================");
        
        }else{
            System.out.println("A luta nao pode acontecer!");
        }
    }
    public Lutador getDesafiado() {
        return desafiado;
    }
    public Lutador getDesafiante() {
        return desafiante;
    }
    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }
    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }
    public int getRounds() {
        return rounds;
    }
    public boolean getAprovada() {
        return aprovada;
    }
    public void setRounds(int rounds) {
        this.rounds = rounds;
    }
    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}
