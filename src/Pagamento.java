import java.util.Scanner;

public class Pagamento {

	public void pagamento() {
		Scanner sc = new Scanner(System.in);
		MenuPrincipal menuPrincipal = new MenuPrincipal();

		double vBoleto, nBoleto;
		int op;

		System.out.println("Digite o numero do Boleto:");
		nBoleto = sc.nextDouble();
		System.out.println("Informe o valor do boleto:");
		vBoleto = sc.nextInt();
		System.out.println("Deseja efetuar o pagamento parcelado do boleto? 1- sim, 2-não");
		op = sc.nextInt();
		if (op == 1) {
			int nParcelas;
			System.out.println("1X de R$"+Math.round(vBoleto*1.0499)+" Total: R$"+Math.round(vBoleto*1.0499));
			System.out.println("2X de R$"+Math.round(vBoleto*1.1212/2)+" Total: R$"+Math.round(vBoleto*1.1212));
			System.out.println("3X de R$"+Math.round(vBoleto*1.1519/3)+" Total: R$"+Math.round(vBoleto*1.1519));
			System.out.println("4X de R$"+Math.round(vBoleto*1.1819/4)+" Total: R$"+Math.round(vBoleto*1.1819));
			System.out.println("5X de R$"+Math.round(vBoleto*1.2110/5)+" Total: R$"+Math.round(vBoleto*1.2110));
			System.out.println("6X de R$"+Math.round(vBoleto*1.2367/6)+" Total: R$"+Math.round(vBoleto*1.2367));
			System.out.println("7X de R$"+Math.round(vBoleto*1.2628/7)+" Total: R$"+Math.round(vBoleto*1.2628));
			System.out.println("8X de R$"+Math.round(vBoleto*1.2969/8)+" Total: R$"+Math.round(vBoleto*1.2969));
			System.out.println("9X de R$"+Math.round(vBoleto*1.326/9)+" Total: R$"+Math.round(vBoleto*1.326));
			System.out.println("10X de R$"+Math.round(vBoleto*1.353/10)+" Total: R$"+Math.round(vBoleto*1.353));
			System.out.println("11X de R$"+Math.round(vBoleto*1.3812/11)+" Total: R$"+Math.round(vBoleto*1.3812));
			System.out.println("12X de R$"+Math.round(vBoleto*1.408/12)+" Total: R$"+Math.round(vBoleto*1.408));
			System.out.println("Informe o numero de parcelas:");
			nParcelas = sc.nextInt();
			System.out.println("Selecionado o parcelamento em: " + nParcelas + "x");
			System.out.println("Digite 2 para efetuar o pagamento:");
			op = sc.nextInt();
			if (op == 2) {
				System.out.println("Pagamento efetuado!");
				System.out.println("Digite 1 para voltar ao menu inicial:");
				int op1 = 0;
				if (op1 == 1) {
					menuPrincipal.menuPrincipal();
				}

			}

		} else {
			System.out.println("Pagamento do boleto " + nBoleto + " efetuado!");
			System.out.println("Digite 2 para voltar ao menu inicial:");
			int op1 = 0;
			if (op1 == 2) {
				menuPrincipal.menuPrincipal();
			}

		}
		sc.close();

	}

}
