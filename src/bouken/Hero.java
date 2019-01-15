/**
 *
 */
package bouken;

/**
 * @author nakamurakatsuya
 *
 */
public class Hero {

	String name;
	int hp;

	void sleep() {
		this.hp = 100;
		System.out.println(this.name + "は、眠ってしまった！");
	}
//	何秒座るか引数で受け取る
	void sit (int sec) {
//		座る秒数だけHPを増やす
		this.hp += sec;
		System.out.println(this.name + "は、" + sec + "秒座った、");
		System.out.println("HPが" + sec + "ポイント回復した");
	}

	void slip() {
		this.hp -= 5;
		System.out.println(this.name + "は、転んだ");
		System.out.println("5のダメージ");
	}

	void run() {
		System.out.println(this.name + "は、逃げ出した!");
		System.out.println("GAMEOVER");
		System.out.println("最終HPは" + this.hp + "でした");
	}
}
