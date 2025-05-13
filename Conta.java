//Classe abstrata conta
/**
 * @author Matheus Rocha
 * @author Isabela Aquino
 * 
 */

/* Conta é uma abstração por obter características mais pertinentes sobre si mesma*/
abstract class Conta {
	
	/* campos de instância privados para prevenir que sejam acessados e mudados através de metodos que não sejam
	 * da propria classe*/
	private String titular;
	private double saldo; // Caso fosse (public) poderia ser acessado e chamado no programa sem a necessidade de Getters e Setters
	
	
	public Conta() {
		
	}
	
	public Conta(String titular, double saldo) {
		this.titular = titular;
		this.saldo = saldo;
	
	}
	
	
	// Encapsulamento: Metodos para acessar atributos privados
	
	/* Metodos acessores e mutadores para interagirem com os campos privados*/
	public String getTitular() {
		return titular;
	}
	

	public double getSaldo() {
		return saldo;
	}
	
	
	
	// metodo protegido, acessado somente pela subclasse
	protected void alterarSaldo(double valor) {
		this.saldo += valor;
	}
	
	// metodos abstratos
	public abstract void depositar(double valor);
	public abstract void sacar(double valor);
	
	// metodo para formatar representação de saida de String
	@Override
	public String toString() {
		return "Titular: " + this.titular + " Saldo: R$" + this.saldo; 
	}
}


//Classe concreta que implementa os metodos abstratos
class ContaCorrente extends Conta{
	public ContaCorrente(String titular) {
		super(titular, 0.0);
	}
	
	/**
	 * @param valor*/
	public void depositar(double valor) {
		if(valor > 0) {
			alterarSaldo(valor);
			System.out.println("Deposito de R$" + valor + " realizado");
		}
	}
	
	/**
	 * 
	 * @param valor*/
	public void sacar(double valor) {
		if(valor >= 0 && getSaldo() >= valor) {
			alterarSaldo(-valor);
			System.out.println("Saque de R$" + valor + " realizado\n");
		}else {
			System.out.println("Saldo insuficiente");
		}
	}
	
	
}


class ContaPoupanca extends Conta{
	public ContaPoupanca(String titular) {
		super(titular, 0.0);
	}
	
	/**
	 * @param valor*/
	public void depositar(double valor) {
		if(valor > 0) {
			alterarSaldo(valor);
			System.out.println("Deposito de R$" + valor + " realizado\n");
		}
	}
	
	
	/**
	 * 
	 * @param valor*/
	public void sacar(double valor) {
		if(valor >= 0 && getSaldo() >= 500) {
			alterarSaldo(-valor);
			System.out.println("Saque de R$" + valor + " realizado\n");
		}else {
			System.out.println("Saldo insuficiente\n");
		}
	}
	
}


