package atv01;

import java.util.Scanner;

public class Atv01 {

    public static void main(String[] args) {
        
        System.out.println("MENU:");
        System.out.println("- init int - Inicia uma lista de produto baseado no int digitado.");
        System.out.println("- inserir produto, id - Inseri um produto na lista.");
        System.out.println("- comprar codigo do produto, quantidade - adiciona produtos no estoque.");
        System.out.println("- vender codigo do produto, quantidade - retira produtos que ainda tem no estoque.");
        System.out.println("- consultaV codigo do produto - consulta o preço de venda de um produto da lista.");
        System.out.println("- listar - lista todos os produtos.");
        System.out.println("- listarA codigo do produto - determinados atributos de um produto da lista.");
        System.out.println("- mudarVC codigo do produto - muda o preço de venda de determinado produto.");
        System.out.println("- mudarC codigo do produto - muda o custo de determinado produto.");
        System.out.println("- mudarML codigo do produto - muda a margem de lucro de determinado produto.");
        System.out.println("- end - termina a secção.");
        
        Scanner scan = new Scanner(System.in);
        RevendaComArray re = new RevendaComArray(0);
        
        while(true){
        
            String line = scan.nextLine();
            String[] ui = line.split(" ");
            
            if(ui[0].equals("end")){
                break;
            }else if(ui[0].equals("init")){
                re = new RevendaComArray(Integer.parseInt(ui[1]));
            }else if(ui[0].equals("inserir")){
                re.inserirProduto(new Produto(Integer.parseInt(ui[1]), ui[2], Double.parseDouble(ui[3]), Double.parseDouble(ui[4]), Double.parseDouble(ui[5]), Integer.parseInt(ui[6])), Integer.parseInt(ui[7]));
            }else if(ui[0].equals("comprar")){
                re.comprar(Integer.parseInt(ui[1]), Integer.parseInt(ui[2]));
            }else if(ui[0].equals("vender")){
                re.vender(Integer.parseInt(ui[1]), Integer.parseInt(ui[2]));
            }else if(ui[0].equals("consultaV")){
                re.consultarPrecoVenda(Integer.parseInt(ui[1]));
            }else if(ui[0].equals("listar")){
                re.listarPrecos();
            }else if(ui[0].equals("listarA")){
                re.ListaAtributos(Integer.parseInt(ui[1]));
            }else if(ui[0].equals("mudarVC")){
                re.mudarVc(Integer.parseInt(ui[1]), Double.parseDouble(ui[2]));
            }else if(ui[0].equals("mudarC")){
                re.mudarC(Integer.parseInt(ui[1]), Double.parseDouble(ui[2]));
            }else if(ui[0].equals("mudarML")){
                re.mudarML(Integer.parseInt(ui[1]), Double.parseDouble(ui[2]));    
            }else{
                System.out.println("Comando Inválido");
            }
            
        
        }
        
        scan.close();
    }
    
}
