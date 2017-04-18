package entidades;

import entidades.Veiculo;

public class Caminhao extends Veiculo {
    private int numEixos;
    private double carga;
    
    public Caminhao(String marca, int anoFabricacao, String condutor, int numEixos, double carga) {
        super(marca, anoFabricacao, condutor);
        this.numEixos = numEixos;
        this.carga = carga;
    }

    public int getNumEixos() {
        return numEixos;
    }

    public void setNumEixos(int numEixos) {
        this.numEixos = numEixos;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }
    
}
