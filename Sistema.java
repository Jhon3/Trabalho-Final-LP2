import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.io.*;
/*
 * Classe indexacao.
 * aqui vamos fazer a leitura dos nomes dos arquivos e colocar-lo na arvore,
 * vamos tambem listalo em ordem alfabetica.
 */
public class Sistema {

	private List<Arquivo> arquivos;
	
	public Sistema()
	{
		arquivos = new ArrayList<Arquivo>();
	}
	
	
	//M�todo para remover um arquivo que nao sera mais utilizado
	public void remove(String file)
	{
		for(Arquivo a: arquivos)
		{
			if(a.getNome().equals(file))
			{
				arquivos.remove(a);
			}
		}
	}
	
	//Método para listar em ordem alfabetica
	//P.S - > por enquanto coloquei como println, porém os arquivos serão listados na interface grafica
	public void sortList()
	{
		List<Arquivo> ordemAlfa = arquivos;
		Collections.sort(ordemAlfa, new Comparator<Arquivo>() {
			public int compare(Arquivo arquivo1, Arquivo arquivo2) {
				return arquivo1.getNome().compareTo(arquivo2.getNome());
			}
		});
	}
	
	//Método para adicionar um arquivo.
	//ele também conta o numero de paralvras que consta dentro do arquivo.
	public void add(String file)
	{
		//List<String> palavras = new ArrayList<String>();
		int quantidadeDePalavras = 0;
		List<Integer> numeroDePalavras = new ArrayList<Integer>();
		
		
		try {
			
			BufferedReader reader = new BufferedReader( new FileReader(file));
			while(reader.ready())
			{
				String[] palavras = null;
				palavras = reader.readLine().split("(?!^)\\b"); //ver como esta splitando!
				numeroDePalavras.add(palavras.length);
			}
			reader.close();
			
			//quantidadeDePalavras = palavras.length;
			Arquivo novoArquivo = new Arquivo(file, numeroDePalavras);
			arquivos.add(novoArquivo);
			}
		
			catch(IOException e)
			{
				System.out.println("Arquivo nao encontrado! Erro: " + e);
			
			}
		
		}
	
	public void printNumeroPalavras()
	{
		for(Arquivo files: arquivos)
		{
			System.out.println("Arquivo: " + files.getNome());
			System.out.println("Total de palavras: " + files.totalPalavrasArquivo());
		}
	}
	//Nota1: Temos que implementar duas arvores AVL uma para conter uma blacklist de palavras indesejadas e outra para conter
	//as palavras que serão buscadas.
	// ps1-> o vetor de "arquivos" dessa classe servira apenas para indicar os nomes dos arquivos que serão jogados para as arvores.
	//Nota2: Verificar se é possivel adicionar as palavras ja em ordem alfabetica nas arvores. assim facilitando o autocomplete.
	
		
		
	}
	

