package test.figuras2;

public class Cuadrilatero2 extends FiguraGeometrica2 {

	private double lado;

	public Cuadrilatero2(double lado) {
		this.lado = lado;
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
