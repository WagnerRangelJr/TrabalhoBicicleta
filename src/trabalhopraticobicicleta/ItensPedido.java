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
public class ItensPedido {
    private String modelobicicleta;
    private String cor;
    private int quantidadebicicleta;

    public String getModelobicicleta() {
        return modelobicicleta;
    }

    public void setModelobicicleta(String modelobicicleta) {
        this.modelobicicleta = modelobicicleta;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getQuantidadebicicleta() {
        return quantidadebicicleta;
    }

    public void setQuantidadebicicleta(int quantidadebicicleta) {
        this.quantidadebicicleta = quantidadebicicleta;
    }

    @Override
    public String toString() {
        return "O pedido consta as bicicletas do modelo: " + this.modelobicicleta + ". De cor: " + this.cor + ". Sendo para entrega a quantidade de:" + this.quantidadebicicleta + ".";
    }

    
}
