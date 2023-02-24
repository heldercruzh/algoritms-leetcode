package estudos.testes;

import java.util.Random;
import java.util.Stack;

//https://www.devmedia.com.br/como-trabalhar-com-a-classe-stack/2966
public class StackDevMedia {

	public static void main(String args[]) { 
	
		Stack pilha = new Stack(); // Classe Pilha
		
		// Ver artigo geração de numeros randômicos
		Random random = new Random();
		   
		//Alimenta a pilha com números inteiros
		for (int i = 0;i < 10; i++) {
		// Insere na pilha números aleatórios de 0 a 100
		System.out.println("Inserindo na pilha: " + pilha.push(random.nextInt(100)));
		}
		// Retira da pilha
		for (int j = 0;j < 10; j++) {
		    System.out.println("Retirando da pilha: " + pilha.pop());
		}

	}
}
