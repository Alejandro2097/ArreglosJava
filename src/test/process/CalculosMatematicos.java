package test.process;

public class CalculosMatematicos {
	
	public final double PHI = 3.1416;
	
	public int sumar(int num1, int num2) {
		int suma = num1 + num2; 
		
		return suma;
	}
	
	public int restar(int num1, int num2) {
		return num1 - num2;
	}
	
	public int multiplicar(int num1, int num2) {
		return num1 * num2;
	}
	
	public int division(int num1, int num2) {
		return num1 / num2;
	}
	
	public int residuo(int num1, int num2) {
		return num1 % num2;
	}
	
	public double getArea(double radio) {
		double area = this.PHI * radio * radio;
		
		return area;
	}
}
