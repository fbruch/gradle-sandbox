import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;

public class EchoServiceTest{

	private EchoService service;
	
	@Before
	public void setUp() {
		service = new EchoService();	
	}
	
	@Test
	public void testEcho() {
		String arg = "test";
		assertEquals(service.echo(arg), arg);
	}
}
