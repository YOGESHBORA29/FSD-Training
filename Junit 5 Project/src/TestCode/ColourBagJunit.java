package TestCode;
//The @BeforeEach annotation denotes that the annotated method should be executed before each @Test, @RepeatedTest, @ParameterizedTest, and @TestFactory methods in the current class. It is executed only once.
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class ColourBagJunit {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@Test
	void test() {
		fail("Not yet implemented");
	}

}
