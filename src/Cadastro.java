
public class Cadastro {
	
	private String nome, endereco, cpf, profissao;
	private double renda;

	
	/*Função "set" usada para poder acesar o atributo da classe "Cadastro" que esta privado */
	public void setName(String name) {
		nome = name;
	}
	/*Função "get" usada para pegar o valor armazenado no "set" name e inserir no atributo "nome" da classe*/
	public String getName() {
		return nome;
	}
	public void setAddress(String address) {
		endereco = address;
	}
	public String getAddress() {
		return endereco;
	}
	public void setId(String id) {
		cpf = id;
	}
	public String getId() {
		return cpf;
	}
	public void setJob(String job) {
		profissao = job;
	}
	public String getJob() {
		return profissao;		
	}
	public void setMoney(int money) {
		renda = money;
	}
	public double getMoney() {
		return  renda;
	}
	

	
	public void fichaCadastral() {
		System.out.println("Revise seus dados:");
		System.out.println("Nome: " +nome);
		System.out.println("CPF: "+cpf);
		System.out.println("Enderreço: "+endereco);
		System.out.println("Profissão: "+profissao);
		System.out.println("Renda: "+renda);
	}
}

