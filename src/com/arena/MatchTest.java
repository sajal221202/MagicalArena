package com.arena;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

//This class gives the unit test case for the Match class
class MatchTest {

	//Unit test case for the fight method
	 @Test
	    public void fight() {
		 
	        // Create two players for the match
	        Player player1 = new Player(50, 5, 10);
	        Player player2 = new Player(100, 10, 5);

	        // Create a match between the two players
	        Match match = new Match(player1, player2);

	        // Simulate the match
	        match.fight();

	        // Verify the outcome of the match
	        if (player1.getHealth() <= 0) {
	            // Player B should win if player A's health drops to 0 or below
	            assertEquals(true, player2.getHealth() > 0);
	        } else {
	            // Player A should win if player B's health drops to 0 or below
	            assertEquals(true, player1.getHealth() > 0);
	        }
	    }

}
