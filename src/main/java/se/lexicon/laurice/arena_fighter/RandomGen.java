package se.lexicon.laurice.arena_fighter;

import java.util.Random;

public class RandomGen {

	public int GetRandom(int min, int max) {
		
		Random rand = new Random();
		int value = rand.nextInt(max);
		while (value < min) {
			value = rand.nextInt(max);
			
		}
		return value;
	}

	public int nextInt(int randomModifier) {
		return 0;
	}

}
