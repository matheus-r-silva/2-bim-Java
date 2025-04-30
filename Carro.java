package introclasses;

import java.util.Objects;

//Definindo a classe "carro"

public class Carro {
	// atributos(caracteristicas do carro)
	String modelo;
	String cor;
	int ano;
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getCor() {
		return cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	//Metodo (Comportamento do carro)
	public void ligarCarro() {
		System.out.println("Carro ligado!!!");
	}
	
	public void mostrarDetalhes() {
		System.out.println("Cor: " +cor+ " Modelo: " +modelo+ " Ano: " +ano);
	}
}
