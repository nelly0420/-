package Map;

public class Store extends Map {

	int expPotion =80;
	int hpPotion = 10;
	int ppPotion = 20;
	
	public int show(int money, int num) {
		name = "����";
		System.out.println(name+"�� ���Խ��ϴ�.");
		System.out.println("1. hp����");
		System.out.println("2. pp����");
		System.out.println("3. exp����");
		
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
