package bouken;

public class Cleric {

	String name;
	int hp = 50;
	final int MAX_HP = 50;
	int mp = 10;
	final int MAX_MP = 10;

	public void selfAid() {
		System.out.println(this.name + "はセルフエイドを唱えた!");
		this.hp = this.MAX_HP;
		this.mp -= 5;
		System.out.println("HPが全回復した。");
	}

	public int pray(int sec) {
		System.out.println(this.name + "は祈った");
		int r = new java.util.Random().nextInt(3) + sec;
		if(r > MAX_MP) {
			this.mp += this.MAX_MP;
			System.out.println("mpが全回復しました");
		} else {
			System.out.println("mpが" + r + "回復しました");
		}
		return r;
	}
}
