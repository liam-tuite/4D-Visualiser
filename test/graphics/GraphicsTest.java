package graphics;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
	TestConstants.class,
	TestMatrices.class,
	TestMatrix.class,
	TestVector.class,
	TestVertex.class
})

public class GraphicsTest {

}