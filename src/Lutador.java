
public class Lutador {
    private String name;
    private String nacionalidade;
    private int idade;
    private  Float peso;
    private Float altura;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

   public Lutador(String nm,String na,int id,Float p,Float al,int v, int d,int em){
       this.name = nm;
       this.nacionalidade = na;
       this.idade = id;
       this.setPeso(p);
       this.altura = al;
       this.vitorias = v;
       this.derrotas= d;
       this.empates=em;

    }
    public void setName(String na) {
        this.name= na;
        }

   public String getName() {
        return name;

        }

    public void setNacionalidade(String nt){
        this.nacionalidade= nt;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }
    public void setIdade( int id) {
        this.idade= id;

    }
    public int getIdade() {
        return idade;
    }
    public void setPeso(Float p){
        this.peso= p;
        this.setCategoria();
    }
    public Float getPeso() {
        return peso;
    }

    public void setAltura(Float al) {
        this.altura= al;
    }
    public Float getAltura(){
        return altura;
    }
    public void setCategoria(){
        if(this.peso<52.2){
            this.categoria="chicken little";
        }
        else if(this.peso<70.3){
            this.categoria="formiga";
        }
        else if(this.peso<=83.9){
            this.categoria="Galo de Briga";
        }
        else if(this.peso<= 120.2){
            this.categoria="Hulk";
        }
    }
    public String getCategoria(){
        return categoria;
    }
    public void setVitoria(int v){
        this.vitorias= v;
    }
    public int getVitoria(){
        return vitorias;
    }
    public void setDerrota(int d){
        this.derrotas= d;
    }
    public int getDerrota(){
        return derrotas;
    }
    public int getEmpates() {
        return empates;
    }
    public void setEmpates(int em) {
        this.empates = em;
    }
    public void ganharLuta(){
        setVitoria(getVitoria() + 1);
    }
    public void perderLuta(){
        setDerrota(getDerrota() - 1);
    }
    public void empates(){
        setEmpates(getEmpates() + 1);
    }
    public void apresentar(){
        System.out.println("-----------------");
        System.out.println("Aqueles que Desafiam a própria existência,senhoras e senhores abram alas ");
        System.out.println("VEM PRA CA.............. " + getName());
        System.out.println("Das profundezas de " +  getNacionalidade());
        System.out.println("Com seus " + getIdade() + " Anos ");
        System.out.println("com "+ getPeso()+ " KG");

    }
    public void status(){
        System.out.println("-----------------");
        System.out.println("ai vem ele o Grande: " + getName());
        System.out.println("Peso" + getCategoria());
        System.out.println(getVitoria() + "Vitorias");
        System.out.println(getDerrota() + "Derrotas");
        System.out.println(getEmpates() + "Empates");

    }
}
