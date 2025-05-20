public class TesteContas {
	/*Metodo Main instanciando objeto da classe ContaCorrente
	 * executando metodos de depositar e sacar e ao final apresentando como saida o resultado
	 * das operações*/
	public static void main(String[] args) {
		var conta = new ContaCorrente("Joze");
		var contap = new ContaPoupanca("Aline");
		
		
		conta.depositar(1500);
		conta.sacar(250);
		
		/*contap.depositar(1500);
		  contap.sacar(500);
		 * */
		
		
		contap.depositar(490);
		contap.sacar(500);
		
		
		System.out.println(conta);
		System.out.println(contap);
		
	}
}
