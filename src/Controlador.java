


public class Controlador{

   private  int volume;
   private boolean ligado;
   private boolean tocando;

   public Controlador() {
       this.volume = 50;
       this.ligado = false;
       this.tocando = false;
   }
   
    public void ligar(){
        setLigado(true);
    }
    public void desligar(){
        setLigado(false);
    }
    public void abrirMenu(){
        if(getLigado()){
        System.out.println("--------Menu---------");
        System.out.println("Esta ligado?" + getLigado());
        System.out.println("Esta Tocando ?" +  getTocando());
        System.out.println(getVolume());
        for(int i=0; i<= getVolume();i+=10){
            System.out.println("-");
        }

    }else{
        System.out.println("Impossivel abrir o menu");
    }
        
}
    public void fecharMenu(){

        System.out.println("Fechando menu...");
    }
    public void maisVolume(){
        desligaMudo();
        if(getLigado()){
            setVolume(getVolume() + 5);
        }else{
            System.out.println("Impossivel aumentar o volume");
        }
    }

    public void menosVolume(){

        if(getLigado()){
            setVolume(getVolume() - 5);
        }else{
            System.out.println("Impossivel diminuir o volume");
        }
    }
    public void mudo(){
        if(getLigado() && getVolume() > 0){
            setVolume(0);
            System.out.println("Mudo ativado");
        }
    }
    public void desligaMudo(){

        if(getLigado() && getVolume() == 0){
            setVolume(50);
        }
    }
    public void  play(){
        if(getLigado() && !(getTocando())){
            setTocando(true);
        }else{
            System.out.println("impossivel reproduzir");
        }
    } 

    public void pause(){
        if(getLigado() && getTocando()){

            setTocando(false);
        }else{
            System.out.println("impossivel Pausar");
        }

    }

   private void setLigado(boolean l) {
        this.ligado = l;
    }
    
    private void setTocando(boolean t) {
        this.tocando = t;
    }

    private void setVolume(int v) {
        this.volume = v;
    }
    private int getVolume() {
        return volume;
    }
    private boolean getTocando() {
        return this.tocando;
    }
     
    private boolean getLigado() {
        return this.ligado;
    }
}
