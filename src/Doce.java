
public class Doce extends ItemSobremesa {

	private double peso;
	private int precoQuilo;
	
	
	public Doce(String nome, double preco, int precoquilo){
		super(nome);
		this.peso = preco;
		precoQuilo = precoquilo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double preco) {
		this.peso = preco;
	}


	public int getPrecoquilo() {
		return precoQuilo;
	}

	public void setPrecoquilo(int precoquilo) {
		precoQuilo = precoquilo;
	}
	
	@Override
	 public int getCusto() {
		return (int) (peso*precoQuilo);
	 }
	
	@Override
	public String toString() {
	  return String.format("%.2f g @ %s /kg\n%-25s %6s", getPeso(), 
	    Sorveteria.centavos2ReaisECentavos(precoQuilo), getNome(), Sorveteria.centavos2ReaisECentavos(getCusto()));
	}
	
	
}
