package Model;

public class Conta  {
	
	protected String nomeTitular;
	protected String cpf;
	protected int    numConta;
	protected float  saldo;
	
	public Conta(String nomeTitular, String cpf, int numConta, float saldo) {
		
		this.nomeTitular = nomeTitular;
		this.cpf = cpf;
		this.numConta = numConta;
		this.saldo = saldo;
	}
	public String getNomeTitular() {
		return nomeTitular;
	}
	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	public float getSaldo() {
		return saldo;
	}
	
	public void creditar(float valor) {
		saldo = saldo + valor;
	}
	
	public boolean debitar(float valor) {
		if (saldo >= valor) {
			saldo = saldo - valor;
			return true;
		}
		else {
			return false;
		}
	}
	@Override
	public String toString() {
		return "Conta [nomeTitular=" + nomeTitular + ", cpf=" + cpf + ", numConta=" + numConta + ", saldo=" + saldo
				+ "]";
	}

}