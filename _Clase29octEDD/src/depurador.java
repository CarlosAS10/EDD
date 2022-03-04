import java.util.Scanner;

public class depurador {

	public static void main(String[] args) {
		
		Scanner teclado= new Scanner(System.in);
		int num1;
		
		for(int i=0; i<5; i++) {
			System.out.print("Introduce un número: ");
			num1= teclado.nextInt();
			System.out.println("El número introducido es "+ num1);
			
		}
		
		teclado.close();
		
	}

}
