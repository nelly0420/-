package Character;

import java.util.Random;
//�ѹ���
public class Oddish extends Monster {
	
	// ����
		public int attack() {
			String []att = new String[3];
			int []damage = new int[3];
			att[0]="���ؾ�";
			damage[0]=power+6;
			att[1]="���� ��";
			damage[1]=power+8;
			att[2]="�ٳ� ������";
			damage[2]=power+7;
			
			Random rd = new Random();
			
			for (int i = 0; i < att.length;i++) {
				
				att[i] = att[rd.nextInt(3)];
			System.out.println("�ѹ��ʴ� "+att[i]+"�� ���.");
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
