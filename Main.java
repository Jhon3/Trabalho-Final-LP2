/*
 * Main provisorio de testes
 */
public class Main {
	public static void main(String[] args)
	{
		//--Testando a coleta dos nomes dos arquivos e a contagem das palavras
		
		Sistema sistema = new Sistema();
		sistema.add("./arquivos/google.dat");
		sistema.sortList();
		sistema.printNumeroPalavras();
		
		
		
		//--Testando a interface
		//InterfaceGrafica frame = new InterfaceGrafica();
		
		
		//--Testando a arvore
		/*
		DigitalTree<String> arvore = new DigitalTree<String>();
		
		//Testando o Put
		arvore.put("Jhonattan", "*");
		arvore.put("Lobo", "*");
		
		String resultado = null;
		
		//Testando a busca  e o get
		boolean resultadoBusca1 = false;
		boolean resultadoBusca2 = false;
		if(arvore.get("Lobo") != null)
			resultadoBusca1 = true;
		if(arvore.get("Lua") != null)
			resultadoBusca1 = true;
		
		
		System.out.println("--Testando a Busca e o Get--");
		System.out.println("Cont�m Lobo? --> " + resultadoBusca1 + " | " + 
				"Informacao contida: " + arvore.get("Lobo"));
		System.out.println("Cont�m Lua? --> " + resultadoBusca2 + " | " + 
				"Informacao contida: " + arvore.get("Lua"));
		
		//Testando o Delete
		arvore.delete("Lobo");
		boolean resultadoBusca3 = false;
		if(arvore.get("Lobo") != null)
			resultadoBusca3 = true;
		
		System.out.println("--Testando o Delete--");
		System.out.println("Cont�m Lobo? --> " + resultadoBusca3 + " | " + 
				"Informacao contida: " + arvore.get("Lobo"));
		*/

	}

}
