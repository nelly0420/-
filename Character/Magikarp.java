package Character;
//�׾�ŷ
public class Magikarp extends Monster{


	
	// ����
	public int attack() {
		int damage = power*0;
		System.out.println("�׾�ŷ�� Ƣ������⸦ ���.");
		System.out.println("�׾�ŷ��"+damage+"�������� ���.");
		System.out.println();
		return power;
	}
	
	//������ ���� 
	public void attacked(int power) {
		if (defense>=power) {
			hp = hp-0;
			defense = defense - power;
		}else {
			hp= hp+defense-power;
		}
	}
}
