package code2;

public class Cuenta {
	
	//Propiedades de la clase Cuenta
	private String nombre;
	private String cuenta;
	private double saldo;
	
	//Constructor default
	public Cuenta() {
		
	}
	//Constructor con parámettros para iniciar todas las propiedades de la clase
	public Cuenta(String nom, String cue, double sal) {
		nombre = nom; cuenta = cue; saldo = sal;
	}
	
	//Método para asignar el nombre del titular de la cuenta
	public void asignarNombre(String nom) {
		nombre = nom;
	}
	//Método que devuelve el nombre del titular
	public String obtenerNombre() {
		return nombre;
	}
	//Método que devuelve el saldo disponible en cada momento
	public double estado() {
		return saldo;
	}
	//Método para ingresar cantidades en la cuenta. Modifica el saldo. Este meétodo va a ser probado con JUnit
	public void ingresar(double cantidad) throws Exception {
		if(cantidad < 0) 
			throw new Exception("no se puede ingresar una cantidad negativa");
		saldo += cantidad;
	}
	//Método para retirrar las cantidades de la cuenta. Modifica el saldo. Este método va a ser probado con JUnit
	public void retirar(double cantidad) throws Exception {
		if(cantidad <= 0) 
			throw new Exception("No se puede retirar una cantidad negativa");
		if(estado() < cantidad) 
			throw new Exception("no hay suficiente saldo");
		saldo -= cantidad;
	}
	//Método que me devuelve el número de cuenta
	public String obtenerCuenta() {
		return cuenta;
	}	
}