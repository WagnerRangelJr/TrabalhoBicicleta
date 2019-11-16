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
public class Projeto{
    private Pedido pedido;
    private int numeroengenheiro;
    private int numerotecnico;
    private int numerogerente;

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public int getNumeroengenheiro() {
        return numeroengenheiro;
    }

    public void setNumeroengenheiro(int numeroengenheiro) {
        this.numeroengenheiro = numeroengenheiro;
    }

    public int getNumerotecnico() {
        return numerotecnico;
    }

    public void setNumerotecnico(int numerotecnico) {
        this.numerotecnico = numerotecnico;
    }

    public int getNumerogerente() {
        return numerogerente;
    }

    public void setNumerogerente(int numerogerente) {
        this.numerogerente = numerogerente;
    }
    
    public Projeto recebePedido(Pedido a){

        //Producao producao = new Producao();
        
        Projeto projeto = new Projeto();
        projeto.setPedido(a);
        //projeto.setNumeroengenheiro(analiseEngenheiroProjeto(a));
        //projeto.setNumerotecnico(analiseTecnicoProjeto(a));

        
        // obetive diversos erros excessao de passar parametros como nulo 
        String entrada3 =projeto.getPedido().getItensPedido().getModelobicicleta();
        int entrada4 =projeto.getPedido().getItensPedido().getQuantidadebicicleta();
        
        System.out.println("O modelo escolhido foi " + entrada3);
        System.out.println("A quantidade decida foi" +  entrada4);
        
        projeto.setNumeroengenheiro(analiseEngenheiroProjeto(entrada3));
        projeto.setNumerotecnico(analiseTecnicoProjeto(entrada4));
        projeto.setNumerogerente(1);
        
        System.out.println(" ");
        System.out.println("************ O PROJETO EH ************");
        System.out.println(" ");
        System.out.println(projeto);
        
        //producao.adicionaProjeto(projeto);
        return projeto;
    }
    
    /*
    public int analiseEngenheiroProjeto(Pedido a){
        int entrada;
        if(this.getPedido().getItensPedido().getModelobicicleta().equals("bmx")){
            entrada = 2;
        }
        else if (this.getPedido().getItensPedido().getModelobicicleta().equals("trilha")){
            entrada = 3;
        }
        else if (this.getPedido().getItensPedido().getModelobicicleta().equals("esportivo")){
            entrada = 5;
        }
        else if (this.getPedido().getItensPedido().getModelobicicleta().equals("infatil")){
            entrada = 1;
        }
        else{
            entrada = 3;
        }
    return entrada;
    }
 
    public int analiseTecnicoProjeto(Pedido a){
        int entrada;
        if(this.getPedido().getItensPedido().getQuantidadebicicleta() <= 50){
            entrada = 5;
        }
        else if ( this.getPedido().getItensPedido().getQuantidadebicicleta() > 50 && this.getPedido().getItensPedido().getQuantidadebicicleta() <= 100){
            entrada = 15;
        }
        else if (this.getPedido().getItensPedido().getQuantidadebicicleta() >100 && this.getPedido().getItensPedido().getQuantidadebicicleta() <= 200){
            entrada = 30;
        }
        else if (this.getPedido().getItensPedido().getQuantidadebicicleta() > 40 && this.getPedido().getItensPedido().getModelobicicleta().equals("esportivo") ){
            entrada = 70;
        }
        else{
        entrada = 50;
        }
    return entrada;
    }
    */
    
    
    // if basico para definir quando engenheiros no projeto
    public int analiseEngenheiroProjeto(String a){
        int entrada;
        if(a.equals("bmx")){
            entrada = 2;
        }
        else if (a.equals("trilha")){
            entrada = 3;
        }
        else if (a.equals("esportivo")){
            entrada = 5;
        }
        else if (a.equals("infatil")){
            entrada = 1;
        }
        else{
            entrada = 3;
        }
    return entrada;
    }
 
    //if basico para definir quando engenheiros no projeto
    public int analiseTecnicoProjeto(int a){
        int entrada;
        if(a <= 50){
            entrada = 5;
        }
        else if ( a <= 100){
            entrada = 15;
        }
        else if (a <= 200){
            entrada = 30;
        }
        else{
        entrada = 50;
        }
    return entrada;
    }
        
    
    public int retornaNumeroPedido(){
        return getPedido().getNumeropedido();
    }

    
    @Override
    public String toString() {
        return " O projeto é base no pedido" + this.pedido + ".\n O numero de engenheiros alocados eh " + this.numeroengenheiro + ", numero de tecnicos é " + this.numerotecnico + '.';
    }
    
    
}
