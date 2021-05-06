package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import test.exception.DivisionPorCeroException;

public class MainException {
	
	public static void main(String[] arg){
		MainException main = new MainException();
		
		//main.dividirPorCero();
		
		/*try {
			main.dividirPorCero2();
		} catch (DivisionPorCeroException e) {
			System.err.println("Error: " + e.getMessage());
			e.printStackTrace();
		}*/
		
		//main.abrirArchivo();
		//main.abrirArchivo2();
	}
	
	
	public void dividirPorCero() {
		try {
			int a = 5, b = 0;
			int res = a / b;
			System.out.println("La división es: " + res);
		} catch (ArithmeticException e) {
			System.err.println("No se puede realizar el procesamiento debido a que esta dividiendo por cero");
			
			throw e;
		}
	}
	
	public void dividirPorCero2() throws DivisionPorCeroException {
		try {
			int a = 5, b = 0;
			int res = a / b;
			System.out.println("La división es: " + res);
		} catch (ArithmeticException e) {
			System.err.println("No se puede realizar el procesamiento debido a que esta dividiendo por cero");
			System.err.println("Mensaje de la excepcion: " + e.getMessage());
			e.printStackTrace();
			
			DivisionPorCeroException ex = new DivisionPorCeroException("Se intento dividir por cero", e);
			
			throw ex;
		}finally {
			System.out.println("Ejecutando bloque finally");
		}
	}	
	
	public void abrirArchivo() {
		String pathFile = "MiArchivo.txt";
		
		try {
			File file = new File(pathFile);
			System.out.println("Existe: " + file.exists());
			
			//throw new Exception("Mi Exception");
			
			FileInputStream fis = new FileInputStream(file);
		}catch (NullPointerException e) {
			System.err.println("Ruta nula");
		}catch (FileNotFoundException e) {
			System.err.println("Archivo no existe");
		}catch (IOException e) {
			System.err.println(e.getMessage());
		}catch (Exception e) {
			System.err.println("Excepcion general: " + e.getMessage());
		}
	}
	
	public void abrirArchivo2() {
		String pathFile = "MiArchivo.txt";
		
		try {
			File file = new File(pathFile);
			System.out.println("Existe: " + file.exists());
			
			//throw new Exception("Mi Exception");
			
			FileInputStream fis = new FileInputStream(file);
		}catch (NullPointerException | FileNotFoundException e) {
			System.err.println("Ruta nula o archivo no existe");
		}catch (IOException e) {
			System.err.println(e.getMessage());
		}catch (Exception e) {
			System.err.println("Excepcion general: " + e.getMessage());
		}
	}
	
}
