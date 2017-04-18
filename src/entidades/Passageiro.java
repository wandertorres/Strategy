package entidades;

import entidades.Veiculo;

public class Passageiro extends Veiculo {
    private int numPassageiros;
    
    public Passageiro(String marca, int anoFabricacao, String condutor, int numPassageiros) {
        super(marca, anoFabricacao, condutor);
        this.numPassageiros = numPassageiros;
    }

    public int getNumPassageiros() {
        return numPassageiros;
    }

    public void setNumPassageiros(int numPassageiros) {
        this.numPassageiros = numPassageiros;
    }
    
}
