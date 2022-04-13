/*
Exerc�cio 1)
a) Criar uma classe data com os atributos dia, mes e ano, realizando os testes para saber se � uma data v�lida.
b) Usando heran�a, criar as classes Pessoa, Aluno e Funcion�rio
c) Usando Delega��o, criar na classe Pessoa o atributo Data de Nascimento do tipo Data (classe do item a)
d) Na classe Aluno dever� existir um atributo Data da Matricula que dever� ser do tipo Data (classe do item a)
e) Na classe Funcion�rio dever� existir um atributo Data de Admiss�o que dever� ser do tipo Data (classe do item a)
f) Criar uma classe Teste com um menu para cadastrar aluno e funcionario.
*/

package Exercicio1;

public class Pessoa{
	String nome, rg;
	Data dataNascimento;

	//construtor
	public Pessoa(String nome, String rg,String dataString){
		this.nome = nome;
		this.rg = rg;
		this.dataNascimento = new Data(dataString);
	}

	//gets
	public String getNome(){
	 return this.nome;
	}
	public String getRg(){
		return this.rg;
	}
	public String getData(){
		return this.dataNascimento.toString();
	}

	//sets
	public void setNome(String nome){
		this.nome = nome;
	}
	public void setRg(String rg){
		this.rg = rg;
	}
}