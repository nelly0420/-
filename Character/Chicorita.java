package Character;
import java.util.Random;
//ġ�ڸ�Ÿ
public class Chicorita extends Monster {
	// ����
		public int attack() {
			String []att = new String[3];
			int []damage = new int[3];
			att[0]="�����ġ��";
			att[1]="�����ø���";
			att[2]="�ֶ��";
			damage[0]=power+5;
			damage[1]=power+6;
			damage[2]=power+8;
			
			Random rd = new Random();
			for (int i = 0; i < att.length;i++) {
				att[i] = att[rd.nextInt(3)];
				System.out.println("ġ�ڸ�Ÿ�� "+att[i]+"�� ���.");
				
				for (int j = 0; j < damage.length; j++) {
					damage[i] = damage[rd.nextInt(3)];
					System.out.println("������ -"+damage[i]+"�� �־���.");
					break;
				}
				break;
			}
			return power;
		}	
		  //������ ���� 
		public void attacked(int damage ) {
			if (defense>=power) {
				hp = hp-0;
				defense = defense - damage;
			}else {
				hp= hp+defense-damage;
			}
		}
}