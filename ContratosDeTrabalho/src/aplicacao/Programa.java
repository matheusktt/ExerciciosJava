/*
 * Ler os dados de um trabalhador com N contratos (N fornecido pelo usuário). Depois, solicitar 
 * do usuário um mês e mostrar qual foi o salário do funcionário nesse mês
 */

package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entidades.Departamento;
import entidades.Funcionario;
import entidades.HorasContrato;
import entidades.enums.Cargo;

public class Programa {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Entre com o nome do departamento: ");
		String nomeDepartamento = sc.nextLine();
		System.out.println("Entre com os dados do Funcionario:");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Cargo: ");
		String cargo = sc.nextLine();
		System.out.print("Salário base R$ ");
		double salarioBase = sc.nextDouble();
		Funcionario func = new Funcionario(nome, Cargo.valueOf(cargo), salarioBase, new Departamento(nomeDepartamento));
		
		System.out.print("Quantos contratos deseja adicionar para esse Funcionario ? ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Contract #" + i + " data:");
			System.out.print("Data do contrato (DD/MM/YYYY): ");
			Date contratoData = sdf.parse(sc.next());
			System.out.print("Valor por Hora R$");
			double valorPorHora = sc.nextDouble();
			System.out.print("Duração (horas): ");
			int horas = sc.nextInt();
			HorasContrato contrato = new HorasContrato(contratoData, valorPorHora, horas);
			func.adicionaContrato(contrato);
		}
		
		System.out.println();
		System.out.print("Insira o mês e ano para calcular a renda: ");
		String mesAno = sc.next();
		int mes = Integer.parseInt(mesAno.substring(0, 2));
		int ano = Integer.parseInt(mesAno.substring(3));
		System.out.println("Nome: " + func.getNome());
		System.out.println("Departamento: " + func.getDepartamento().getNome());
		System.out.println("Renda " + mesAno + ": " + String.format("%.2f", func.renda(ano, mes)));
		
		sc.close();
	}
}
