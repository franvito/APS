package atv01;
import java.util.ArrayList;

public class RevendaComArray {
    
    //ATRIBUTOS
    private int ind;
    private ArrayList<Produto> produtos;
    
    //METODOS CONSTRUTORES
    public RevendaComArray(int ind){
        this.ind = ind;
        this.produtos = new ArrayList<>();
        for(int i = 0; i < ind; i++){
            this.produtos.add(new Produto());
        }
    }
    
    public void inserirProduto(Produto pro, int id){
        if(id > this.ind){
            System.out.println("Não cabe na lista!");
            return;
        }if(this.produtos.get(id).getCusto()!= 0){
            System.out.println("Já tem produto aqui!");
            return;
        }
        this.produtos.set(id, pro);
    }
    
    public void comprar(int cod, int uni){
        int cont = 0;
        for(int i = 0; i < this.ind; i++){
            if(this.produtos.get(i).getCod() == cod)
                this.produtos.get(i).compra(uni);
            if(this.produtos.get(i).getCod() != cod)  
                cont+=1;
        }
        if(cont == this.ind){
            System.out.println("Esse produto não existe!");
        }
        
    }
    
    public void vender(int cod, int uni){
        int cont = 0;
        for(int i = 0; i < this.ind; i++){
            if(this.produtos.get(i).getQuantE()-uni < 0){
               System.out.println("Não tem isso tudo!");
               return;
            }if(this.produtos.get(i).getQuantE() == 0){
               System.out.println("Não tem mais no estoque!");
               return;
            }if(this.produtos.get(i).getCod() != cod){  
                cont+=1;       
            }if(this.produtos.get(i).getCod() == cod){
                this.produtos.get(i).venda(uni);
            }    
        }
        if(cont == this.ind){
            System.out.println("Esse produto não existe!");
        }
    }

    public void consultarPrecoVenda(int cod){
        int cont = 0;
        for(int i = 0; i < this.ind; i++){    
            if(this.produtos.get(i).getCod() == cod)
                System.out.println(this.produtos.get(i).calcularPrecoVenda());
            if(this.produtos.get(i).getCod() != cod)  
                cont+=1;
        }
        if(cont == this.ind){
            System.out.println("Esse produto não existe!");
        }     
    }
    
    public void ListaAtributos(int cod){
        int cont = 0;
        for(int i = 0; i < this.ind; i++){    
            if(this.produtos.get(i).getCod() == cod)
                System.out.println("Valor de Compra: " + this.produtos.get(i).getValorC() + " Custo: " + this.produtos.get(i).getCusto() + " Margem de Lucro: " + this.produtos.get(i).getMargemL());
            if(this.produtos.get(i).getCod() != cod)  
                cont+=1;
        }
        if(cont == this.ind){
            System.out.println("Esse produto não existe!");
        }
    }
    
    public void mudarVc(int cod, double set){
        int cont = 0;
        for(int i = 0; i < this.ind; i++){    
            if(this.produtos.get(i).getCod() == cod)
                this.produtos.get(i).setValorC(set);
            if(this.produtos.get(i).getCod() != cod)  
                cont+=1;
        }
        if(cont == this.ind){
            System.out.println("Esse produto não existe!");
        }
    }
    
    public void mudarC(int cod, double set){
        int cont = 0;
        for(int i = 0; i < this.ind; i++){    
            if(this.produtos.get(i).getCod() == cod)
                this.produtos.get(i).setCusto(set);
            if(this.produtos.get(i).getCod() != cod)  
                cont+=1;
        }
        if(cont == this.ind){
            System.out.println("Esse produto não existe!");
        }
    }
    
    public void mudarML(int cod, double set){
        int cont = 0;
        for(int i = 0; i < this.ind; i++){    
            if(this.produtos.get(i).getCod() == cod)
                this.produtos.get(i).setMargemL(set);
            if(this.produtos.get(i).getCod() != cod)  
                cont+=1;
        }
        if(cont == this.ind){
            System.out.println("Esse produto não existe!");
        }
    }
    
    public void listarPrecos(){
        for(int i = 0; i < this.ind; i++){
            System.out.println(this.produtos.get(i).toString());
        }
    }
}
