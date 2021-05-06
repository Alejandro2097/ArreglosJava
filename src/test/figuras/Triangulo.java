package test.figuras;

public class Triangulo extends Figura2D {

	private double base;
	private double altura;
	
	public Triangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
		super.numeroLados = 3;
	}

	@Override
	public double calcularArea() {
		return this.base * this.altura / 2;
	}

	public double getBase() {
		return base;
	}
	
	@Override
	public double calcularPerimetro() {
		return 3 * base;
	}

	public double getAltura() {
		return altura;
	}
}
