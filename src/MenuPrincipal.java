import java.util.Scanner;
public class MenuPrincipal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Deposito deposito = new Deposito();
		Transferencia transferencia = new Transferencia();
		EfetuarCadastro verCadastro = new EfetuarCadastro();
		
		System.out.println("-------Menu de Opções-------");
		System.out.println("1- Depositos:");
		System.out.println("2- Trânsferencias:");
		System.out.println("3- Pagamentos:");
		System.out.println("4- Conta:");
		int op = sc.nextInt();
		switch(op) {
		case 1:{
			deposito.depositar();
		}
		case 2:{
			transferencia.transferencia();
		}
		case 3:{
						
		}
		case 4:{
			verCadastro.efetuarCadastro();
		}
	}
		
		sc.close();
	}

}
