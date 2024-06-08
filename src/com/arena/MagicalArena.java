package com.arena;

public class MagicalArena {
    
    public static void main(String[] args) {
        
        Player playerA = new Player(50, 5, 10);
        Player playerB = new Player(100, 10, 5);

        Match match = new Match(playerA, playerB);
        match.fight();

        String winner = getMatchResult(playerA, playerB);
        System.out.println("Winner: " + winner);
    }

    public static String getMatchResult(Player playerA, Player playerB) {
        if (playerA.getHealth() <= 0) {
            return "Player B wins!";
        } else {
            return "Player A wins!";
        }
    }
}
