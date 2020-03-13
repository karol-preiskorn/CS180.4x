import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

/**
 * CS180.4x
 * PACKAGE_NAME
 * karol 2020-03-11
 **/


class ATest {
	final ByteArrayOutputStream out = new ByteArrayOutputStream();
	
	@org.junit.jupiter.api.Test
	void whoAmI() {
		System.setOut(new PrintStream(out));
		B b = new B();
		System.out.println(b.whoAmI());
		assertEquals("B\r\n", out.toString());
	}
	
	@org.junit.jupiter.api.Test
	void testToString() {
		B b = new B();
		assertEquals("Hello!", b.toString());
	}
}
