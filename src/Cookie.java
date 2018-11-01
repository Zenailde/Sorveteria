
public class Cookie extends ItemSobremesa{

	private int qtd;
	private int precoDuzia;
	
	public Cookie(String nome, int qtd, int precoDuzia) {
		super(nome);
		this.qtd = qtd;
		this.precoDuzia = precoDuzia;
	}

	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd){
		this.qtd = qtd;
	}

	public int getPrecoDuzia(){
		return precoDuzia;
	}

	public void setPrecoDuzia(int precoDuzia) {
		this.precoDuzia = precoDuzia;
	}
	
	@Override
	 public  int getCusto(){
		
		int total = (int) (qtd*(precoDuzia/12));
		
			return total;
			
		}
	
	@Override
	public String toString() {
	  return String.format("%d @ %s /dz\n%-25s %6s", getQtd(), 
	    Sorveteria.centavos2ReaisECentavos(getPrecoDuzia()), getNome(), Sorveteria.centavos2ReaisECentavos(getCusto()));
	}
	
}
