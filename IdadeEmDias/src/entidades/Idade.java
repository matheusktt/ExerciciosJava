package entidades;

public class Idade {
	
	public static int anos = 365;
	public static int mes = 30;
	
	public static int converteIdadeEmDias (int idadeAnos, int idadeMeses, int idadeDias) {
		return idadeAnos * anos + idadeMeses * mes + idadeDias;
	}
}
