import java.util.Scanner;
public class Deposito {
	Scanner sc = new Scanner(System.in);
	ContaBancaria contabancaria = new ContaBancaria();
	double saldoDebito;
	
		public void depositar() {
		System.out.println("Informe o valor de deposito:");
		saldoDebito = sc.nextDouble();
		contabancaria.setSaldoDebito(saldoDebito);
		contabancaria.imprimirSaldo();
		sc.close();
		
	}
}


	
	
	
