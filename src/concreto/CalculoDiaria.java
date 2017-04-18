package concreto;

import interfaci.Calculavel;
import entidades.Caminhao;
import entidades.Veiculo;

public class CalculoDiaria implements Calculavel {
    private double diaria;

    public CalculoDiaria(double diaria) {
        this.diaria = diaria;
    }
    
    @Override
    public double calcular(int tempo, Veiculo veiculo) {
        if (veiculo instanceof Caminhao) {
            return Math.ceil(tempo/24) * (diaria * (( ((Caminhao)veiculo).getNumEixos() * 0.5) + ( ((Caminhao)veiculo).getCarga() * 0.1)));
        } else {
            return Math.ceil(tempo/24) * diaria;
        }
    }
    
}
