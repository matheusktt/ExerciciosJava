/*
 * Faça um programa para ler um arquivo contendo funcionários (nome e salário) no formato 
 * .csv (separados por ","), armazenando-os em uma lista. Depois, ordenar a lista por nome 
 * e mostrar o resultado na tela. Nota: o caminho do arquivo pode ser informado "hardcode".
 */

package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entities.Employee;

public class Program {
	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<>();
		String path = "C:\\Users\\matheus\\Desktop\\in.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String employeeCsv = br.readLine();
			while (employeeCsv != null) {
				
				//separando os campos
				String[] fields = employeeCsv.split(",");
				
				//adicionando na lista e convertendo para double
				list.add(new Employee(fields[0], Double.parseDouble(fields[1])));
				
				//lê a próxima linha
				employeeCsv = br.readLine();
			}
			
			Collections.sort(list);
			
			for (Employee emp : list) {
				System.out.println(emp.getName() + ", " + emp.getSalary());
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}