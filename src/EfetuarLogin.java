import java.util.Scanner;
public class EfetuarLogin {
		
		public void efeturLogin() {
		Scanner sc = new Scanner(System.in);
		String login1, senha1, email = null, senha = null;
		System.out.println("Login:");
		login1 = sc.next();
		if (login1 == email) {
			System.out.println("Senha:");
			senha1 = sc.next();
			if (senha1 == senha) {	
				}
			else {
				System.out.println("SENHA INCORRETA!");
			}
		}
		else {
			System.out.println("LOGIN INCORRETO!");
		}
		sc.close();
	}

}

