package Fatorial;

public class Fatorial {
	
	public double fatorial(double valor) {
		
		if(valor == 1 || valor == 0) {
			return valor;
		}else {
			return fatorial(valor -1) * valor;
		}
	}
}
