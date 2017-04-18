package principal;

import interfaci.Calculavel;
import entidades.Veiculo;

public class Ticket {

    private Calculavel calculo;
    private Veiculo veiculo;
    private int inicio;
    private int fim;
    private double valor;
    
    public Ticket(int pInicio, int pFim, Veiculo pVeiculo) {
        inicio = pInicio;
        fim = pFim;
        veiculo = pVeiculo;
    }
    
    public void calcular() {
        valor = calculo.calcular(fim-inicio, veiculo);
    }

    public void setCalculo(Calculavel calculo) {
        this.calculo = calculo;
    }
    
    public double getValor() {
        return valor;
    }

}
