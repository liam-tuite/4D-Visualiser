package shapes3D;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
	TestCube.class,
	TestDodecahedron.class,
	TestIcosahedron.class,
	TestOctahedron.class,
	TestTetrahedron.class
})

public class Shapes3DTest{

}