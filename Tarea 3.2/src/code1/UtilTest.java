package code1;

import static org.junit.Assert.*;
import org.junit.*;

public class UtilTest {

	@BeforeClass
	public static void beforeClass() {
		System.out.println("beforeClass()\n");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("afterClass()");
	}
	
	@Before
	public void before() {
		System.out.println("before()");
	}
	
	@After
	public void after() {
		System.out.println("after()\n ");
	}
	
	@Test
	public void factorialTest() {
		System.out.println("factorial()");
		int resultado = Util.factorial(0);
		int esperado = 1;
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void multiplicarTest() {
		System.out.println("multiplicar()");
		int resultado = Util.multiplicar(5, 2);
		int esperado = 10;
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void parTest() {
		System.out.println("par()");
		int resultado = Util.par(5);
		int esperado = 0;
		assertEquals(esperado, resultado);
	}
}
