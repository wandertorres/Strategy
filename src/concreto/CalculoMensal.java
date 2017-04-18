package concreto;

import interfaci.Calculavel;
import entidades.Passageiro;
import entidades.Veiculo;

public class CalculoMensal implements Calculavel {
    private double mensalidade;

    public CalculoMensal(double mensalidade) {
        this.mensalidade = mensalidade;
    }
    
    @Override
    public double calcular(int tempo, Veiculo veiculo) {
        if (veiculo instanceof Passageiro) {
            return tempo * (mensalidade * ( ((Passageiro) veiculo).getNumPassageiros() * 0.05));
        } else {
            return Math.ceil(tempo/24/30) * mensalidade;
        }
    }
    
}
