import java.util.Scanner;

public class EfetuarCadastro {

	Scanner sc = new Scanner(System.in);
	Cadastro cadastro = new Cadastro();
	ContaBancaria conta = new ContaBancaria();

	public void efetuarCadastro() {

		String nome, endereco, cpf, profissao;
		int renda;

		System.out.println("Digite seus dados:");
		System.out.println("Nome:");
		nome = sc.nextLine();
		System.out.println("CPF:");
		cpf = sc.nextLine();
		System.out.println("Endereco:");
		endereco = sc.nextLine();
		System.out.println("Profissão:");
		profissao = sc.nextLine();
		System.out.println("Renda:");
		renda = sc.nextInt();

		cadastro.setName(nome);
		cadastro.setId(cpf);
		cadastro.setAddress(endereco);
		cadastro.setJob(profissao);
		cadastro.setMoney(renda);
		System.out.println("---------------------------");
		cadastro.fichaCadastral();
		System.out.println("---------------------------");

		/*
		 * Verificar como inserir boolean no cogigo, para validar os dados do cadastro,
		 * e ai sim continuar para o login e senha.
		 */

	}

}
