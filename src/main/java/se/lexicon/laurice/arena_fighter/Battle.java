package se.lexicon.laurice.arena_fighter;

public class Battle {
	private Fighter player;
	private Fighter opponent;
	private String battleLog;
	


	public Battle (Fighter player, Fighter opponent) {
		this.player = player;
		this.opponent = opponent;
		battleLog =" ";
	}
	
	public boolean battle() {
		return(player.isAlive() && opponent.isAlive());
			
		
		
	}
		
	public String getBattleLog() {
		return battleLog;
		}
	
			
	public void appendLog(String log) {
		this.battleLog = battleLog;
		
			}
				
			}


