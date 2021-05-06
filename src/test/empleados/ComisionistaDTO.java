package test.empleados;

public class ComisionistaDTO extends EmpleadoDTO {
	
	private double ventaMensual;
	private double comision;
	
	public ComisionistaDTO() {
		super();
	}

	public ComisionistaDTO(String nombre, String apellido, String genero, double salario,
			double ventaMensual, double comision) {
		super(nombre, apellido, genero, salario);
		
		this.comision = comision;
		this.ventaMensual = ventaMensual;
	}

	@Override
	public double getPagoMensual() {
		return super.getSalario() + (this.ventaMensual * (this.comision / 100));
	}

	public double getVentaMensual() {
		return ventaMensual;
	}

	public void setVentaMensual(double ventaMensual) {
		this.ventaMensual = ventaMensual;
	}

	public double getComision() {
		return comision;
	}

	public void setComision(double comision) {
		this.comision = comision;
	}
}
