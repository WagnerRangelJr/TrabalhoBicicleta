/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopraticobicicleta;

import java.util.Scanner;

/**
 *
 * @author Wagner_2
 */
public class TrabalhoPraticoBicicleta {

    /**
     o codigo tem um baixo acoplamento todas as funcoes sao chamadas pelo processo do termino de outra
     * ou seja apenas criar o pedido comeca na main o resto termina com a ultima funcao chamada pela penultima
     */
    public static void main(String[] args) {

        System.out.println("\n INICIANDO SISTEMA");
        
        Vendas venda = new Vendas();
        Projeto projeto = new Projeto();
        Producao producao = new Producao();
        Rh rh = new Rh();
        Cliente cliente = new Cliente();
        ItensPedido itens = new ItensPedido();
        Pedido pedido = new Pedido(0,cliente,itens);
        int controle =0;
        
        while (controle ==0){
            int decisao = 1;
            System.out.println(" Para realizar vendas digite 1 e 2 para sair do sistema:");
            Scanner teclado = new Scanner(System.in);
            decisao = teclado.nextInt();
            switch (decisao){
                case 1:
                    // TODO code application logic here
                    
                    
                    System.out.println(" ABRINDO VENDA\n ");
                    
                    
                                     
                    rh.liberarFuncionarios(producao.contruir(rh.verificaFuncionario(producao.adicionaProjeto(projeto.recebePedido(venda.fazerVenda(pedido))))));
                    
                    // aloca recursos no estoque e finaliza com a liberacao do financeiro

                     //compara se ja existe um projeto existente
        
        

                    //chamadada estoque 
        
  
                    // realizar o teste no setor de teste no projeto
                    Teste teste = new Teste();
                        if (teste.realizarTeste()== true){
                            // libera os funcionarios para modo de espera 

                            //rh.liberarFuncionarios(listaprojeto.get(entrada));
                        }
                    
                    System.out.println(" ");
                    System.out.println("************ ENCERRADA VENDA ************");
                    
                    break;
                case 2:
                    controle = 1;
            break;
            default:
                System.out.println("OPCAO INVALIDA \n");
        }}
    }
    
}
