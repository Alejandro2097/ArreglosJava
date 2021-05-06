package test.empleados;

public class EmpleadoDTO {

	protected String nombre;
	protected String apellido;
	protected String genero;
	protected double salario;
	
	public EmpleadoDTO() {
	}

	public EmpleadoDTO(String nombre, String apellido, String genero, double salario) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.genero = genero;
		this.salario = salario;
	}
	
	public EmpleadoDTO(String nombre, String apellido) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	public String getNombreCompleto() {
		return this.nombre + " " + this.apellido;
	}
	
	public double getPagoMensual() {
		return this.salario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
}
