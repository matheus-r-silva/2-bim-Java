package introclasses;


//Classe principal com metodo main

public class Main {
	public static void main(String[] args) {
		// Criando objeto da classe Carro
		Carro fusca = new Carro();
		
		// Atribuindo os valores aos atributos
		fusca.modelo = "fusca";
		fusca.cor = "vermelho";
		fusca.ano = 1987;
		
		fusca.ligarCarro();
		fusca.mostrarDetalhes();
	}
}
