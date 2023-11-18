package ent;

public class util {
	private int num_conta;
	private String name;
	public double deposito;
	
	public util(int num_conta, String name) {
		this.num_conta = num_conta;
		this.name = name;
	}
	public util(int num_conta, String name, double deposito_inicial) {
		this.num_conta = num_conta;
		this.name = name;
		deposito(deposito_inicial);
	}
	
	public int getNum_conta() {
		return num_conta;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getDeposito() {
		return deposito;
	}
	public void deposito(double deposito) {
		this.deposito += deposito;
	}
	public void saque(double deposito) {
		this.deposito -= deposito + 5.00;
	}
	public String toString() {
		return "Conta "
				+ num_conta
				+ ", Titular: "
				+ name
				+ ", Saldo: $"
				+String.format("%.2f", deposito);
	}
}
