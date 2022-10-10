import java.util.Scanner;

public class Transferencia {
	Scanner sc = new Scanner(System.in);
	ContaBancaria contabancaria = new ContaBancaria();
	MenuPrincipal menuPrincipal = new MenuPrincipal();
	String bc, ag, nc;
	double valor;

	public void transferencia() {
		System.out.println("Digite o numero do banco:");
		bc = sc.next();
		System.out.println("Digite a agencia:");
		ag = sc.next();
		System.out.println("Digite o numero da conta:");
		nc = sc.next();
		System.out.println("Digite o valor:");
		valor = sc.nextDouble();
		contabancaria.setSaldoDebito(-valor);
		System.out.println("Transferencia efetuadano valor de R$" + valor);
		System.out.println("Para visualizar o extrato digite 1, ou 2 para voltar ao menu principal:");
		int op = sc.nextInt();
		if (op == 1) {
			System.out.println("===Extrato transferência===");
			System.out.println("Banco: " + bc);
			System.out.println("Agência: " + ag);
			System.out.println("Numero da Conta: " + nc);
			System.out.println("Valor: R$" + valor);
			System.out.println("");
			System.out.println("Digite 2 para voltar ao menu inicial");
			int op1 = sc.nextInt();
			if (op1 == 2) {
				menuPrincipal.menuPrincipal();
			} else {
				System.out.println("Opção inválida!!");
			}

		} else if (op == 2) {
			menuPrincipal.menuPrincipal();
		} else {
			System.out.println("Opção inválida!!");
		}
	}
}
