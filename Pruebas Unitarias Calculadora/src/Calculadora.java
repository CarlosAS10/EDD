public class Calculadora {
//Eyey
	private int ans;
	
	public Calculadora() {
		ans = 0;
	}
	
	public int add(int a, int b) {
		ans = a + b;
		return ans;
	}
	
	public int sub(int a, int b) {
		ans = a - b;
		return ans;
	}
	
	public int div(int a, int b) {
		if(b == 0) {
			throw new ArithmeticException("No puedes dividir por 0");
		}
		ans = a / b;
		return ans;
	}
	
	public int add(int v) {
		ans += v;
		return ans;
	}
	
	public int sub(int v) {
		ans -= v;
		return ans;
	}
	
	public int ans() {
		return ans;
	}
	
	public void ac() {
		ans = 0;
	}
	
	public void optima() {
		try {
			Thread.sleep(2000);
		} catch(InterruptedException e) {
			
		}
	}
}
