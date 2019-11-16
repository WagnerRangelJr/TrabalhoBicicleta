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
public class Gerente extends Funcionario{
    private int codprojeto;

    public Gerente(String nome, String cpf) {
        super(nome, cpf);
    }

    public int getCodprojeto() {
        return codprojeto;
    }

    public void setCodprojeto(int codprojeto) {
        this.codprojeto = codprojeto;
    }

    @Override
    public String toString() {
        return " o nome do gerente é " +this.getNome()+ " o cpf é " +this.getCpf()+" o código do projeto que coordena é"+ this.codprojeto + '}';
    }
    
}
