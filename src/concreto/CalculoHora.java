package concreto;

import interfaci.Calculavel;
import entidades.Veiculo;

public class CalculoHora implements Calculavel {
    private double tx;

    public CalculoHora(double tx) {
        this.tx = tx;
    }
    
    @Override
    public double calcular(int tempo, Veiculo veiculo) {
        return tx * tempo;
    }

}
