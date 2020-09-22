package Game;

import java.util.Scanner;

import Character.*;
import Map.*;

public class GameMain {

	public static void main(String[]args) {
		
		Scanner scan = new Scanner(System.in);
		Main_character mc = new Main_character();
		Player p = new Player();
		
		System.out.println("[[포켓몬 게임!]]");
		System.out.println();
		System.out.print("플레이어의 이름을 입력해주세요 >>");
		p.name = scan.next();		
		System.out.println();
		System.out.println(p.name+"님! 여기있는 포켓몬 중에 데리고 다닐 포켓몬을 골라주세요!!");
		System.out.println();
		System.out.println("1. 피카츄");
		System.out.println("2. 파이리");
		System.out.println("3. 꼬부기");
	    System.out.println("4. 모부기");
	    int num = scan.nextInt();
	    
	    if (num==1) {
			System.out.println("피카츄가 선택되었습니다.");
			mc = new Pikachu();
			mc.name ="피카츄";
			mc.defense =20;
			mc.hp = 40;
			mc.fullhp = 40;
			mc.level =3;
			mc.power = 10;
			mc.pp = 30;
			
		}else if (num==2) {
			System.out.println("파이리가 선택되었습니다.");
			mc = new Charmander();
			mc.name ="파이리";
			mc.defense =20;
			mc.hp = 40;
			mc.fullhp = 40;
			mc.level =3;
			mc.power = 10;
			mc.pp = 30;
		}else if (num==3) {
			System.out.println("꼬부기가 선택되었습니다.");
			mc = new Squirtle();
			mc.name ="꼬부기";
			mc.defense =30;
			mc.hp = 40;
			mc.fullhp = 40;
			mc.level =3;
			mc.power = 10;
			mc.pp = 30;
		}else if (num==4) {
			System.out.println("모부기가 선택되었습니다.");
			mc = new Turtwig();
			mc.name ="모부기";
			mc.defense =30;
			mc.hp = 40;
			mc.fullhp = 40;
			mc.level =3;
			mc.power =10;
			mc.pp = 30;	
		}
	    System.out.println("게임이 시작됩니다!");
	    System.out.println();
	    while (true) {
			System.out.println("-----------------");
			System.out.println("이름 : "+p.name);
			System.out.println("소지 포켓몬 : "+mc.name);
			System.out.println("당신의 포켓몬의 레벨 : "+ mc.level);
			System.out.println("당신의 포켓몬의 HP : "+ mc.hp);
			System.out.println("당신의 포켓몬의 PP : "+ mc.pp);
			System.out.println("당신의 포켓몬의 경험치 : "+ mc.experience);
			System.out.println("당신의 돈 : "+ p.money);
			System.out.println("-----------------");
			System.out.println();
			System.out.println("***[이동]***");
			System.out.println("1. 이상한 수풀");
			System.out.println("2. 상점");
			System.out.println("3. 회복센터");
			System.out.print("어디로 가시겠습니까? >>");
			num = scan.nextInt();
			
			if (num==1) {
				
				Monster  mon = new Monster();
				System.out.println();
				System.out.println("이상한 수풀에서 싸울 야생포켓몬을 선택하세요.");
				System.out.println("1. 치코리타");
				System.out.println("2. 잉어킹");
				System.out.println("3. 주벳");
				System.out.println("4. 이브이");
				System.out.println("5. 슬리피");
				System.out.println("6. 뚜벅쵸");
				num = scan.nextInt();
					
					if (num==1) {
						
						mon=new Chicorita();
						mon.name ="치코리타";
						mon.level = 2;
						mon.hp = 30;
						mon.money = 18;
						mon .experience = 15;
						mon.power = 15;
						mon.defense = 10;
						System.out.println();	
					}
					else	if (num==2) {
						mon= new Magikarp() ;	
						mon.name ="잉어킹";
						mon.level = 1;
						mon.hp = 20;
						mon.money = 10;
						mon.experience = 10;
						mon.power = 0;
						mon.defense = 10;
						System.out.println();
					}
					else	if (num==3) {
						mon= new Zubat() ;	
						mon.name ="주벳";
						mon.level = 2;
						mon.hp = 25;
						mon.money = 12;
						mon.experience = 10;
						mon.power = 10;
						mon.defense = 10;
						System.out.println();
					}else	 if (num==4) {
						mon= new Eevee(); 
						mon.name ="이브이";
						mon.level = 3;
						mon.hp = 30;
						mon.money = 15;
						mon.experience = 13;
						mon.power = 13;
						mon.defense = 11;
						System.out.println();
					}
					else	if (num==5) {
						mon= new Hypno();
						mon.name ="슬리퍼";
						mon.level = 2;
						mon.hp = 30;
						mon.money = 15;
						mon.experience = 10;
						mon.power = 10;
						mon.defense = 10;
						System.out.println();
					}
					else	if (num==6) {
						mon= new Oddish();	
						mon.name ="뚜벅쵸";
						mon.level = 2;
						mon.hp = 30;
						mon.money = 15;
						mon.experience = 10;
						mon.power = 10;
						mon.defense = 10;
						System.out.println();	
					}
					
					while (true) {
						System.out.println("-----------------");
						System.out.println("야생포켓몬 : "+mon.name);
						System.out.println("야생포켓몬의 레벨 : "+ mon.level);
						System.out.println("야생 포켓몬의 HP : "+ mon.hp);
						System.out.println("야생 포켓몬의 방어력 : "+ mon.defense);
						System.out.println("-----------------");
						System.out.println("공격한다!");
						System.out.println();
						mon.attacked(mc.name);
						mon.hp=mon.hp-mc.attack();
						
						if (mon.hp <= 0) {
							System.out.println("해치웠다!!");
							mc.experience += mon.experience;
							p.money += mon.money;
							System.out.println("-----------------");
							System.out.println("이름 : "+p.name);
							System.out.println("소지 포켓몬 : "+mc.name);
							System.out.println("당신의 포켓몬의 레벨 : "+ mc.level);
							System.out.println("당신의 포켓몬의 HP : "+ mc.hp);
							System.out.println("당신의 포켓몬의 PP : "+ mc.pp);
							System.out.println("당신의 포켓몬의 경험치 : "+ mc.experience);
							System.out.println("당신의 돈 : "+ p.money);
							System.out.println("-----------------");
							break;
						}
						
						System.out.println("야생포켓몬의 공격!");
						System.out.println();
						mc.attacked(mon.name);
						mc.hp = mc.hp -mon.attack();
						if (mc.hp <=0) {
							System.out.println("쓰러졌다.");
							System.out.println();
							
							break;
						}
					}
				}
			if (mc.experience >= mc.level) {
				mc.level +=1;
				System.out.println("레벨"+mc.level+"가 됬다.");
				p.money += mc.level*5;
				mc.hp += mc.level;
				mc.fullhp+= mc.level;
				mc.pp += mc.level;
				mc.power += mc.level;
				mc.defense = mc.level;
				System.out.println("레벨업이 되어 "+mc.level*5+"원을 드립니다");
				System.out.println("레벨업이 되어" +mc.level+"만큼 체력이 회복됩니다.");
				System.out.println("레벨업이 되어" +mc.level+"만큼 pp가 회복됩니다.");
				System.out.println("레벨업이 되어"+mc.level+"만큼 기술력과 방어력이 향상됩니다.");
				System.out.println("레벨업이 되어"+mc.level+"만큼 full hp가 향상됩니다.");
				mc.experience = 0;
			}
			else if (num==2) {
				Store s = new Store();
				System.out.println("상점!!");
				System.out.println("1. hp포션");
				System.out.println("2. pp포션");
				System.out.println("3. exp포션");
				System.out.print("원하는 물건 입력 >>");
				num = scan.nextInt();
				int temp = p.money;
				if ((p.money = s.show(p.money, num)) != -1) {
					System.out.println("구입 완료!");
				  if (num==1) 
					mc.hp += 30;
				if(num==2)
					mc.pp += 30;
				if(num==3)
					mc.experience += 20;
				}
				else {
					System.out.println("돈이 부족합니다...");
					p.money = temp;
				}
			}
			else if (num==3) {
				
				Hospital h = new Hospital();
				System.out.println("치료센터에 왔습니다.");
				
				if(mc.hp==mc.fullhp) {
					System.out.println("포켓몬이 쉴 필요가 없습니다!");
				}else
					System.out.println("포켓몬을 치료합니다.");
				mc.hp += mc.fullhp-mc.hp;
			}
			
		}
	}
}

