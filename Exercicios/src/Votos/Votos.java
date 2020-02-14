package Votos;

public class Votos {
	
	double eleitores = 1000;
	double validos = 800;
	double brancos = 150;
	double nulos = 50;
	
	public double votosValidos() {
		return this.validos / this.eleitores;
	}
	
	public double votosBrancos() {
		return this.brancos / this.eleitores;
	}
	
	public double votosNulos() {
		return this.nulos / this.eleitores;
	}
}
