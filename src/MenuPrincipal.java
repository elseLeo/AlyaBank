import java.util.Scanner;

public class MenuPrincipal {

	public void menuPrincipal() {
		Scanner sc = new Scanner(System.in);
		Deposito deposito = new Deposito();
		Transferencia transferencia = new Transferencia();
		Cadastro cadastro = new Cadastro();
		Pagamento pagamento = new Pagamento();

		System.out.println("-------Menu de Opções-------");
		System.out.println("1- Depositos:");
		System.out.println("2- Trânsferencias:");
		System.out.println("3- Pagamentos:");
		System.out.println("4- Conta:");
		System.out.println("5- Sair");
		int op = sc.nextInt();
		while (op != 5) {
			switch (op) {
			case 1: {
				deposito.depositar();
				break;
			}
			case 2: {
				transferencia.transferencia();
				break;
			}
			case 3: {
				pagamento.pagamento();
				break;
			}
			case 4: {
				cadastro.fichaCadastral();
				break;

			}

			}
			sc.close();
		}
	}
}
