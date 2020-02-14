package Multiplos;

public class Multiplos {
	
	int x = 3;
	int y = 5;
	int soma = 0;
	
	public int Multiplos(int valor) {
		
		for (int i = valor - 1; i > 0; i--) {
			if(i % x == 0 || i % y == 0) {
				soma += i;
			}
		}
		return soma;
	}
}
