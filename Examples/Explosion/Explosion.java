package edu.neu.csye6200;

public class Explosion {
	public void explode() {
		System.out.println("(EXPLODE)");
	}
	public static void demo() {
		System.out.println("\t" + Explosion.class.getName() + ".demo() starting...\n");
		Explosion obj = new Explosion();
		obj.explode();
		System.out.println(Explosion.class.getName() + ".demo() done!\n");
	}
}
