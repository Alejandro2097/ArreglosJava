package test;

import java.util.Scanner;

public class MainArray {

	public static void main(String[] args) {
		/*int[] numeros1;
		numeros1 = new int[6];
		
		for(int i = 0; i < numeros1.length; i++) {
			numeros1[i] = i;
		}
		
		System.out.println("Numeros: ");
		
		int contador = 0;
		while(contador < numeros1.length) {
			System.out.print(numeros1[contador] + " ");
			contador++;
		}*/
		
		
		/*int[] numeros2 = new int[7];
		
		for(int i = 0; i < numeros2.length; i++) {
			numeros2[i] = i;
		}
		
		System.out.println("Numeros: ");
		
		int contador = 0;
		
		do {
			System.out.print(numeros2[contador] + " ");
			contador++;
		}while(contador < numeros2.length);*/
		
		/*int[] numeros3 = new int[] {3, 5, 7, 3, 2};
		
		System.out.println("Numeros: ");
		
		for(int i = 0; i < numeros3.length; i++) {
			System.out.print(numeros3[i] + " ");
		}
		
		System.out.println();
		System.out.println("Numeros 2: ");
		
		for(int dato : numeros3) {
			System.out.print(dato + " ");
		}*/
		
		MainArray main = new MainArray();
		
		Scanner scanner = new Scanner(System.in);
		
		int[] numeros = main.solicitarInformacion(scanner);
		
		if(numeros != null) {
			System.out.println("Ingrese el numero a busca: ");
			
			int numeroBuscar = scanner.nextInt();
			
			System.out.println("Numero a buscar: " + numeroBuscar);
			
			//main.modificarValores(numeroBuscar, numeros);			
			
			boolean esta = main.buscarNumero(numeroBuscar, numeros);
			
			/*if(esta) {
				System.out.println("El numero esta en el arreglo");
			}else {
				System.out.println("El numero no esta en el arreglo");
			}*/
			
			//(condicion ? es verdadera : es falsa)
			System.out.println((esta ? "El numero esta en el arreglo" : "El numero no esta en el arreglo"));
		}
		
		scanner.close();
	}
	
	public int[] solicitarInformacion(Scanner scanner) {
		System.out.println("Ingrese cuantos elementos tiene el arreglo: ");
		
		int tamano = scanner.nextInt();
		
		if(tamano >= 1) {
			System.out.println("El tamaño ingresado fue: " + tamano);
			
			int[] numeros = new int[tamano];
			
			for(int i = 0; i < numeros.length; i++) {
				System.out.println("Ingrese el elemento " + (i + 1) + ": ");
				int numero = scanner.nextInt();
				numeros[i] = numero;
			}
			
			System.out.println("Arreglo ingresado: ");
			
			for(int dato : numeros) {
				System.out.print(dato + " ");
			}
								
			return numeros;
		}else {
			System.err.println("El tamaño debe ser superior a 0");
						
			return null;
		}	
	}
	
	public boolean buscarNumero(int numeroBuscar, int[] numeros) {
		for(int i=0; i < numeros.length; i++) {
			if(numeroBuscar == numeros[i]) {
				return true;
			}
		}
		
		return false;
	}
	
	/*public void modificarValores(int numeroBuscar, int[] numeros) {
		numeroBuscar = 25;
		numeros[0] = 0;
		numeros[numeros.length - 1] = 0;
	}*/

}
