import java.util.Scanner;
public class EfetuarCadastro {
	
		
	Scanner sc = new Scanner(System.in);
	Cadastro cadastro = new Cadastro();
	ContaBancaria conta = new ContaBancaria();
					
		public  void efetuarCadastro() {
			
			String nome, endereco, cpf, profissao, email = null, senha = null;
			int renda;
			
			System.out.println("Digite seus dados:");
			System.out.println("Nome:");
			
			nome = sc.next(); 
			System.out.println("CPF:");
			cpf = sc.next(); 
			System.out.println("Endereco:");
			endereco = sc.next(); 
			System.out.println("Profissão:");
			profissao = sc.next(); 
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
			
			/*Verificar como inserir boolean no cogigo, para validar os dados do cadastro, 
			e ai sim continuar para o login e senha.
			
			
			Cadastro de Login e Senha*/
			System.out.println("Agora, cadastre um e-mail para login:");
			email = sc.next();
			conta.setEmail(email);
			System.out.println("Crie uma senha:");
			senha = sc.next();
			conta.setSenha(senha);
			sc.close();
			/*Verificar como inserir a tela de login após o cadastro do login e senha*/
		}
	
		
	}


