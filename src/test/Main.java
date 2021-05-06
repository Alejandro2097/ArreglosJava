package test;

import java.io.IOException;

import test.empleados.ComisionistaDTO;
import test.empleados.EmpleadoDTO;
import test.empleados.IMandar;
import test.empleados.JefeDTO;
import test.figuras.Circulo;
import test.figuras.Cuadrilatero;
import test.figuras.Figura2D;
import test.figuras.FiguraGeometrica;
import test.figuras.Triangulo;
import test.figuras2.Circulo2;
import test.figuras2.Cuadrilatero2;
import test.figuras2.ICalcularArea;
import test.figuras2.ICalcularPerimetro;
import test.figuras2.Triangulo2;
import test.process.CalculosMatematicos;

public class Main {

	public static void main(String[] args) throws IOException {
		/*Persona persona = new Persona("Viviana", "Ramirez");
		persona.setEdad(25);
		persona.setEsEmpleado(true);
		persona.setNombre(null);
		
		System.out.println("Persona " + persona);
		
		System.out.println("Persona: nombre: " + persona.getNombre() + " - apellido: " + persona.getApellido() 
			+ " edad: " + persona.getEdad() + " es empleado: " + persona.isEsEmpleado());*/
		
		
		
		//CalculosMatematicos calculos = new CalculosMatematicos();
	
		/*int num1 = 5;
		int num2 = 2;*/
		
		/*int num1 = 5, num2 = 2;
		
		System.out.println("Sumar: " + calculos.sumar(num1, num2));
		System.out.println("Restar: " + calculos.restar(num1, num2));
		System.out.println("Multiplicar: " + calculos.multiplicar(num1, num2));
		System.out.println("Dividir: " + calculos.division(num1, num2));
		System.out.println("Residuo: " + calculos.residuo(num1, num2));
		
		System.out.println("Area del circulo: " + calculos.getArea(45.3));
		
		double longitudCircunferencia = 2 * calculos.PHI * 45.3;
		System.out.println("Longitud de circunferencia del circulo: " + longitudCircunferencia);*/
		
		/*Circulo circulo = new Circulo(2.45);
		double area = circulo.calcularArea();
		double perimetro = circulo.calcularPerimetro();
		circulo.imprimirInformacion();
		
		System.out.println("Area del circulo de radio " + circulo.getRadio() + " es: " + area);
		System.out.println("Perimetro del circulo de radio " + circulo.getRadio() + " es: " + perimetro);
		
		Cuadrilatero cuadrado = new Cuadrilatero(4);
		double areaCuadrado = cuadrado.calcularArea();
		double perimetroCuadrado = cuadrado.calcularPerimetro();
		cuadrado.imprimirInformacion();
		
		System.out.println("Area del cuadrado de radio " + cuadrado.getLado() + " es: " + areaCuadrado);
		System.out.println("Perimetro del cuadrado de radio " + cuadrado.getLado() + " es: " + perimetroCuadrado);*/
		
		
		/*Figura2D figura = new Circulo(4.5);
		
		System.out.println("Area de la figura de radio " + ((Circulo)figura).getRadio() + " es: " + figura.calcularArea());
		System.out.println("Perimetro del figura es: " + figura.calcularPerimetro());
		figura.imprimirInformacion();*/
		
		/*figura = null;
		figura = new Triangulo(4, 5);
		
		System.out.println("Area de la figura de base " + ((Triangulo)figura).getBase() + " es: " + figura.calcularArea());
		System.out.println("Perimetro del figura es: " + figura.calcularPerimetro());
		
		figura = null;
		figura = new Cuadrilatero(5);
		
		System.out.println("Area de la figura de lado " + ((Cuadrilatero)figura).getLado() + " es: " + figura.calcularArea());
		System.out.println("Perimetro del figura es: " + figura.calcularPerimetro());*/
		
		
		//int valor = 3 + 4 * 2 - 7 * 20 / 2;//70
		//3 + 8 - 7 * 20 / 2
		//3 + 8 - 140 / 2
		//3 + 8 - 70
		//11 - 70
		//-59
		
		/*int valor1 = (((3 + 4) * 2) - 7) * 20 / 2;//70
		
		System.out.println("Valor calculado: " + valor1);*/
		
		/*Circulo2 circulo = new Circulo2(2.45);
		double area = circulo.calcularArea();
		double perimetro = circulo.calcularPerimetro();
		circulo.imprimirInformacion();
		
		System.out.println("Area del circulo de radio " + circulo.getRadio() + " es: " + area);
		System.out.println("Perimetro del circulo de radio " + circulo.getRadio() + " es: " + perimetro);
		
		Cuadrilatero2 cuadrado = new Cuadrilatero2(4);
		double areaCuadrado = cuadrado.calcularArea();
		double perimetroCuadrado = cuadrado.calcularPerimetro();
		cuadrado.imprimirInformacion();
		
		System.out.println("Area del cuadrado de radio " + cuadrado.getLado() + " es: " + areaCuadrado);
		System.out.println("Perimetro del cuadrado de radio " + cuadrado.getLado() + " es: " + perimetroCuadrado);
		
		Triangulo2 triangulo = new Triangulo2(2.3,  5);
		double areaTriangulo = triangulo.calcularArea();
		double perimetroTriangulo = triangulo.calcularPerimetro();
		
		System.out.println("Area del triangulo es: " + areaTriangulo);
		System.out.println("Perimetro del triangulo es: " + perimetroTriangulo);
		
		ICalcularArea calcularArea = new Circulo2(3.4);
		System.out.println("Area del circulo es: " + calcularArea.calcularArea());
		
		calcularArea = null;
		calcularArea = new Cuadrilatero2(4.5);
		System.out.println("Area del cuadrado es: " + calcularArea.calcularArea());
		
		ICalcularPerimetro calcularPerimetro = new Triangulo2(2.3,  4);
		System.out.println("Perimetro del triangulo es: " + calcularPerimetro.calcularPerimetro());
		
		calcularPerimetro = null;
		calcularPerimetro = new Circulo2(4.8);
		System.out.println("Perimetro del circulo es: " + calcularPerimetro.calcularPerimetro());*/
		
		
		/*EmpleadoDTO empleadoDTO = new EmpleadoDTO("Alejandro", "Martinez", "M", 1000.0);
		System.out.println("Salario mensual del empleado " + empleadoDTO.getNombreCompleto() + ": " + empleadoDTO.getPagoMensual());
		
		
		JefeDTO jefeDTO = new JefeDTO("Camilo", "Acevedo", "M", 1520.45, "Nomina", 25);
		System.out.println("Salario mensual del empleado " + jefeDTO.getNombreCompleto() + ": " + jefeDTO.getPagoMensual());
		jefeDTO.mandar();
		
		ComisionistaDTO comisionistaDTO = new ComisionistaDTO("Dario", "Guzman", "M", 2500, 50000, 3.5);
		System.out.println("Salario mensual del empleado " + comisionistaDTO.getNombreCompleto() + ": " + comisionistaDTO.getPagoMensual());*/
		
		
		/*EmpleadoDTO empleadoDTO = new EmpleadoDTO("Alejandro", "Martinez", "M", 1000.0);
		System.out.println("Salario mensual del empleado " + empleadoDTO.getNombreCompleto() + ": " + empleadoDTO.getPagoMensual());
		
		empleadoDTO = null;
		empleadoDTO = new JefeDTO("Camilo", "Acevedo", "M", 1520.45, "Nomina", 25);
		System.out.println("Salario mensual del empleado " + empleadoDTO.getNombreCompleto() + ": " + empleadoDTO.getPagoMensual());
		
		empleadoDTO = null;
		empleadoDTO = new ComisionistaDTO("Dario", "Guzman", "M", 2500, 50000, 3.5);
		System.out.println("Salario mensual del empleado " + empleadoDTO.getNombreCompleto() + ": " + empleadoDTO.getPagoMensual());*/
		
		/*IMandar m = new JefeDTO();
		m.mandar();*/
		
		//AND  -> && &
		//OR   -> || |
		//NOT  -> !
		
		//String cadena = "algo";
		
		System.out.println("Ingrese un numero: ");
		int opcion = System.in.read();
		
		char opcionChar = (char)opcion;
		
		System.out.println("Opcion selecciAonada: " + opcion);
		System.out.println("Opcion seleccionada char: " + opcionChar);
		
		/*if(opcion % 2 == 0) {
			System.out.println("La opcion ingresada es par");
		}else {
			System.out.println("La opcion ingresada es impar");
		}*/
		
		
		/*if(opcionChar == 'A') {
			System.out.println("La opcion es vocal");
		}else if(opcionChar == 'E') {
			System.out.println("La opcion es vocal");
		}else if(opcionChar == 'I') {
			System.out.println("La opcion es vocal");
		}else {
			System.out.println("La opcion no es vocal");
		}*/
		
		/*if(opcionChar == 'A' || opcionChar == 'E' || opcionChar == 'I' || opcionChar == 'O' || opcionChar == 'U') {
			System.out.println("La opcion es vocal");
		}else {
			System.out.println("La opcion no es vocal");
		}*/
		
		/*switch (opcionChar) {
			case 'A':
				System.out.println("La opcion es vocal");
				break;
				
			case 'E':
				System.out.println("La opcion es vocal");
				break;
				
			case 'I':
				System.out.println("La opcion es vocal");
				break;
	
			default:
				System.out.println("La opcion no es vocal");
				break;
		}*/
		
		/*switch (opcionChar) {
			case 'A': case 'E': case 'I': case 'O': case 'U':
				System.out.println("La opcion es vocal");
				break;
	
			default:
				System.out.println("La opcion no es vocal");
				break;
		}*/
		
		/*switch (opcion) {
			case 65: case 69: case 73:
				System.out.println("La opcion es vocal");
				break;
	
			default:
				System.out.println("La opcion no es vocal");
				break;
		}*/
	
		/*switch (cadena) {
			case "algo":S
				System.out.println("SI");
				break;

			default:
				System.out.println("NO");
				break;
		}*/
		
		
		
		int numero = 10;
		int contador = 0;
		
		/*while(contador <= numero) {
			System.out.println("Va en el numero: " + contador);
			System.out.println("De : " + numero);
			
			//contador = contador + 1;
			//contador += 1;
			contador++;
			//++contador;
		}*/
		
		/*do {
			System.out.println("Va en el numero: " + contador);
			System.out.println("De : " + numero);
			
			contador++;
		}while(contador <= numero);*/
		
		/*for(int i = 0; i <= numero; i++) {
			System.out.println("Va en el numero: " + i);
			System.out.println("De : " + numero);
		}*/
		
		/*for(int i = 10; i >= numero; i--) {
			System.out.println("Va en el numero: " + i);
			System.out.println("De : " + numero);
		}*/
	
		/*for(int i = 0; i <= numero; i++) {
			System.out.println("Va en el numero: " + i);
			//System.out.println("De : " + numero);
			
			if(i > numero/2) {
				break;
			}
		}*/
		
		/*for(int i = 0; i <= numero; i++) {
			if(i % 2 == 0) {
				System.out.println("Va en el numero: " + i);
			}else {
				continue;
			}
		}*/
		
		for(int i = 0; i <= numero; i++) {
			if(i % 2 != 0) {
				continue;
			}

			System.out.println("Va en el numero: " + i);
		}
	}

}
