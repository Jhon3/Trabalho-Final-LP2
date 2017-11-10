//Lembrar de modificar e receber o numero de palavras por linha e nao por arquivo e adaptar o calculo
//do numero de total de palavras no arquivo fazendo um somatorio do numero de palavras por linha
//do arquivo analisado.

import java.util.Comparator;
import java.util.ArrayList;
import java.util.List;

/*
 * Classe que define um arquivo. 
 * Um arquivo contem o seu nome e a quantidade de palavras que ele tem.
 */
public class Arquivo implements Comparator<Arquivo> {

	private String nome; //Nome do arquivo
	private List<Integer> numeroDePalavrasPorLinha;
	
	public Arquivo(String nome, List<Integer> numeroDePalavras)
	{
		this.numeroDePalavrasPorLinha = numeroDePalavras;
		this.nome = nome;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String file) {
		this.nome = file;
	}

	/*
	 * Retorna o numero de palavras por linha
	 */
	public int totalPalavrasPorLinha(int linha)
	{
		return numeroDePalavrasPorLinha.get(linha+1);
	}
	
	/*
	 * Calcula e retorna o numero de palavras no arquivo
	 */
	public int totalPalavrasArquivo()
	{
		int numeroDePalavras = 0;
		
		for(Integer palavras: numeroDePalavrasPorLinha)
		{
			numeroDePalavras += palavras;
		}
	
		return numeroDePalavras;
	}


	@Override
	public int compare(Arquivo arquivo1, Arquivo arquivo2) {
		return this.getNome().compareTo(arquivo2.getNome());
	}
	
	
}
