import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double numero1 = 0;
		double numero2 = 0;
		double resultado = 0;
		char operacao;
		
		do {
		
System.out.println("=========================\r\n"
		+ "| CALCMASTER 3000        |\r\n"
		+ "=========================\r\n"
		+ "======= TECLADO ======\r\n"
		+ "| [1]  [2]  [3]   [+] |\r\n"
		+ "| [4]  [5]  [6]   [-] |\r\n"
		+ "| [7]  [8]  [9]   [*] |\r\n"
		+ "| [0]  [.]  [√]   [^] |\r\n"
		+ "| [Enter]         [/]    |\r\n"
		+ "=======================\r\n"
		+ "");

	System.out.print("Escolha a operação (+, -, *, /, ^, √) ou [0] para sair: ");
	operacao = scanner.next().charAt(0);
	
	if (operacao == '0') {
        break;
	}
	
	switch (operacao) {
	
	case '+':
			
			System.out.print("Digite o primeiro número: ");
			numero1 = scanner.nextDouble();
			
			System.out.print("Digite o segundo número: ");
			numero2 = scanner.nextDouble();
			
			resultado = numero1 + numero2;
			
			System.out.println("============================");
			System.out.println("| Resultado da ADIÇÃO: " + resultado + ("   |"));
			System.out.println("============================");
			System.out.println("============================");
			System.out.println("|      Fim da operação!    |\r\n"
					+ "============================\r\n"
					+ "");
			
			
			break;
			
			
							// 
			
	case '-':
		
		System.out.print("Digite o primeiro número: ");
		numero1 = scanner.nextDouble();
		
		System.out.print("Digite o segundo número: ");
		numero2 = scanner.nextDouble();
		
		resultado = numero1 - numero2;
		
		System.out.println("============================");
		System.out.println("| Resultado da SUBTRAÇÃO: " + resultado + ("   |"));
		System.out.println("============================");
		System.out.println("============================");
		System.out.println("|      Fim da operação!    |\r\n"
				+ "============================\r\n"
				+ "");
		
		
		
		break;
		
		
						//
		
		
	case '*':
		
		System.out.print("Digite o primeiro número: ");
		numero1 = scanner.nextDouble();
		
		System.out.print("Digite o segundo número: ");
		numero2 = scanner.nextDouble();
		
		resultado = numero1 * numero2;
		
		System.out.println("============================");
		System.out.println("| Resultado da MULTIPLICAÇÃO: " + resultado + ("   |"));
		System.out.println("============================");
		System.out.println("============================");
		System.out.println("|      Fim da operação!    |\r\n"
				+ "============================\r\n"
				+ "");
		
		break;
		
		
					//
		
		
	case '/':
		
		System.out.print("Digite o primeiro número: ");
		numero1 = scanner.nextDouble();
		
		System.out.print("Digite o segundo número: ");
		numero2 = scanner.nextDouble();
		
		resultado = numero1 / numero2;
		
		System.out.println("============================");
		System.out.println("| Resultado da DIVISÃO: " + resultado + ("   |"));
		System.out.println("============================");
		System.out.println("============================");
		System.out.println("|      Fim da operação!    |\r\n"
				+ "============================\r\n"
				+ "");
		
		break;
		
		
					//
		
		
	case '^':
		
		System.out.print("Digite o primeiro número: ");
		numero1 = scanner.nextDouble();
		
		System.out.print("Digite o segundo número: ");
		numero2 = scanner.nextDouble();
		
		resultado = Math.pow(numero1, numero2);
		
		System.out.println("============================");
		System.out.println("| Resultado da POTÊNCIA: " + resultado + ("   |"));
		System.out.println("============================");
		System.out.println("============================");
		System.out.println("|      Fim da operação!    |\r\n"
				+ "============================\r\n"
				+ "");
		
		break;
		
		
					//
		
		
	case '√':
		
		System.out.print("Digite o número: ");
		numero1 = scanner.nextDouble();
		
		resultado = Math.sqrt(numero1);
		
		System.out.println("============================");
		System.out.println("| Resultado da RAÍZ QUADRADA: " + resultado + ("   |"));
		System.out.println("============================");
		System.out.println("============================");
		System.out.println("|      Fim da operação!    |\r\n"
				+ "============================\r\n"
				+ "");
		
		
		break;
		
	default:
		System.out.println("Operação inváilda!");
		
		break;
		
	
			}
	
		} 
		
		
		while (operacao != '0');
		
		
		System.out.println("============================\r\n"
				+ "|      Fim da operação!    |\r\n"
				+ "============================\r\n"
				+ "");
		
		scanner.close();
		
		
	}
}