import junit.framework.TestCase;
import static org.junit.Assert.*;

public class CalculatorTest extends TestCase{
	
	//testing an add method
	
	Calculator ca;
	
	void setup() {
		ca=new Calculator();
	}
	
	public void testAdd() {
		int result = ca.add(10, 10);
		assertEquals(20,result);
		
	}
	
	public void testSub() {
		int result = ca.sub(8,4);
		assertEquals(4,result);
		
	}
	
	public void testMulti() {
		int result = ca.multi(12, 5);
		assertEquals(60,result);
		
	}
	public void testDiv() {
		int result = ca.div(100, 10);
		assertEquals(10,result);
		
	}
	
	

}
