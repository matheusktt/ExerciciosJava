/*
 * Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
 * um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 
 * 1.Álcool 2.Gasolina 3.Diesel 4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) 
 * deve ser solicitado um novo código (até que seja válido). O programa será encerrado quando o código informado 
 * for o número 4. Deve ser escrito a mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram 
 * cada tipo de combustível
 */



import java.util.Scanner;

public class VotacaoCombustivel {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual combustível é você abasteceu ? ");
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
