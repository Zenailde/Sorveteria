
public class Sorvete extends ItemSobremesa{
	
	protected double custoTotal;

	

public Sorvete(String nome, double custoTotal) {
		super(nome);
		this.custoTotal = custoTotal;
	}



public double getCustoTotal() {
	return custoTotal;
}



public void setCustoTotal(double custoTotal) {
	this.custoTotal = custoTotal;
}


@Override
public int getCusto(){
	return (int) custoTotal;
 }

@Override
public String toString() {
  return String.format("%-25s %6s", getNome(), Sorveteria.centavos2ReaisECentavos(getCusto()));
}

}
