public class TesteContas {
	/*Metodo Main instanciando objeto da classe ContaCorrente
	 * executando metodos de depositar e sacar e ao final apresentando como saida o resultado
	 * das operações*/
	public static void main(String[] args) {
		var conta = new ContaCorrente("Jonas", 1500);
		conta.depositar(1500);
		conta.sacar(250);
		
		System.out.println(conta.toString());
		//System.out.println("Titular: " + conta.getTitular() + " e saldo" + conta.getSaldo());
	}
}
