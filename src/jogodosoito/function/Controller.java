package jogodosoito.function;

import java.util.Scanner;

import jogodosoito.table.tabela;

public class Controller {
	
	public static void entrada() {
		
		String objetivo[][];
		String desafio[][];
		Object [] retorna;
		Boolean confirma;
		
		confirma = false;
		objetivo = tabela.geraTabela();
		
		System.out.println("Objetivo do desafio: ");
		Exibir.exibeTabela(objetivo);
		System.out.println("\n");
		
		desafio = Embaralhar.embaralha(objetivo);
		
		while(confirma == false) {
			System.out.println("Tabela Embaralhada: ");
			Exibir.exibeTabela(desafio);
			System.out.println("\n");
			
			Scanner s = new Scanner(System.in);
			System.out.println("Inserir número: \n");
			String i = s.next();
									
			retorna = jogar(i, desafio);
			
			if((boolean) retorna[1] == true) {
				System.out.println("Parabéns, você concluiu o desafio!! \n");
				Exibir.exibeTabela((String[][]) retorna[0]);
				confirma = true;
			}else {
				confirma = (boolean) retorna[1];
				desafio = (String[][]) retorna[0];
			}
		}
	}
	
	public static Object [] jogar(String insert, String desafio[][]) {
		
		int [] index = Buscar.buscaIndexEspaco(desafio);
		boolean result = Verificar.verificaVitoria(desafio);
		String [][] arrayAlterado = Mover.move(insert, index, desafio);
		Object [] retorna = new Object[2];
		
		if(result == false) {
			retorna[0] = arrayAlterado;
			retorna[1] = false;
			return retorna;
		}else {
			retorna[0] = arrayAlterado;
			retorna[1] = true;
			return retorna;
		}
		
	}

}
