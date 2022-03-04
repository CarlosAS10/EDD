import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(value = Parameterized.class)
public class ParametroTest {

	public static Iterable<Object[]> getData() {
		return null;
	}
	
	private int a, b, exp;
	
	public ParametroTest(int a, int b, int exp) {
		this.a = a; this.b = b; this.exp = exp;
	}
	
	@Test
	public void testAdd() {
		Calculadora calc = new Calculadora();
		int result = calc.add(a, b);
		assertEquals(exp, result);
	}

}
