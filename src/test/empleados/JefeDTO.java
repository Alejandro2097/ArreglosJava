package test.empleados;

public class JefeDTO extends EmpleadoDTO implements IMandar{

	private String area;
	private int numeroEmpleadosCargo;
	
	public JefeDTO() {
		super();
	}

	public JefeDTO(String nombre, String apellido, String genero, double salario, 
			String area, int numeroEmpleadosCargo) {
		super(nombre, apellido, genero, salario);
		
		this.area = area;
		this.numeroEmpleadosCargo = numeroEmpleadosCargo;
	}

	@Override
	public double getPagoMensual() {
		return super.salario + (100 * this.numeroEmpleadosCargo);
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public int getNumeroEmpleadosCargo() {
		return numeroEmpleadosCargo;
	}

	public void setNumeroEmpleadosCargo(int numeroEmpleadosCargo) {
		this.numeroEmpleadosCargo = numeroEmpleadosCargo;
	}

	@Override
	public void mandar() {
		System.out.println("El jefe esta mandando");
	}
}
