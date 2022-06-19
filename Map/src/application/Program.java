/*
 * Em um portal de cursos online, cada usuário possui um código único, representado por
 * um número inteiro.
 * Cada instrutor do portal pode ter vários cursos, sendo que um mesmo aluno pode se
 * matricular em quantos cursos quiser. Assim, o número total de alunos de um instrutor não
 * é simplesmente a soma dos alunos de todos os cursos que ele possui, pois pode haver
 * alunos repetidos em mais de um curso.
 * O instrutor Alex possui três cursos A, B e C, e deseja saber seu número total de alunos.
 * Seu programa deve ler os alunos dos cursos A, B e C do instrutor Alex, depois mostrar a
 * quantidade total e alunos dele, conforme exemplo.
 */

package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

public class Program {

	public static void main(String[] args) {
		
		String path = "C:\\Users\\matheus\\Desktop\\in.txt";
		
		Map<String, Integer> map = new LinkedHashMap<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				String name = fields[0];
				int count = Integer.parseInt(fields[1]);

				if (map.containsKey(name)) {
					int votesSoFar = map.get(name);
					map.put(name, count + votesSoFar);
				}
				else {
					map.put(name, count);
				}
				
				line = br.readLine();
			}
			
			for (String key : map.keySet()) {
				System.out.println(key + ": " + map.get(key));
			}
		
		}catch (IOException e) {
			
		}
	}

}
