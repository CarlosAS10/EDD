package code1;

public class Util {
	
	//Retorna el factorial de un n�mero por par�metro
	public static int factorial(int numero) {
		if(numero == 0) 
			return 1;
			else 
				return numero * factorial(numero - 1); 
	}
	//Retorna el resultado de multiplicar los n�meros que le pasan por par�metro
	public static int multiplicar(int n1, int n2) {
		return n1 * n2;
	}
	//Retorna 1 si el n�ero introrucido por par�metro y un 0 si es impar
	public static int par(int num) {
		if(num % 2 == 0) 
			return 1;
				else 
					return 0;
	}
}
