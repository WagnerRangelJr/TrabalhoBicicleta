/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopraticobicicleta;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Wagner_2
 */
public class Producao {
    private Map<Integer,Projeto> listaprojeto = new HashMap<>();

    
    public Map<Integer, Projeto> getListaprojeto() {
        return listaprojeto;
    }

    public void setListaprojeto(Map<Integer, Projeto> listaprojeto) {
        this.listaprojeto = listaprojeto;
    }

        
    public Projeto adicionaProjeto(Projeto projeto){
        System.out.println(" ");
        System.out.println("************ O PROJETO ENVIADO PARA PRODUCAO ************");
        System.out.println(" ");
        
        Producao producao = new Producao();
        int entrada = projeto.getPedido().getNumeropedido();
        
        //listaprojeto.put(projeto1.retornaNumeroPedido(),projeto);
        
        // O numero do pedido e usado como identificador chave do map
        listaprojeto.put(entrada,projeto);
        
        System.out.println("*********** PROEJTO ATUAL ***********\n" + listaprojeto.get(entrada));
        
        
        System.out.println("*********** LISTA DE PROJETOS ***********\n ");
        System.out.println(listaprojeto);
        
        // aloca recursos no estoque e finaliza com a liberacao do financeiro

        //compara se ja existe um projeto existente
        
        
        producao.alocaFuncionarios(listaprojeto,entrada);
        //chamadada estoque 
        
  
        // realizar o teste no setor de teste no projeto
        
        
        //return producao.alocaFuncionarios(listaprojeto,entrada);
        return listaprojeto.get(entrada);
    }
    
    public Projeto alocaFuncionarios(Map<Integer, Projeto> lista, int entrada){
        
        Producao producao = new Producao();
        //chamda do projeto expecifico criado pela chave entrada, com o projeto
        
        
        System.out.println("ATENCAO SAIDA ESPERADA"); 

        System.out.println("\n #####################");
        //System.out.println(getListaprojeto().get(entrada));
        
        return lista.get(entrada);
        //return producao.getListaprojeto().getOrDefault(entrada,projeto);
        
        
    
    }

    public Projeto contruir(Projeto projeto){
        int produzir = 10;
        System.out.println("ATENCAO SAIDA ESPERADA");
        System.out.println("\n CONsTRUINDO Em ");
        while (produzir > 0 ){
            System.out.println(produzir + "...");
            produzir --;
        }
        System.out.println("\n ");
        return projeto;
         
    }

}
