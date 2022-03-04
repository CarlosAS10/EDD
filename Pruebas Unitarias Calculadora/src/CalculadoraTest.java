import static org.junit.Assert.*;
import org.junit.*;

public class CalculadoraTest {
	
	static Calculadora calc;
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("beforeClass()");
		calc = new Calculadora();
	}
	
	@Before
	public void before() {
		System.out.println("before()");
		calc = new Calculadora();
	}
	
	@After
	public void after() {
		System.out.println("after()");
		calc.ac();
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("afterClass()");
	}
	
	@Test
	public void testSum() {
		System.out.println("sum()");
		int resul = calc.add(3, 2);
		int esper = 5;
		assertEquals(esper, resul);
	}
	
	@Test
	public void testAnsSum() {
		System.out.println("ansSum()");
		calc.add(3, 2);
		int resul = calc.ans();
		int esper = 5;
		assertEquals(esper, resul);
	}
}
