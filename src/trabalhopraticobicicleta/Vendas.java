/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopraticobicicleta;

/**
 *
 * @author Wagner_2
 */
public class Vendas {
    
    public Pedido fazerVenda(Pedido pedido){
        
        System.out.println(" ");
        System.out.println("************ CRIANDO O PEDIDO ************");
        System.out.println(" ");
        
        return pedido.criarPedido();
    }
    
}
