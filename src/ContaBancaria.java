
public class ContaBancaria {
	private String agencia = "0101", nConta = "00001-1";
	private double saldoDebito, saldoCredito;
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

	public void setAgencia(String ag) {
		agencia = ag;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setNConta(String nc) {
		nConta = nc;
	}

	public String getNConta() {
		return nConta;
	}

}