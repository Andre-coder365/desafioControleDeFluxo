package desafioControleDeFluxo;

import java.util.Scanner;

public class Contador {
	
	
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		
		
		
		try {
			System.out.println("Digite o primeiro número (parâmetro 1)");
			int parametroUm = entrada.nextInt();
			System.out.println("Digite o segundo número (parâmetro 2)");
			int parametroDois = entrada.nextInt();
			
			//chama o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
			
		} catch (ParametrosInvalidosException e) {
			
			System.out.println("O segundo parâmetro deve ser maior que o primeiro");
		}
		finally {
			entrada.close();
		}
	}
	
	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		if (parametroDois <= parametroUm) {throw new ParametrosInvalidosException();} else {
			int contagem = parametroDois - parametroUm;
			
			for (int i = 1; i <= contagem; i++) {
				System.out.println("Imprimindo o número " + i);
			}
			
		}
		
		
	
	}

}
