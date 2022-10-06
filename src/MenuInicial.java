import java.util.Scanner;
public class MenuInicial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EfetuarLogin efetuarLogin = new EfetuarLogin();
		EfetuarCadastro efetuarCadastro = new EfetuarCadastro();
		
		
		
		System.out.println("|-----------------------------|");
		System.out.println("1- Abrir nova conta");
		System.out.println("2- Acessar sua conta"); 
		System.out.println("3 - Sair");
		System.out.println("Selecione alguma das opções:");
		System.out.print("|-------------------------------|");
		int op = sc.nextInt();
		switch(op) {
		
		case 1:{
			efetuarCadastro.efetuarCadastro();
			break;
		}
		case 2:{
			efetuarLogin.efeturLogin();
			break;
		}
		case 3:{
			System.out.println("Slogan");
			
		}
	}
		sc.close();
			
			
					
}
		
			
			
		
		
		
		
		

	}


