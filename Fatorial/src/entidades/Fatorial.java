package entidades;

public class Fatorial {
	
	public static int fatorial = 1;
	
	public static int calculaFatorial(int N) {
		for (int i = 1; i <= N; i++) {
			  fatorial = fatorial * i;
		}
		return fatorial;

	}
}
