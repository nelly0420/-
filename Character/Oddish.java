package Character;

import java.util.Random;
//¶Ñ¹÷ÃÊ
public class Oddish extends Monster {
	
	// °ø°İ
		public int attack() {
			String []att = new String[3];
			int []damage = new int[3];
			att[0]="¿ëÇØ¾×";
			damage[0]=power+6;
			att[1]="²ÉÀÙ ´í½º";
			damage[1]=power+8;
			att[2]="ÀÙ³¯ °¡¸£±â";
			damage[2]=power+7;
			
			Random rd = new Random();
			
			for (int i = 0; i < att.length;i++) {
				
				att[i] = att[rd.nextInt(3)];
			System.out.println("¶Ñ¹÷ÃÊ´Â "+att[i]+"À» ½è´Ù.");
			for (int j = 0; j < damage.length; j++) {
				damage[i] = damage[rd.nextInt(3)];
				System.out.println("µ¥¹ÌÁö -"+damage[i]+"¸¦ ÁÖ¾ú´Ù.");
				break;
			}
			break;
			}
			return power;
		}
		
		//°ø°İÀ» ¹ŞÀº 
		public void attacked(int damage ) {
			if (defense>=power) {
				hp = hp-0;
				defense = defense - damage;
			}else {
				hp= hp+defense-damage;
			}
		}
}
