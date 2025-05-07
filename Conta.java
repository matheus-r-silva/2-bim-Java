package abstracao.encaps;

//Classe abstrata conta

abstract class Conta {
	private String titular;
	private double saldo;
	private double valor;
	
	
	public Conta() {
		
	}
	
	public Conta(String titular, double saldo, double valor) {
		this.titular = titular;
		this.saldo = 0.0;
		this.valor = 0.0;
	}
	
	
	// Encapsulamento: Metodos para acessar atributos privados
	public String getTitular() {
		return titular;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	
	// metodo protegido, acessado somente pela subclasse
	protected void alterarSaldo(double valor) {
		this.valor += valor;
	}
	
	
	public abstract void depositar(double valor);
	public abstract void sacar(double valor);
	
	
}


//Classe concreta que implementa os metodos abstratos
class ContaCorrente extends Conta{
	
	public ContaCorrente(String titular) {
		super();
	}
	
	public void depositar(double valor) {
		if(valor > 0) {
			alterarSaldo(valor);
			System.out.println("Deposito de R$" + valor + " realizado");
		}
	}
	
	
	public void sacar(double valor) {
		if(valor != 0 && getSaldo() >= valor) {
			alterarSaldo(-valor);
			System.out.println("Saque de R$" + valor + " realizado");
		}else {
			System.out.println("Saldo insuficiente");
		}
	}
}


//Classe principal
class BancoApp{
	public static void main(String[] args) {
		var conta = new ContaCorrente("Davi");
		conta.depositar(1000);
		conta.sacar(250);
		
		System.out.println("Titular: " + conta.getTitular() + " e saldo" + conta.getSaldo());
	}
}