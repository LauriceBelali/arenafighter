package se.lexicon.laurice.arena_fighter;

import java.util.Scanner;

public class Round {
	private int roundNumber;
	private String roundLog;
	private Battle battle;
	
	
	
	public void fight(Fighter p, Fighter o) {
		roundNumber++;
		battle = new Battle (p,o);
		System.out.println(p.getInfo() + "\n \t \tva \n" + o.getInfo());
		System.out.println("---- Battle Begin ---- Round: " + roundNumber + 1+ "----");
		
		
	
	
	while(battle.battle()) {
		if(isBiggest(p.getStrength(), o.getStrength())) {
			int damage = p.attack(6);
			o.takeDamage (damage);
			battle.appendLog(p.getName() + "Attack Opponent And Dose " + (damage) + "damage\n");
			System.out.println(p.getName() + "Attack Opponent And Dose" + (damage) + "damage\n");
			
		}else if(isBiggest(p.getStrength(), o.getStrength()) == false) {
			int damage =o.attack(6);
			p.takeDamage (damage);
			battle.appendLog("Oponenet Attacke" + p.getName() + "And Dose" + (damage) + "Damage\n");
			System.out.println("Oponenet Attacke" + p.getName() + "And Dose" + (damage) + "Damage\n");
			
		}else {
			battle.appendLog("Both" + p.getName() + "And Opponent Are Same Strength\n");
			o.setStrength(new RandomGen().GetRandom(6,10));
			fight(p,o);
		}
		
		p.setStrength(new RandomGen().GetRandom(6, 10));
		o.setStrength(new RandomGen().GetRandom(6, 10));
		
		if(p.isAlive() && !o.isAlive()) {
			appendLog("Player" + p.getName() + "Win In This Match: \n");
			System.out.println("Player" + p.getName() + "Win In This Match: \n");
			p.addToScore(5);
			System.out.println("Do You Need To Counitue Battle Y/N");
			Scanner input = new Scanner(System.in);
			if(input.nextLine().equals("n")) {
				System.out.println("----BattleLog----");
				System.out.println(battle.getBattleLog());
				System.out.println("----RoundLog----");
				System.out.println(getRoundLog());
				break;
				
			}else {
				System.out.println("New Round");
				o = new Fighter("fighter");
				fight(p,o);
			}
		}
		
		else if (o.isAlive() && !p.isAlive()) {
			System.out.println("Your Fighter Is Dead...");
			appendLog("Opponent Win In This Match..\n");
			System.out.println("Opponent Win In This Match..");
			System.out.println("----BattleLog----");
			System.out.println(battle.getBattleLog());
			System.out.println("----RoundLog----");
			System.out.println(getRoundLog());
			break;
		}		
		
	}
	
	}
	
	public boolean isBiggest(int pl, int opp) {
		return pl>opp;
		
		
		
	}
	public void appendLog(String log) {
		this.roundLog = roundLog;
		
		
	}
	public String getRoundLog() {
		return roundLog;
		
		
	}

}
