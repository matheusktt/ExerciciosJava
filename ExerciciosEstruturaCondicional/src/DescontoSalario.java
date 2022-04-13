// Calcular o desconto do vale transporte do funcionário, que corresponde a 6% do salario e mostrar o seu salario bruto




import java.util.Locale;
import java.util.Scanner;

public class DescontoSalario {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("Digite seu salário: R$ ");
		double salario = sc.nextDouble();
		double descontoVt = (6.0 / 100) * salario;
		double salarioBruto = salario - descontoVt;
		
		System.out.printf("O Desconto do seu vale transporte é %.2f%n", descontoVt);
		System.out.printf("Seu salario bruto é R$ %.2f", salarioBruto);
		
		sc.close();
	}

}
