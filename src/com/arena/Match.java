package com.arena;

import java.util.Random;

public class Match {
    
    private Player attacker;
    private Player defender;
    private Random random;
    private int roundCount; // Field to track the number of rounds
    
    public Match(Player player1, Player player2) {
        this.attacker = player1.getHealth() < player2.getHealth() ? player1 : player2;
        this.defender = player1.getHealth() < player2.getHealth() ? player2 : player1;
        this.random = new Random();
        this.roundCount = 0; // Initialize round count
    }

    public int getRoundCount() {
        return roundCount;
    }
    
    public void fight() {
        while (attacker.getHealth() > 0 && defender.getHealth() > 0) {
            roundCount++; // Increment round count at the start of each round
            System.out.println("Round: " + roundCount);
            System.out.println("Attacker: " + attacker);

            // Attacker's dice roll and attack calculation
            int attackRoll = random.nextInt(6) + 1;
            int attackDamage = attackRoll * attacker.getAttack();
            System.out.println(attacker + ": Rolling dice; Got dice value of " + attackRoll);
            System.out.println(attacker + ": Attack Value: " + attackDamage);

            // Defender's dice roll and defend calculation
            int defendRoll = random.nextInt(6) + 1;
            int defendDamage = defendRoll * defender.getStrength();
            System.out.println(defender + ": Rolling dice; Got dice value of " + defendRoll);
            System.out.println(defender + ": Defend Value: " + defendDamage);

            // Net damage calculation and applying to defender
            int netDamage = Math.max(0, attackDamage - defendDamage);
            defender.setHealth(defender.getHealth() - netDamage);
            System.out.println(attacker + ": Damaging " + defender + " with: " + netDamage);
            System.out.println(defender + ": Remaining Health: " + defender.getHealth());
            System.out.println();

            // Switch roles for next turn
            Player temp = attacker;
            attacker = defender;
            defender = temp;
        }
        System.out.println("End of the match.");
    }
}
