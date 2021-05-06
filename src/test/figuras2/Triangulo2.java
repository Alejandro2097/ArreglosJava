package test.figuras2;

public class Triangulo2 extends FiguraGeometrica2{

	private double base;
	private double altura;
	
	public Triangulo2(double base, double altura) {
		this.base = base;
		this.altura = altura;		
	}
	
	@Override
	public double calcularArea() {
		return this.base * this.altura / 2;
	}
	
	@Override
	public double calcularPerimetro() {
		return 3 * base;
	}

	public double getBase() {
		return base;
	}

	public double getAltura() {
		return altura;
	}
}
