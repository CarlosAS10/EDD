import java.util.Scanner;

public class depuracion {

 public static void main(String[] args) {
   
    Scanner teclado = new Scanner(System.in);
	int numeroLeido;
	
	for (int i=0;i<5;i++){
	
	   System.out.println("Introduce un número");
	   numeroLeido = teclado.nextInt();
	   
	   if(esPar(numeroLeido)){
		   System.out.println("El número leido es par: "+numeroLeido);
	   }
	   else {
		   System.out.println("El número leido es impar: "+numeroLeido);
	   }	   
	}
	
	System.out.println("El programa ha terminado");
	
	teclado.close();
}


static boolean esPar(int numero) {
  System.out.println("Voy a evaluar el número...");
  if (numero%2==0) {
     return true;
	}
   return false;
 }
}