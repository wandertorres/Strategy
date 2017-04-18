package entidades;

public class Veiculo {
	private String marca;
	private int anoFabricacao;
	private String condutor;

	public Veiculo(String marca, int anoFabricacao, String condutor) {
		this.marca = marca;
		this.anoFabricacao = anoFabricacao;
		this.condutor = condutor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public String getCondutor() {
		return condutor;
	}

	public void setCondutor(String condutor) {
		this.condutor = condutor;
	}

}
