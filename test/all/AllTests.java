package all;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import graphics.GraphicsTest;
import shapes3D.Shapes3DTest;
import shapes4D.Shapes4DTest;

@RunWith(Suite.class)
@SuiteClasses({
	GraphicsTest.class,
	Shapes3DTest.class,
	Shapes4DTest.class
})

public class AllTests{

}
