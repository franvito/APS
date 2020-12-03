package atv01;

public class Produto {
    //VARIAVEIS
    private int cod;
    private String desc;
    private double valorC;
    private double custo;
    private double margemL;
    private int quantE;
    
    //CONSTRUTORES
    public Produto(){
        
    }
    
    public Produto(int cod, String desc){
        this.cod = cod;
        this.desc = desc;
    }
    
    public Produto(int cod, String desc, double vc, double cs, double ml){
        this.cod = cod;
        this.desc = desc;
        this.valorC = vc;
        this.custo = cs;
        this.margemL = ml;
    }
    
    public Produto(int cod, String desc, double vc, double cs, double ml, int qe){
        this.cod = cod;
        this.desc = desc;
        this.valorC = vc;
        this.custo = cs;
        this.margemL = ml;
        this.quantE = qe;
    }
    //METODOS
    public void compra(int quant){
        this.setQuantE(this.getQuantE()+quant);
    }
    public void venda(int quant){
        this.setQuantE(this.getQuantE()-quant);
    }
    public double calcularPrecoVenda(){
        return this.valorC + this.custo + this.margemL*(this.valorC+this.custo);
    }
    public int getCod(){
        return this.cod;
    }
    
    //TO STRING
    
    public String toString(){
        return  this.cod + " : " + this.desc + " : " + this.calcularPrecoVenda() + " RS";
    }
    
    //METODOS GET E SET
    public double getValorC(){
        return this.valorC;
    }
    public void setValorC(double v){
        this.valorC = v;
    }
    public double getCusto(){
        return this.custo;
    }
    public void setCusto(double c){
        this.custo = c;
    }
    public double getMargemL(){
        return this.margemL;
    }
    public void setMargemL(double m){
        this.margemL = m;
    }
    public int getQuantE(){
        return this.quantE;
    }
    public void setQuantE(int q){
        this.quantE = q;
    }
}
