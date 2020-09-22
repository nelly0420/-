package Character;

import java.util.Scanner;
// 피카츄
public class Pikachu extends Main_character {
	
	public int attack() {
		int damage =0;
		
		if (pp>=0) {
			
		Scanner scan = new Scanner (System.in);
		System.out.println("1.  전광석화");
		System.out.println("2.  10만 볼트");
		System.out.println("3.  번개");
		System.out.print("공격  선택 >>");
		int num = scan.nextInt();
		
		
		if (num ==1) {
		
			damage += power+5;
			
			System.out.println("데미지는 -"+damage);
			System.out.println();
			return damage;
		}
		else if (num==2) {
			
			damage += power+8;
			
			pp = pp-10;
			System.out.println("데미지는 -"+damage);
			System.out.println();
			return damage;
		}else if (num==3) {
			
			damage += power+10;
			
			pp = pp-15;
			System.out.println("데미지는 -"+damage);
			System.out.println();
			return damage;
		}
		
		System.out.println("데미지는 -"+damage);
		System.out.println();
		return damage;
		
	}else {
		System.out.println("PP가 0입니다");
		System.out.println();
		return damage;
	     }
	}
	
	public void attacked(int damage ) {
		if (defense>=power) {
			hp = hp-0;
			defense = defense - damage;
		}else {
			hp= hp+defense-damage;
		}
		
		
	}
}
