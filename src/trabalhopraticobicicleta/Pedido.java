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
public class Pedido {
    private int numeropedido;
    private Cliente cliente;
    private ItensPedido itenspedido;
    
    
    //FUNCAO QUE CRIA OS DADOS DO CLIENTE PARA SEREM INSERIDOS NO PEDIDO
    public Cliente criaCliente(){
        System.out.println(" ");
        System.out.println("******** INSIRA O CLIENTE DO PEDIDO ********");
        Scanner teclado = new Scanner(System.in);
        Cliente novocliente = new Cliente();
        
        System.out.println("Digite o nome do cliente!");
        String entrada1 = teclado.nextLine();
        novocliente.setNome(entrada1);
        
        System.out.println("Digite o CPF do cliente!");
        String entrada2 = teclado.nextLine();
        novocliente.setCpf(entrada2);
        
        System.out.println("Digite o endereço de entrega do pedido do cliente!");
        String entrada3 = teclado.nextLine();
        novocliente.setEndereco(entrada3);
        
        return novocliente;
    }
    
    //FUNCAO QUE CRIA OS DADOS DE ITENS PARA SEREM INSERIDOS NO PEDIDO
    public ItensPedido inserirItens(){
        System.out.println(" ");
        System.out.println("******** INSIRA OS ITENS DO PEDIDO ********");
        System.out.println(" ");
        Scanner teclado = new Scanner(System.in);
        ItensPedido novositens = new ItensPedido();
        
        System.out.println("Digite o modelo das bicicletas que voce deseja que sejam produzidas !");
        String entrada1 = teclado.nextLine();
        novositens.setModelobicicleta(entrada1);
        
        System.out.println("Digite a cor de todas as bicicleta que voce deseja que sejam produzidas !");
        String entrada2 = teclado.nextLine();
        novositens.setCor(entrada2);
        
        System.out.println("Digite quantas bicicletas que vc quer que sejam produzidas !");
        int entrada3 = teclado.nextInt();
        novositens.setQuantidadebicicleta(entrada3);
        
        return novositens;
    }
    
    public int geraNumPedido(){
        this.numeropedido ++;
        return this.numeropedido;
    }
    
    //FUNCAO QUE CRIA O PEDIDO
    public Pedido criarPedido(){
        System.out.println(" ");
        Scanner teclado = new Scanner(System.in);
        this.numeropedido ++;
        Pedido pedido = new Pedido(numeropedido,criaCliente(),inserirItens());
        
        System.out.println(pedido);

        System.out.println(" ");
        
        return pedido;
    }
    
    public ItensPedido passaItens(){
        ItensPedido itens= new ItensPedido();
        return itens;
    }

    public Pedido(int numeropedido, Cliente cliente, ItensPedido itenspedido) {
        this.numeropedido = numeropedido;
        this.cliente = cliente;
        this.itenspedido = itenspedido;
    }

    
    public int getNumeropedido() {
        return numeropedido;
    }

    public void setNumeropedido(int numeropedido) {
        this.numeropedido = numeropedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ItensPedido getItensPedido() {
        return itenspedido;
    }

    public void setItensPedido(ItensPedido itenspedido) {
        this.itenspedido = itenspedido;
    }

    @Override
    public String toString() {
        return " de ordem " + this.numeropedido + "\n "+ this.cliente +"\n " + this.itenspedido ;
    }
    
}
