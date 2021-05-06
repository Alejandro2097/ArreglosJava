package test.modelo;

public class Persona {
	
	private String nombre;
	private String apellido;
	private char genero;
	private int edad;
	private boolean esEmpleado;
	private float salario;
	
	public Persona() {
		this.nombre = "";
		this.apellido = "";
		this.genero = 'M';
		this.edad = 0;
		this.esEmpleado = false;
		this.salario = 0;
	}
	
	public Persona(String nombre, String apellido) {
		this();
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	public Persona(String nombre, String apellido, char genero, int edad, boolean esEmpleado, float salario) {
		this(nombre, apellido);
		//this.nombre = nombre;
		//this.apellido = apellido;
		this.genero = genero;
		this.edad = edad;
		this.esEmpleado = esEmpleado;
		this.salario = salario;
	}
	
	public void setNombre(String nombre) {
		if(nombre != null) {
			this.nombre = nombre;
		}
	}
	
	public String getNombre() {
		return this.nombre + " " + this.apellido;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public boolean isEsEmpleado() {
		return esEmpleado;
	}

	public void setEsEmpleado(boolean esEmpleado) {
		this.esEmpleado = esEmpleado;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}
}
