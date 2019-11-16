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
public class Cliente {
    private String nome;
    private String cpf;
    private String endereco;
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "O Cliente que fez o pedido é "+ this.nome + ". Que tem o Cpf:" + this.cpf + ". Seu Endereco é: " + this.endereco + '.';
    }
    
    
    
 
}
