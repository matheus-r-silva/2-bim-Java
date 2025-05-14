package heranca.polimorfismo;

/*
 *     	Qual vantagem você percebe ao utilizar herança no seu código?
 *     Reaproveitar atributos e metodos da classe Pai, ou Base

    	Quais métodos foram herdados pela classe Apartamento e pela classe Casa?
    	lavarImovel(), secarImovel()
	 * */

	/*
	 * Duplas: Matheus Rocha & Isabela Aquino
	 * Turno: 3° Noturno
	 * */
public class TesteImoveis {
	public static void main(String[] args) {
		//Instanciando Apartamento
		var ap = new Apartamento();
		ap.setNumeroApartamento(1402);
		ap.setPossuiEscritura(true);
		ap.setTamanhoImovel(150.00);
		
		
		//Instanciando Casa
		var casa = new Casa();
		casa.setPossuiQuintal(true);
		casa.setQuantidadePisos(2);
		
		
		//Metodos Apartamento
		ap.ligarPortaria();
		ap.lavarImovel();
		ap.secarImovel();
		
		System.out.println("\n");
		
		//Metodos Casa
		casa.lavarImovel();
		casa.secarImovel();
		casa.abrirGaragem();
	}
}
