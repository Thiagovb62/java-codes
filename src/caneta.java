public class  caneta {
    private String modelo;
    public String cor;
    private Double ponta;
    protected int carga;
    protected Boolean tampada;


    public caneta(String m ,String c,Double p,Boolean t) {
        this.modelo=m;
        this.cor=c;
        this.ponta=p;
        this.tampada=t;

    }
     
    public void status() {
        System.out.println(this.modelo + " " + this.cor + " " + this.getPonta() + " " + " " + this.tampada);      
    }

    public void setModelo(String m){ 
        this.modelo=m;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setPonta(Double p){ 
        this.ponta=p;
    }

    public Double getPonta() {
        return this.ponta;
    }


     public void rabiscar () {
         if(this.tampada == true){ 
           System.out.println("impossivel rabiscar");
         }
         else{
             System.out.println("rabiscando....");
         }


     }

    protected void tampar  () {
          this.tampada = true;

     }

    protected void destampar  () {
          this.tampada = false;

     }
}
