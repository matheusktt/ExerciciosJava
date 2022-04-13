package excecoes;

public class ExcecaoConta extends RuntimeException{
	
	//versao da Exception
	private static final long serialVersionUID = 1L;

	public ExcecaoConta(String msg) {
		super(msg);
	}
}