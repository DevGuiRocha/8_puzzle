package jogodosoito.table;

public class tabela {
	
	public static String [][] geraTabela() {
		
		String array[][] = new String[3][3];
		String numero[] = {"1","2","3","4","5","6","7","8",""};
		int x, y;
		int z = 0;
		
		System.out.println("Bem Vindo ao Desafio 8 Puzzle");
		
		for (x = 0; x <=2; x++) {
			for (y = 0; y <= 2; y++) {
				
				array[x][y] = numero[z];
				
				z++;
			}
		}
		
		return array;
	}
}
