package jogodosoito.function;

public class Mover {
	
	public static String[][] move(String insert, int [] index, String[][] desafio){
		
		int [] posicaoInserido = Buscar.buscaIndexValorInserido(desafio, insert);
		int linhaInserido = posicaoInserido[0];
		int colunaInserido = posicaoInserido[1];
		int linhaBranca = index[0];
		int colunaBranca = index[1];
		String temp;
		
		if (Verificar.verificaEntrada(linhaBranca, colunaBranca, linhaInserido, colunaInserido) == false) {
			System.out.println("\n Valor inserido não é válido!!");
			System.out.println("Por gentileza, inserir um valor válido! \n");
			
			return desafio;
		}
		
		temp = desafio[linhaBranca][colunaBranca];
		desafio[linhaBranca][colunaBranca] = desafio[linhaInserido][colunaInserido];
		desafio[linhaInserido][colunaInserido] = temp;
		
		return desafio;
	}

}
