package testes;

import java.util.Random;

public class RandomNumber1until9 {

	public static void main(String[] args) {
		
		RandomNumber1until9 random = new RandomNumber1until9();
		random.execTeste();
		System.out.println("O Número gerado foi: "+random.execute());
		
	}
	
	//generates random number from 1 to 9
	public int execute() {
			
		Random rand = new Random();
		
		return rand.nextInt(10)+1;
	}
	
	public void execTeste() {
		
		if((execute() < 9) && (execute() > 0)) {
			System.out.println("Teste executado com sucesso");
		} else {
			System.out.println("Falha na execução dos testes");
		}
		
	}
}
