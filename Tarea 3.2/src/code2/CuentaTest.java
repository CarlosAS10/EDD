package code2;

import static org.junit.Assert.*;
import org.junit.*;

public class CuentaTest {

	static Cuenta c1 = new Cuenta("Pepe", "123", 1000);
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("beforeClass()");
		
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("afterClass()");
	}
	
	@Before
	public void before() {
		System.out.print("before()");
	}
	
	@After
	public void after() {
		System.out.print("after()");
	}
	
	@SuppressWarnings("deprecation")
	@Test(expected = java.lang.AssertionError.class)
	public void ingresarTest() throws Exception {
		double saldo = c1.estado();
		double cantidad = 100;
		double esperado = saldo + cantidad;
		c1.ingresar(cantidad);
		assertEquals(esperado, c1.estado());
	}
	
	@SuppressWarnings("deprecation")
	@Test(expected = java.lang.AssertionError.class)
	public void retirarTest() throws Exception {
		double saldo = c1.estado();
		double cantidad = 120;
		double esperado = saldo - cantidad;
		c1.retirar(cantidad);
		assertEquals(esperado, c1.estado());
	}
}










