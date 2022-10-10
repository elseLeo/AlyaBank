
public class Cadastro {

	private String nome, endereco, cpf, profissao;
	private double renda;

	/*
	 * Função "set" usada para poder acesar o atributo da classe "Cadastro" que esta
	 * privado
	 */
	public void setName(String name) {
		nome = name;
	}

	/*
	 * Função "get" usada para pegar o valor armazenado no "set" name e inserir no
	 * atributo "nome" da classe
	 */
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
		return renda;
	}

	public void fichaCadastral() {
		System.out.println("Dados Cadastrados");
		System.out.println("Nome: Tom Holland");
		System.out.println("CPF: 094.434.469.60");
		System.out.println("Enderreço: Rua Lauriston Nº 17 Londres Inglaterra");
		System.out.println("Profissão: Ator");
		System.out.println("Renda: 5.000.000,00");
		System.out.println("Banco: 085");
		System.out.println("Agencia: 001");
		System.out.println("Nº Conta: 00001-1");
	}
}
