
public class Sundae extends Sorvete {
	
	private String calda;
	private double valorCalda;
	
	

	public Sundae(String nome, double custoTotal, String calda, double valorCalda) {
		super(nome, custoTotal);
		// TODO Auto-generated constructor stub
		this.calda=calda;
		this.valorCalda=valorCalda;
	}

	public String getCalda() {
		return calda;
	}

	public void setCalda(String calda) {
		this.calda = calda;
	}

	public double getValorCalda() {
		return valorCalda;
	}

	public void setValorCalda(double valorCalda) {
		this.valorCalda = valorCalda;
	}
	
	@Override
	public int getCusto(){
		return (int) (valorCalda + custoTotal);
	 }
	
	@Override
	public String toString() {
	  return String.format("Sundae de %s com\n%-25s %6s", getCalda(), 
	    getNome(), Sorveteria.centavos2ReaisECentavos(getCusto()));
	}
	
}
