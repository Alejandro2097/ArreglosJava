package test.figuras2;

import test.process.CalculosMatematicos;

public class Circulo2 extends FiguraGeometrica2 {

	private double radio;
	
	public Circulo2(double radio) {
		this.radio = radio;
	}
	
	@Override
	public double calcularArea() {
		CalculosMatematicos calculos = new CalculosMatematicos();
		
		double area = calculos.PHI * this.radio * this.radio;
		
		return area;
	}

	@Override
	public double calcularPerimetro() {
		CalculosMatematicos calculos = new CalculosMatematicos();
		
		return 2 * calculos.PHI * this.radio;
	}
	
	@Override
	public void imprimirInformacion() {
		System.out.println("Imprimiendo circulo de radio " + this.radio);
	}

	public double getRadio() {
		return radio;
	}
}
