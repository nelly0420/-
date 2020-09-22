package Game;

import java.util.Scanner;

import Character.*;
import Map.*;

public class GameMain {

	public static void main(String[]args) {
		
		Scanner scan = new Scanner(System.in);
		Main_character mc = new Main_character();
		Player p = new Player();
		
		System.out.println("[[���ϸ� ����!]]");
		System.out.println();
		System.out.print("�÷��̾��� �̸��� �Է����ּ��� >>");
		p.name = scan.next();		
		System.out.println();
		System.out.println(p.name+"��! �����ִ� ���ϸ� �߿� ������ �ٴ� ���ϸ��� ����ּ���!!");
		System.out.println();
		System.out.println("1. ��ī��");
		System.out.println("2. ���̸�");
		System.out.println("3. ���α�");
	    System.out.println("4. ��α�");
	    int num = scan.nextInt();
	    
	    if (num==1) {
			System.out.println("��ī�� ���õǾ����ϴ�.");
			mc = new Pikachu();
			mc.name ="��ī��";
			mc.defense =20;
			mc.hp = 40;
			mc.fullhp = 40;
			mc.level =3;
			mc.power = 10;
			mc.pp = 30;
			
		}else if (num==2) {
			System.out.println("���̸��� ���õǾ����ϴ�.");
			mc = new Charmander();
			mc.name ="���̸�";
			mc.defense =20;
			mc.hp = 40;
			mc.fullhp = 40;
			mc.level =3;
			mc.power = 10;
			mc.pp = 30;
		}else if (num==3) {
			System.out.println("���αⰡ ���õǾ����ϴ�.");
			mc = new Squirtle();
			mc.name ="���α�";
			mc.defense =30;
			mc.hp = 40;
			mc.fullhp = 40;
			mc.level =3;
			mc.power = 10;
			mc.pp = 30;
		}else if (num==4) {
			System.out.println("��αⰡ ���õǾ����ϴ�.");
			mc = new Turtwig();
			mc.name ="��α�";
			mc.defense =30;
			mc.hp = 40;
			mc.fullhp = 40;
			mc.level =3;
			mc.power =10;
			mc.pp = 30;	
		}
	    System.out.println("������ ���۵˴ϴ�!");
	    System.out.println();
	    while (true) {
			System.out.println("-----------------");
			System.out.println("�̸� : "+p.name);
			System.out.println("���� ���ϸ� : "+mc.name);
			System.out.println("����� ���ϸ��� ���� : "+ mc.level);
			System.out.println("����� ���ϸ��� HP : "+ mc.hp);
			System.out.println("����� ���ϸ��� PP : "+ mc.pp);
			System.out.println("����� ���ϸ��� ����ġ : "+ mc.experience);
			System.out.println("����� �� : "+ p.money);
			System.out.println("-----------------");
			System.out.println();
			System.out.println("***[�̵�]***");
			System.out.println("1. �̻��� ��Ǯ");
			System.out.println("2. ����");
			System.out.println("3. ȸ������");
			System.out.print("���� ���ðڽ��ϱ�? >>");
			num = scan.nextInt();
			
			if (num==1) {
				
				Monster  mon = new Monster();
				System.out.println();
				System.out.println("�̻��� ��Ǯ���� �ο� �߻����ϸ��� �����ϼ���.");
				System.out.println("1. ġ�ڸ�Ÿ");
				System.out.println("2. �׾�ŷ");
				System.out.println("3. �ֺ�");
				System.out.println("4. �̺���");
				System.out.println("5. ������");
				System.out.println("6. �ѹ���");
				num = scan.nextInt();
					
					if (num==1) {
						
						mon=new Chicorita();
						mon.name ="ġ�ڸ�Ÿ";
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
						mon.name ="�׾�ŷ";
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
						mon.name ="�ֺ�";
						mon.level = 2;
						mon.hp = 25;
						mon.money = 12;
						mon.experience = 10;
						mon.power = 10;
						mon.defense = 10;
						System.out.println();
					}else	 if (num==4) {
						mon= new Eevee(); 
						mon.name ="�̺���";
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
						mon.name ="������";
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
						mon.name ="�ѹ���";
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
						System.out.println("�߻����ϸ� : "+mon.name);
						System.out.println("�߻����ϸ��� ���� : "+ mon.level);
						System.out.println("�߻� ���ϸ��� HP : "+ mon.hp);
						System.out.println("�߻� ���ϸ��� ���� : "+ mon.defense);
						System.out.println("-----------------");
						System.out.println("�����Ѵ�!");
						System.out.println();
						mon.attacked(mc.name);
						mon.hp=mon.hp-mc.attack();
						
						if (mon.hp <= 0) {
							System.out.println("��ġ����!!");
							mc.experience += mon.experience;
							p.money += mon.money;
							System.out.println("-----------------");
							System.out.println("�̸� : "+p.name);
							System.out.println("���� ���ϸ� : "+mc.name);
							System.out.println("����� ���ϸ��� ���� : "+ mc.level);
							System.out.println("����� ���ϸ��� HP : "+ mc.hp);
							System.out.println("����� ���ϸ��� PP : "+ mc.pp);
							System.out.println("����� ���ϸ��� ����ġ : "+ mc.experience);
							System.out.println("����� �� : "+ p.money);
							System.out.println("-----------------");
							break;
						}
						
						System.out.println("�߻����ϸ��� ����!");
						System.out.println();
						mc.attacked(mon.name);
						mc.hp = mc.hp -mon.attack();
						if (mc.hp <=0) {
							System.out.println("��������.");
							System.out.println();
							
							break;
						}
					}
				}
			if (mc.experience >= mc.level) {
				mc.level +=1;
				System.out.println("����"+mc.level+"�� ���.");
				p.money += mc.level*5;
				mc.hp += mc.level;
				mc.fullhp+= mc.level;
				mc.pp += mc.level;
				mc.power += mc.level;
				mc.defense = mc.level;
				System.out.println("�������� �Ǿ� "+mc.level*5+"���� �帳�ϴ�");
				System.out.println("�������� �Ǿ�" +mc.level+"��ŭ ü���� ȸ���˴ϴ�.");
				System.out.println("�������� �Ǿ�" +mc.level+"��ŭ pp�� ȸ���˴ϴ�.");
				System.out.println("�������� �Ǿ�"+mc.level+"��ŭ ����°� ������ ���˴ϴ�.");
				System.out.println("�������� �Ǿ�"+mc.level+"��ŭ full hp�� ���˴ϴ�.");
				mc.experience = 0;
			}
			else if (num==2) {
				Store s = new Store();
				System.out.println("����!!");
				System.out.println("1. hp����");
				System.out.println("2. pp����");
				System.out.println("3. exp����");
				System.out.print("���ϴ� ���� �Է� >>");
				num = scan.nextInt();
				int temp = p.money;
				if ((p.money = s.show(p.money, num)) != -1) {
					System.out.println("���� �Ϸ�!");
				  if (num==1) 
					mc.hp += 30;
				if(num==2)
					mc.pp += 30;
				if(num==3)
					mc.experience += 20;
				}
				else {
					System.out.println("���� �����մϴ�...");
					p.money = temp;
				}
			}
			else if (num==3) {
				
				Hospital h = new Hospital();
				System.out.println("ġ�Ἶ�Ϳ� �Խ��ϴ�.");
				
				if(mc.hp==mc.fullhp) {
					System.out.println("���ϸ��� �� �ʿ䰡 �����ϴ�!");
				}else
					System.out.println("���ϸ��� ġ���մϴ�.");
				mc.hp += mc.fullhp-mc.hp;
			}
			
		}
	}
}

