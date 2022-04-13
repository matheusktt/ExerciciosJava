/*
 * Instancie manualmente (hard code), os objetos e mostre na tela do terminal
 */

package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entidades.Comentario;
import entidades.Post;

public class Programa {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		Post p1 = new Post(
				sdf.parse("21/06/2018 13:05:44"), 
				"Traveling to New Zealand", 
				"I'm going to visit this wonderful country!", 
				12);
		
		Comentario c1 = new Comentario("Have a nice trip!");
		Comentario c2 = new Comentario("Wow that's awesome!");
		
		p1.adicionaComentario(c1);
		p1.adicionaComentario(c2);
		
		Post p2 = new Post(
				sdf.parse("28/07/2018 23:14:19"), 
				"Good night guys", 
				"See you tomorrow", 
				5);
		Comentario c3 = new Comentario("Good night");
		Comentario c4 = new Comentario("May the Force be with you");
		
		p2.adicionaComentario(c3);
		p2.adicionaComentario(c4);
		
		System.out.println(p1);
		System.out.println(p2);
	}

}
