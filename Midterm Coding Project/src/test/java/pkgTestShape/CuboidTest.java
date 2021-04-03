package pkgTestShape;

import org.junit.Test;

import com.sun.jdi.connect.spi.Connection;

import pkgShape.Cuboid;

public class CuboidTest {
	   @SuppressWarnings("unused")
	@Test
	public void CuboidTest1() {
		    try {
		    	   Cuboid c1 = new Cuboid(1,2,3);
		    }
		    catch (Exception e) {
		    	      fail("Not a Cuboid");
		    }
	}

	 @test 
	 public void getiDepthtest1() {
		     int iDepth;
		     try {
		    	    Cuboid c2 = new Cuboid(4,5,6);
		    	    iDepth = c2.getiDepth();
		     }
		     catch(Expectation e)  {
		    	     fail("Invalid depth");
		     }
	 }
}
