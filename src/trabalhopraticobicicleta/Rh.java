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
public class Rh {
    private int numerotecnicos;
    private int numeroengenheiros;
    private int numerogerente;

    public int getNumerotecnicos() {
        return numerotecnicos;
    }

    public void setNumerotecnicos(int numerotecnicos) {
        this.numerotecnicos = numerotecnicos;
    }

    public int getNumeroengenheiros() {
        return numeroengenheiros;
    }

    public void setNumeroengenheiros(int numeroengenheiros) {
        this.numeroengenheiros = numeroengenheiros;
    }

    public int getNumerogerente() {
        return numerogerente;
    }

    public void setNumerogerente(int numerogerente) {
        this.numerogerente = numerogerente;
    }
    

    
    //por vontade minha a empresa comeca com nenhum funcionario
    public Projeto verificaFuncionario(Projeto projetoalocado){
        System.out.println("*********** CONTRANDO ***********");
        Financeiro financeiro = new Financeiro();
        int entrada = projetoalocado.getNumeroengenheiro();
       int entrada1 = projetoalocado.getNumerotecnico();
       int entrada2 = projetoalocado.getNumerogerente();
        
       
       //contratando engenheiros
       if (entrada >= this.numeroengenheiros){
            if (financeiro.liberaCota() == true){
                this.numeroengenheiros = entrada - this.numeroengenheiros;
                System.out.println("O numero de engenheiros CONTRADOS na empresa é de "+this.numeroengenheiros +".");
                
            }           
        else{
            this.numeroengenheiros = this.numeroengenheiros - entrada;
            System.out.println("O numero de engenheiros CONTRADOS na empresa é de  0 visto que já existia "+this.numeroengenheiros+"\n Pessoa alocadas = "+ entrada);
            
       }}
       
       //contratando tecnicos
       if (entrada1 >= this.numerotecnicos){
            if (financeiro.liberaCota() == true){
                this.numerotecnicos = entrada1 - this.numerotecnicos;
                System.out.println("O numero de tecnicos CONTRADOS na empresa é de "+this.numerotecnicos+".");
                
            }}
        if (entrada1 < this.numerotecnicos){
            System.out.println("O numero de tecnicos CONTRADOS na empresa é de  0 visto que já existia "+this.numerotecnicos+" suficientes.\n Pessoa alocadas = "+ entrada1);
       }     
        
       //contratando gerente
       if (entrada2 > this.numerogerente){
           if(financeiro.liberaCota()==true){
               //while(entrada2 > this.numerogerente)
                   this.numerogerente = entrada2 - this.numerogerente;
                    System.out.println("O numero de gerentes de projeto CONTRADOS na empresa é de "+this.numerogerente+".");
           }
        else{
            this.numeroengenheiros = this.numerogerente - entrada2;
            System.out.println("O numero de gerentes de projeto CONTRADOS na empresa é de  0 visto que já existia pessoa suficiente.\n Pessoa alocadas = "+ entrada2);
           }   
       }
       System.out.println("O numero de gerentes de projeto CONTRADOS na empresa é de "+this.numerogerente+".");
              
    return projetoalocado;
    }
    
    public Projeto liberarFuncionarios(Projeto projeto){
        if (projeto.getPedido().getNumeropedido() ==1){

            System.out.println("O numero atual de engenheiros na empresa é "+this.numeroengenheiros +".");


            System.out.println("O numero atual de tecnicos na empresa é "+this.numerotecnicos +".");


            System.out.println("O numero atual de gerentes de producao na empresa é "+this.numerogerente +".");
    }
        else{
            if (this.numeroengenheiros > projeto.getNumeroengenheiro() && this.numerotecnicos > projeto.getNumerotecnico()){

                this.numeroengenheiros = this.numeroengenheiros + projeto.getNumeroengenheiro();
                System.out.println("O numero atual de engenheiros na empresa é "+this.numeroengenheiros +".");

                this.numerotecnicos= this.numerotecnicos +projeto.getNumerotecnico();
                System.out.println("O numero atual de tecnicos na empresa é "+this.numerotecnicos +".");

                this.numerogerente = this.numerogerente + projeto.getNumerogerente();
                System.out.println("O numero atual de gerentes de producao na empresa é "+this.numerogerente +".");        
        }

            if (this.numeroengenheiros <= projeto.getNumeroengenheiro() && this.numerotecnicos <= projeto.getNumerotecnico()){

                this.numeroengenheiros = projeto.getNumeroengenheiro();
                System.out.println("O numero atual de engenheiros na empresa é "+this.numeroengenheiros +".");

                this.numerotecnicos= projeto.getNumerotecnico();
                System.out.println("O numero atual de tecnicos na empresa é "+this.numerotecnicos +".");

                this.numerogerente = this.numerogerente + projeto.getNumerogerente();
                System.out.println("O numero atual de gerentes de producao na empresa é "+this.numerogerente +".");
        }

            if (this.numeroengenheiros > projeto.getNumeroengenheiro() && this.numerotecnicos <= projeto.getNumerotecnico()){

                this.numeroengenheiros = this.numeroengenheiros + projeto.getNumeroengenheiro();
                System.out.println("O numero atual de engenheiros na empresa é "+this.numeroengenheiros +".");

                this.numerotecnicos= projeto.getNumerotecnico();
                System.out.println("O numero atual de tecnicos na empresa é "+this.numerotecnicos +".");

                this.numerogerente = this.numerogerente + projeto.getNumerogerente();
                System.out.println("O numero atual de gerentes de producao na empresa é "+this.numerogerente +".");
        }

            if (this.numeroengenheiros <= projeto.getNumeroengenheiro() && this.numerotecnicos > projeto.getNumerotecnico()){

                this.numeroengenheiros = projeto.getNumeroengenheiro();
                System.out.println("O numero atual de engenheiros na empresa é "+this.numeroengenheiros +".");

                this.numerotecnicos= this.numerotecnicos;
                System.out.println("O numero atual de tecnicos na empresa é "+this.numerotecnicos +".");

                this.numerogerente = this.numerogerente + projeto.getNumerogerente();
                System.out.println("O numero atual de gerentes de producao na empresa é "+this.numerogerente +".");
        }
        }
        
    return projeto;
    }
}
