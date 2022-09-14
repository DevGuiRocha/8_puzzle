package jogodosoito.function;

public class Verificar {
	
	public static boolean verificaVitoria(String[][] desafio) {
		
		int x, y;
		int z = 0;
		String numero[] = {"1","2","3","4","5","6","7","8",""};
		
		for (x = 0; x <= 2; x++) {
			for (y = 0; y <= 2; y++) {
				String a = desafio[x][y];
				String n = numero[z];
				z++;
				
				if (a != n) {
					return false;
				}
			}
		}
		
		return true;
	}
	
	public static boolean verificaEntrada(int linhaBranca, int colunaBranca, int linhaInserido, int colunaInserido) {
		
		if (linhaBranca == linhaInserido && colunaBranca == colunaInserido) {
			return false;
		}
		
		if ((linhaInserido > 2) || (linhaInserido < 0) || (colunaInserido > 2) || (colunaInserido < 0)) {
			return false;
		}
		
		if (Math.abs(linhaBranca - linhaInserido) + Math.abs(colunaBranca - colunaInserido) > 1) {
			return false;
		}
		
		return true;
		
	}

}
