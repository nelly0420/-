package Map;

public class Store extends Map {

	int expPotion =80;
	int hpPotion = 10;
	int ppPotion = 20;
	
	public int show(int money, int num) {
		name = "상점";
		System.out.println(name+"에 들어왔습니다.");
		System.out.println("1. hp포션");
		System.out.println("2. pp포션");
		System.out.println("3. exp포션");
		
		if (hpPotion <= money) {
			return money - hpPotion;
		}
		if (ppPotion <= money) {
			return money - ppPotion;
		}
		if (expPotion <= money) {
			return money - expPotion;
		}
		return -1;
	}
}
