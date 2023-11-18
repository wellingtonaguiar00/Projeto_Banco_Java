import java.util.Scanner;
import ent.util;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		util util;

		System.out.print("Digite o numero da conta: ");
		int num_conta = sc.nextInt();
		System.out.print("Digite o nome do titular: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.print("Vai ter deposito inicial (y/n)?");
		char response = sc.next().charAt(0);

		if (response == 'y' || response == 'Y') {
			System.out.println("Digite o valor inicial: ");
			double deposito_inicial = sc.nextDouble();
			util = new util(num_conta, name, deposito_inicial);
		} else {
			util = new util(num_conta, name);
		}

		System.out.println();
		System.out.println("Dados da conta: ");
		System.out.println(util);
		System.out.println("Deseja inserir valor de deposito ou saque (y/n)?");
		char resposta = sc.next().charAt(0);

		while (resposta == 'y' || resposta == 'Y') {
			System.out.println("Deseja fazer um deposito ou saque? ");
			String opcao = sc.next().toLowerCase();

			if (opcao.equals("deposito")) {
				System.out.println();
				System.out.print("Digite um valor para deposito: ");
				double depositvalue = sc.nextDouble();
				util.deposito(depositvalue);
			} else if (opcao.equals("saque")) {
				System.out.print("Digite um valor para saque: ");
				double saquevalue = sc.nextDouble();
				util.saque(saquevalue);
			} else {
				System.out.println("Digite a opção correta!");
			}
			System.out.println("Deseja continuar (y/n)?");
			resposta = sc.next().charAt(0);
		}
		System.out.println("Dados da conta: ");
		System.out.println(util);
		System.out.println("Fim");
		sc.close();
	}

}