package Character;

public class Monster extends Character {

	public int power;
	public int defense;
	public int money;
	public int experience ;
	
	public int attack() {
		return power;
	}
	
	public void attacked(String name ) {
		if (defense<power) {
			hp= hp+defense-power;
			
		}else {
			
			return;
		}
		
}
}
