package test.figuras;

public abstract class Figura2D extends FiguraGeometrica{
	
	protected int numeroLados;
	
	public abstract double calcularArea();
	
	public abstract double calcularPerimetro();
	
	@Override
	public void imprimirInformacion() {
		System.out.println("Imprimiendo Figura en 2D de " + this.numeroLados + " lados...");
	}

}
