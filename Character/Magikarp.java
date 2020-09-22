package Character;
//À×¾îÅ·
public class Magikarp extends Monster{


	
	// °ø°Ý
	public int attack() {
		int damage = power*0;
		System.out.println("À×¾îÅ·ÀÌ Æ¢¾î¿À¸£±â¸¦ ½è´Ù.");
		System.out.println("À×¾îÅ·ÀÌ"+damage+"µ¥¹ÌÁö¸¦ Áá´Ù.");
		System.out.println();
		return power;
	}
	
	//°ø°ÝÀ» ¹ÞÀº 
	public void attacked(int power) {
		if (defense>=power) {
			hp = hp-0;
			defense = defense - power;
		}else {
			hp= hp+defense-power;
		}
	}
}
