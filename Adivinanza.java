package estructurasrepetitivas;
import java.util.*;
public class Adivinanza {

	public static void main(String[] args) {
	    // Generar un numero aleatorio entre 0 y 100
		//Pedirle al usuario que adivine el numero
		//Solo se le va a permitir 3 intentos
		Scanner lector = new Scanner(System.in);
		
		long num = Math.round(Math.random() * 10); //random genera un double, roun genera un long6
	    System.out.println("Adivine el numero entre 0 y 10(Tiene 3 intentos):");
	    int resp = lector.nextInt();
	   
	    int contador=0;
	    
	    while(num != resp) {
	    System.out.println("Lo siento vuelva a intentarlo.");
	    System.out.println("Adivine el numero entre 0 y 10");
	    resp = lector.nextInt();
	    contador++;
	    
	    	
	    	
	    if (contador==3) {
	    	if (num == resp) {
	    		System.out.println("Ha agotado sus intentos: " + contador);
	    		System.exit(contador);
	    	//System.out.println("Felicidades, adivinaste el numero es: " + num);	
	    	//break;
	    	
	    	}
	    }
	   //System.out.println("ha agotado todos los intentos permitidos: " + contador);
	    //break;
	}
	   System.out.println("Fin del juego!");
	   System.out.println("Felicidades, adivinaste, el numero es: " + num);
	    //System.out.println("------------Fin del juego-------------");
}
}
