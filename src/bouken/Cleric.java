package bouken;

import java.util.Random;

public class Cleric {

	String name;
	int hp = 50;
	static final int MAX_HP = 50;
	int mp = 10;
	static final int MAX_MP = 10;

	public void selfAid() {
		System.out.println(this.name + "はセルフエイドを唱えた!");
		this.hp = Cleric.MAX_HP;
		this.mp -= 5;
		System.out.println("HPが全回復した。");
	}

	public int pray(int sec) {
		System.out.println(this.name + "は祈った");
		int r = new Random().nextInt(3) + sec;
		if(r > MAX_MP) {
			this.mp += Cleric.MAX_MP;
			System.out.println("mpが全回復しました");
		} else {
			System.out.println("mpが" + r + "回復しました");
		}
		return r;
	}

//	public Cleric(String name, int hp, int mp) {
//		this.name = name;
//		this.hp = hp;
//		this.mp = mp;
//	}
//
//	public Cleric(String name, int hp) {
//		this(name, hp, Cleric.MAX_MP);
//	}
//
//	public Cleric(String name) {
//		this(name, Cleric.MAX_HP);
//	}
}
