package test.figuras;

import test.process.CalculosMatematicos;

public class Circulo extends Figura2D {

	//Constantes
	//Atributos
	//Constructores
	//Metodos publicos
	//Metodo privados o utilitarios
	//Metodos set y get
	
	private double radio;
	
	public Circulo(double radio) {
		this.radio = radio;
		super.numeroLados = 0;
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
