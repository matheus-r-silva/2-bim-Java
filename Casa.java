package heranca.polimorfismo;

public class Casa extends Imovel{
	private boolean possuiQuintal;
	private int quantidadePisos;
	
	public Casa() {
		
	}
	
	public Casa(boolean posssuiQuintal, int quantidadePisos) {
		this.possuiQuintal = possuiQuintal;
		this.quantidadePisos = quantidadePisos;
	}

	public boolean isPossuiQuintal() {
		return possuiQuintal;
	}

	public void setPossuiQuintal(boolean possuiQuintal) {
		this.possuiQuintal = possuiQuintal;
	}

	public int getQuantidadePisos() {
		return quantidadePisos;
	}

	public void setQuantidadePisos(int quantidadePisos) {
		this.quantidadePisos = quantidadePisos;
	}
	
	
	public void abrirGaragem() {
		System.out.println("Abrindo garagem.....");
	}
	
}
