/*
 * Um Posto de combust�veis deseja determinar qual de seus produtos tem a prefer�ncia de seus clientes. Escreva
 * um algoritmo para ler o tipo de combust�vel abastecido (codificado da seguinte forma: 
 * 1.�lcool 2.Gasolina 3.Diesel 4.Fim). Caso o usu�rio informe um c�digo inv�lido (fora da faixa de 1 a 4) 
 * deve ser solicitado um novo c�digo (at� que seja v�lido). O programa ser� encerrado quando o c�digo informado 
 * for o n�mero 4. Deve ser escrito a mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram 
 * cada tipo de combust�vel
 */



import java.util.Scanner;

public class VotacaoCombustivel {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual combust�vel � voc� abasteceu ? ");
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		int codigo = sc.nextInt();
		
		while (codigo != 4) {
			switch (codigo) {
			case(1):
				System.out.println("Alcool");
					alcool ++;
				break;
			case(2):
				System.out.println("Gasolina");
					gasolina ++;
				break;
			case(3):
				System.out.println("Diesel");
					diesel ++;
				break;
			default:
				System.out.println("Digite novamente:");
			}
			codigo = sc.nextInt();
		}
		System.out.println("MUITO OBRIGADO");
		System.out.println("Clientes quem abasteceram com Alcool: " + alcool);
		System.out.println("Clientes quem abasteceram com Gasolina: " + gasolina);
		System.out.println("Clientes quem abasteceram com Diesel: " + diesel);
		
		sc.close();
	}

}
