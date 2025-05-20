package heranca.polimorfismo;

public class Imovel {
	private double tamanhoImovel;
	private boolean possuiEscritura;
	
	public double getTamanhoImovel() {
		return tamanhoImovel;
	}
	
	public void setTamanhoImovel(double tamanhoImovel) {
		this.tamanhoImovel = tamanhoImovel;
	}
	
	public boolean isPossuiEscritura() {
		return possuiEscritura;
	}
	
	public void setPossuiEscritura(boolean possuiEscritura) {
		this.possuiEscritura = possuiEscritura;
	}
	
	public void lavarImovel() {
		System.out.println("Lavando imovel");
	}
	
	public void secarImovel() {
		System.out.println("Secando imovel");
	}
	
	
}
