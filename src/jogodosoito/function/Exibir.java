package jogodosoito.function;

public class Exibir {
	
	public static void exibeTabela(String[][] array) {
		
		int x, y;
		
		for (x = 0; x <= 2; x++) {
			for (y = 0; y <= 2; y++) {
				System.out.print(array[x][y] + "\t");
			}
			System.out.println();
		}
		
	}

}
