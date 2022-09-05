package estructurasrepetitivas;
import java.util.*;
public class EstructutraWhile {

	public static void main(String[] args) {
		//Estructure  repetitiva preprueba
		//Estructura while
		Scanner lector = new Scanner(System.in);
		System.out.print("Ingrese su edad:");
		int edad = lector.nextInt();
		//int contador=0;
		
		while (edad < 0) {
			System.out.print("Edad incorrecta!-\t");
			System.out.print("Ingrese su edad: ");
			edad = lector.nextInt();
			
		}
		System.out.println("Fin del programa");
	}

}
