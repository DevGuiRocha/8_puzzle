package jogodosoito.function;

import java.util.Objects;

public class Buscar {
	
	public static int [] buscaIndexEspaco(String[][] desafio) {
		int x, y;
		
		for (x = 0; x <= 2; x++) {
			for (y = 0; y <= 2; y++) {
				if (desafio[x][y] == "") {
					
					int index [] = new int[2];
					
					index[0] = x;
					index[1] = y;
					
					return index;
					
				}
			}
		}
		return new int[0];
	}
	
	public static int [] buscaIndexValorInserido(String[][] desafio, String insert) {
		int x, y;
		
		for (x = 0; x <= 2; x++) {
			for (y = 0; y <= 2; y++) {
				if(Objects.equals(desafio[x][y], insert)) {
					
					int index[] = new int[2];
					index[0] = x;
					index[1] = y;
					
					return index;
				}
			}
		}
		return new int[0];
	}

}
