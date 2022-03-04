package code2;

public class Cuenta {
	
	//Propiedades de la clase Cuenta
	private String nombre;
	private String cuenta;
	private double saldo;
	
	//Constructor default
	public Cuenta() {
		
	}
	//Constructor con par�mettros para iniciar todas las propiedades de la clase
	public Cuenta(String nom, String cue, double sal) {
		nombre = nom; cuenta = cue; saldo = sal;
	}
	
	//M�todo para asignar el nombre del titular de la cuenta
	public void asignarNombre(String nom) {
		nombre = nom;
	}
	//M�todo que devuelve el nombre del titular
	public String obtenerNombre() {
		return nombre;
	}
	//M�todo que devuelve el saldo disponible en cada momento
	public double estado() {
		return saldo;
	}
	//M�todo para ingresar cantidades en la cuenta. Modifica el saldo. Este me�todo va a ser probado con JUnit
	public void ingresar(double cantidad) throws Exception {
		if(cantidad < 0) 
			throw new Exception("no se puede ingresar una cantidad negativa");
		saldo += cantidad;
	}
	//M�todo para retirrar las cantidades de la cuenta. Modifica el saldo. Este m�todo va a ser probado con JUnit
	public void retirar(double cantidad) throws Exception {
		if(cantidad <= 0) 
			throw new Exception("No se puede retirar una cantidad negativa");
		if(estado() < cantidad) 
			throw new Exception("no hay suficiente saldo");
		saldo -= cantidad;
	}
	//M�todo que me devuelve el n�mero de cuenta
	public String obtenerCuenta() {
		return cuenta;
	}	
}