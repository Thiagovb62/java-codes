public class Conta {
   public int numConta;
   protected String tipoConta;
   private String usuarioConta;
   private Float saldoConta;
   private Boolean status;
 
    public Conta(){
       this.saldoConta = 0f;
        this.status = false;
    }

    public void estadoConta(){
        System.out.println("--------------------------------");
        System.out.println( getTipoConta() + " " + getUsuarioConta() + " " + getSaldoConta() + " " + getStatusConta());
    } 

    public void Criarconta(String t){

        setTipoConta(t);
        setStatusConta(true);
        if( t =="CC"){
            this.saldoConta=50f;
        }
        else{
            this.saldoConta=150f;
        }
    }
    public void Fecharconta(){
        if(this.saldoConta > 0 ){
            System.out.println("Tem dinheiro ");
        }
        else if ( this.saldoConta < 0 ){
        System.out.println("conta com debito");
        }
        else{
            setStatusConta(false);

        }
        System.out.println("Conta fechada");
    }
    public void Depositar(int v){
        if(this.status = true){
            setSaldoConta(this.getSaldoConta() + v);
            System.out.println("Deposito realizado com sucesso na conta : " + this.getUsuarioConta());
        }
        else{
            System.out.println("impossivel depositar");
        }

    }
    public void Sacar(int v){
        if(this.status = true){
            if(this.saldoConta >= v){ 
            this.saldoConta = this.saldoConta - v;
            //set.saldoConta(getsaldoConta() - v );
            System.out.println("saque realizado com sucesso na conta  : " + this.getUsuarioConta());
            }
            else{
                System.out.println("Saldo insuficiente!");
            }

        }else{
                System.out.println("conta fechada!");
        }
    }

    public void PagarMensal(){
        int  v=0;
        if(this.tipoConta == "CC"){
            v = 12;
        }
        else if (this.tipoConta== "CP"){
            v = 20;
        }
        if(this.status==true && this.saldoConta>v){
             this.saldoConta = this.saldoConta - v;
             System.out.println("mensalidade paga");
        }
             else{
                 System.out.println(" impossivel pagar conta fechada");
             }
    }

    public String getTipoConta(){
        return this.tipoConta;

    }
    public void setTipoConta(String t){
        this.tipoConta = t;

    }

    public String getUsuarioConta(){
        return this.usuarioConta;

    }

    public void setUsuarioConta(String u){
        this.usuarioConta = u;

    }

    public Float getSaldoConta(){
        return this.saldoConta;

    }

    public void setSaldoConta(Float s){
       this.saldoConta=s;
    }

    public boolean getStatusConta(){
        return this.status;

    }
    
    public void setStatusConta(boolean s ){
        this.status=s;
    }
}

 