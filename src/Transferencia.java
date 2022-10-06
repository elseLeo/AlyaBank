import java.util.Scanner;
public class Transferencia {
	Scanner sc = new Scanner(System.in);
	ContaBancaria contabancaria = new ContaBancaria();
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
		sc.close();
		contabancaria.setSaldoDebito(-valor);
		}
	
;
}
