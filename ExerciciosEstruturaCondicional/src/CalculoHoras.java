/* 
 * Leia a hora inicial e a hora final de um jogo. A seguir calcule a dura��o do jogo, sabendo que o mesmo pode
 * come�ar em um dia e terminar em outro, tendo uma dura��o m�nima de 1 hora. 
 */



import java.util.Scanner;

public class CalculoHoras {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Hora inicial: ");
		int horaInicial = sc.nextInt();
		System.out.print("Hora final: ");
		int horaFinal = sc.nextInt();
		int tempoFinal;
		
		if (horaInicial < horaFinal) {
			tempoFinal = horaFinal - horaInicial;
		}
		else {
			tempoFinal = 24 - horaInicial + horaFinal;
		}
		
		System.out.println("O JOGO DUROU " + tempoFinal + " HORA(S).");
		
		sc.close();
	}

}
