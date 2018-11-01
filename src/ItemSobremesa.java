// ItemSobremesa.java - Superclasse abstrata para Item de Sobremesa
// Rodrigo Gregori, Out 2018
// Baseado em Suzanne Balik


public abstract class ItemSobremesa {
  
  protected String nome;

  public ItemSobremesa(){
    this("");
  }
   
  public ItemSobremesa(String nome){
    if (nome.length() <= Sorveteria.TAMANHO_MAX_DO_NOME_DO_ITEM)
      this.nome = nome;
    else 
      this.nome = nome.substring(0,Sorveteria.TAMANHO_MAX_DO_NOME_DO_ITEM);
  }
  
  public final String getNome(){
    return nome;
  }
 
  public abstract int getCusto();

}
