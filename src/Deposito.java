import java.util.Scanner;

public class Deposito {
	Scanner sc = new Scanner(System.in);
	ContaBancaria contabancaria = new ContaBancaria();
	double saldoDebito;
	MenuPrincipal menuPrincipal = new MenuPrincipal();

	public void depositar() {
		System.out.println("Informe o valor de deposito:");
		saldoDebito = sc.nextDouble();
		contabancaria.setSaldoDebito(saldoDebito);
		System.out.println("Deposito efetuado no valor de R$" + saldoDebito);
		System.out.println("Digite 1 para voltar ao menu principal:");
		int op = sc.nextInt();
		if (op == 1) {
			menuPrincipal.menuPrincipal();
		} else {
			System.out.println("Opção inválida!!");
		}

	}
}
