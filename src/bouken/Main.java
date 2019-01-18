/**
 *
 */
package bouken;

/**
 * @author nakamurakatsuya
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・  スタブ

//      Heroクラスを呼び出し、インスタンス生成
		Hero h = new Hero();
//		Heroクラスのインスタンスフィールドを呼び出す
		h.name = "ミナト";
		Hero h1 = new Hero();
		h1.name = "カイト";
		h1.hp = 100;
		Hero h2 = new Hero();
		h2.name = "あさか";
		h2.hp = 100;

//		Matangoクラスを呼び出し、インスタンス生成
		Matango m1 = new Matango();
		m1.hp = 50;
		m1.suffix = 'A';
		Matango m2 = new Matango();
		m2.hp = 48;
		m2.suffix = 'B';
		Cleric c = new Cleric();
		c.name = "muuuu";

//		Wizardクラスを呼び出し、インスタンスを生成
		Wizard w = new Wizard();
		w.name = "スガはら";
		w.hp = 50;
		w.heal(h1);
		w.heal(h2);
		w.heal(h2);

//		HeroクラスとMatangoのメソッドを呼び出す
		h.slip();
		m1.run();
		m2.run();
		h.run();
		c.selfAid();
		c.pray(5);
	}
}
