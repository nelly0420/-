package Character;

public class Main_character extends Character{

	public int power;
	public int defense;
	public int fullhp;
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

