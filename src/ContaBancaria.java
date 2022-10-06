
public class ContaBancaria {
	private int agencia = 0101, nConta = 001;
	private double saldoDebito , saldoCredito;
	private String email, senha;
	
	public void setEmail(String mail) {
		email = mail;
	}
	public String getEmail() {
		return email;
	}
	public void setSenha(String key) {
		senha = key;
	}
	public String getSenha() {
		return senha;
	}
	public void setSaldoDebito(double cashDebito) {
		saldoDebito = cashDebito;
	}
	public double getSaldoDebito() {
		return saldoDebito;
	}
	public void setSaldoCredito(double cashCredito) {
		saldoCredito = cashCredito;
	}
	public double getSaldoCredito() {
		return saldoCredito;
	}
	public void imprimirSaldo() {
		System.out.println(saldoDebito);
	}
	public void setAgencia(int ag) {
		agencia = ag;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setNConta(int nc) {
		nConta = nc;
	}
	public int getNConta() {
		return nConta;
	}

}
