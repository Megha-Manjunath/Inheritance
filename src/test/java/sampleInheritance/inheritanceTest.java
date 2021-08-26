package sampleInheritance;

import static org.junit.Assert.*;

import org.junit.Test;

public class inheritanceTest {

	@Test
	public void test() {
		Asset asset = new Agriculture(5,69.6,95.3,"Agriculture");
		asset.display();
		Asset com = new Commercial(8,56.8,33.3,"Commercial");
		com.display();
		Asset home = new Home(5,69.6,95.3,"Home");
		home.display();
		
		assertEquals("Agriculture",asset.getType());
		assertNotEquals(null,asset.getType());
		assertEquals("Commercial",com.getType());
		assertNotEquals(null,com.getType());

		assertEquals("Home",home.getType());
		assertNotEquals(null,home.getType());
		
	


		

		
	}

}
