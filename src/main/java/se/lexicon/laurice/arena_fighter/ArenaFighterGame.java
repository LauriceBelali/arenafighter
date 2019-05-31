package se.lexicon.laurice.arena_fighter;

import java.util.Scanner;

public class ArenaFighterGame {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Inter Name Of Fighter");
		Fighter player = new Fighter (input.nextLine());
		Fighter opponenet = new Fighter("fighter");
		Battle battle = new Battle(player,opponenet);
		Round round = new Round();
		round.fight(player, opponenet);
	}

}
