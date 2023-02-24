package othertests;

import java.util.Arrays;

public class CountSequence {

	public static void main(String[] args) {
	
		//Sequence count
		CountSequence t1 = new CountSequence();	
		t1.execTeste();
		System.out.println(
				"Quantidade de sequencias: "+
				t1.execute(new int[] {2, 1, 6, 7, 8, 58, 55, 5, 56, 57, 100, 120, 101})
		);
				
	}
	
	public int execute(int[] list) {
		
		int countSequence = 0;
		boolean lastCountSequence = false;
				
		Arrays.sort(list);
	
		Integer lastNumber = null;
		
		for(Integer number: list) {
				
			if(lastNumber != null) {
				
				if((number - lastNumber) == 1) {
					
					if(!lastCountSequence) {
						countSequence++;
						lastCountSequence = true;
					} else {
						lastCountSequence = true;
					}
				
				} else {
					lastCountSequence = false;
				}
				
			}
			
			lastNumber = number;
			
		}
				
		return countSequence;
	}
		
	public void execTeste() {
		if(2 == execute(new int[] {2, 1, 6, 7})) {
			System.out.println("Teste executado com sucesso!");
		} else {
			System.out.println("Falha na execução do teste!");
		}
	}
	
}
