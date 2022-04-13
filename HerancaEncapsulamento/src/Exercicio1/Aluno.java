/*******************************************************************************
Exerc�cio 1)
a) Criar uma classe data com os atributos dia, mes e ano, realizando os testes para saber se � uma data v�lida.
b) Usando heran�a, criar as classes Pessoa, Aluno e Funcion�rio
c) Usando Delega��o, criar na classe Pessoa o atributo Data de Nascimento do tipo Data (classe do item a)
d) Na classe Aluno dever� existir um atributo Data da Matricula que dever� ser do tipo Data (classe do item a)
e) Na classe Funcion�rio dever� existir um atributo Data de Admiss�o que dever� ser do tipo Data (classe do item a)
f) Criar uma classe Teste com um menu para cadastrar aluno e funcionario.
*******************************************************************************/

package Exercicio1;

public class Aluno extends Pessoa{
	private String ra;
	private Data dataMatricula;

	//construtor
	public Aluno(String nome, String rg,String dataNascimento, String ra, String dataMatricula){
		super(nome,rg,dataNascimento);
		this.ra = ra;
		this.dataMatricula = new Data(dataMatricula);
	}

	//gets
	public String getRa(){
		return this.ra;
	}
	public String getDataMatricula(){
		return this.dataMatricula.toString();
	}

	//sets
	public void setRa(String ra){
		this.ra = ra;
	}
	public void setDataMatricula(String dataMatricula){
		this.dataMatricula.setData(dataMatricula);
	}
}
