package Character;

import java.util.Random;
//슬리퍼
public class Hypno extends Monster{

	// 공격
		public int attack() {
			String []att = new String[3];
			int []damage = new int[3];
			att[0]="막치기";
			damage[0]=power+5;
			att[1]="사이코키네시스";
			damage[1]=power+10;
			att[2]="박치기";
			damage[2]=power+5;
			
			Random rd = new Random();
			
			for (int i = 0; i < att.length;i++) {
				
				att[i] = att[rd.nextInt(3)];
				
			System.out.println("슬리퍼는 "+att[i]+"을 썼다.");
			for (int j = 0; j < damage.length; j++) {
				damage[i] = damage[rd.nextInt(3)];
				System.out.println("데미지 -"+damage[i]+"를 주었다.");
				break;
			}
			break;
			}
			return power;
		}
		
		//공격을 받은 
		public void attacked(int damage ) {
			if (defense>=power) {
				hp = hp-0;
				defense = defense - damage;
			}else {
				hp= hp+defense-damage;
			}
		}
}
