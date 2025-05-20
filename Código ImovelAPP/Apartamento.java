package heranca.polimorfismo;

public class Apartamento extends Imovel{
	private double valorCondominio;
	private int numeroApartamento;
	
	public Apartamento() {
		
	}
	
	public Apartamento(double valorCondominio, int numeroApartamento) {
		this.numeroApartamento = numeroApartamento;
		this.valorCondominio = valorCondominio;
	}
	
	public double getValorCondominio() {
		return valorCondominio;
	}
	
	public void setValorCondominio(double valorCondominio) {
		this.valorCondominio = valorCondominio;
	}
	
	public int getNumeroApartamento() {
		return numeroApartamento;
	}
	
	public void setNumeroApartamento(int numeroApartamento) {
		this.numeroApartamento = numeroApartamento;
	}
	
	
	public void ligarPortaria() {
		System.out.println("Ligando Portaria...");
		
	}
	
}
