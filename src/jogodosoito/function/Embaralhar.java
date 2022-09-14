package jogodosoito.function;

import java.util.Random;

public class Embaralhar {
	
	public static String[][] embaralha(String[][] objetivo) {
		
		Random random = new Random();
		int x, y, a, b;
		
		for (y = 0; y < objetivo.length - 1; y++) {
			for (x = 0; x < objetivo.length; x++) {
				a = random.nextInt(objetivo.length);
				b = random.nextInt(objetivo.length);
				
				String temp = objetivo[x][y];
				objetivo[x][y] = objetivo[b][a];
				objetivo[b][a] = temp;
			}
		}
		
		return objetivo;
	}
}
