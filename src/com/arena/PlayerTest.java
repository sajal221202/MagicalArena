package com.arena;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

//this class gives the unit test case for the playerclass creation
class PlayerTest {

	//test case for playercreation
	 @Test
	    public void testPlayerCreation() {
		 
	        Player player = new Player(100, 10, 5);
	        
	        assertEquals(100, player.getHealth());
	        assertEquals(10, player.getStrength());
	        assertEquals(5, player.getAttack());
	        
	    }
}
