package com.arena;

import java.util.Random;

public class Match {
    
    private Player attacker;
    private Player defender;
    private Random random;
    
    public Match(Player player1, Player player2) {
        this.attacker = player1.getHealth() < player2.getHealth() ? player1 : player2;
        this.defender = player1.getHealth() < player2.getHealth() ? player2 : player1;
        this.random = new Random();
    }
    
    public void fight() {
        int round = 1;
        while (attacker.getHealth() > 0 && defender.getHealth() > 0) {
            int attackRoll = random.nextInt(6) + 1;
            int defendRoll = random.nextInt(6) + 1;

            int attackDamage = attackRoll * attacker.getAttack();
            int defendDamage = defendRoll * defender.getStrength();
            int netDamage = Math.max(0, attackDamage - defendDamage);
            
            defender.setHealth(defender.getHealth() - netDamage);

            System.out.println("Round " + round + ":");
            System.out.println("Player " + attacker + " is attacking Player " + defender);
            System.out.println("Attack Roll: " + attackRoll + ", Defend Roll: " + defendRoll);
            System.out.println("Attack Damage: " + attackDamage + ", Defend Damage: " + defendDamage);
            System.out.println("Net Damage: " + netDamage);
            System.out.println("Player " + defender + " health after round: " + defender.getHealth());
            System.out.println();

            Player temp = attacker;
            attacker = defender;
            defender = temp;
            round++;
        }
        System.out.println("End of the match.");
    }
}
