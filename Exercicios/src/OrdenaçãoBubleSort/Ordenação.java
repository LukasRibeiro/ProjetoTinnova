package OrdenaçãoBubleSort;

public class Ordenação {
	
	int vetor[] = {5, 3, 2, 4, 7, 1, 0, 6};
	
	int aux = 0;
	
	public void ordenação() {
		
		for(int i = vetor.length; i >= 1; i--) {
	        for(int j = 1; j < i; j++) {
	            if (vetor[j - 1] > vetor[j]) {
	                aux = vetor[j];
	                vetor[j] = vetor[j - 1];
	                vetor[j - 1] = aux;
	            }
	        }
		}
		for(int x = 0; x < vetor.length; x ++) {
			System.out.println(vetor[x]);	
		}
	}
}