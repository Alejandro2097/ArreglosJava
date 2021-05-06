package test.figuras;

public class Cuadrilatero extends Figura2D {

	private double lado;

	public Cuadrilatero(double lado) {
		this.lado = lado;
		super.numeroLados = 4;
	}
	
	@Override
	public double calcularArea() {
		return this.lado * this.lado;
	}
	
	@Override
	public double calcularPerimetro() {
		return 4 * this.lado;
	}

	public double getLado() {
		return lado;
	}
}
