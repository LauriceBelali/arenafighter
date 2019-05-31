package se.lexicon.laurice.arena_fighter;

import java.util.Random;

public class Fighter {
	private String name;
	private int strength;
	private int hitpoints;
	private int score;
	private boolean retired;
	
	RandomGen r = new RandomGen ();
	
	



	public Fighter (String name) {
		this.name = name;
		this.strength = r.GetRandom(6,10);
		this.hitpoints = r.GetRandom(1,6);
	}
	
	public int attack(int randomModifier) {
		return r.nextInt(randomModifier);
		
	}
	public void addToScore(int scoreToAdd) {
		this.score= this.score+scoreToAdd;
		
	}
	public void takeDamage(int damage) {
		this.hitpoints= this.hitpoints-damage;
		
	}
	public String getInfo() {
		if(name!=null) {
			return ("-----Player" + name + "----\n" + "Strength : " 
		+ strength + "Score : " + score + "," + "Hitpoints" + hitpoints);
		}else {
			return "------Opponent------\n"
					+ "Strength : "+ strength + "Score : " + score + "," + "Hitpoints" + hitpoints;
		}
		
	}
	public void retire() {
	} {
		if(hitpoints==0 || strength==0)
			retired = true;
		
	}
	public boolean isRetired() {
		return retired;
		
	}
	public boolean isAlive() {
		if(this.hitpoints>0) {
			return true;
		}
		return false;
		
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
		
	}

	public int getHitpoints() {
		return hitpoints;
	}

	public void setHitpoints(int hitpoints) {
		this.hitpoints = hitpoints;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public void setRetired(boolean retired) {
		this.retired = retired;
	}

}
