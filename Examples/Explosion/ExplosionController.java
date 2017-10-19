package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.List;

public class ExplosionController {
	List<Explosion> explosions = new ArrayList<>();
	
	public void load(Explosion e) {
		explosions.add(e);
	}
	public void start() {
		System.out.println(explosions.size() + " explosions to explode.");
		for (Explosion e : explosions) {
			e.explode();
		}
	}
	public static void demo() {
		System.out.println("\t" + ExplosionController.class.getName() + ".demo() starting...\n");
		ExplosionController obj = new ExplosionController();
		obj.load(new Explosion());
		obj.start();
		obj.load(new GunShot());
		obj.start();
		obj.load(new Grenade());
		obj.start();
		obj.load(new ABomb());
		obj.start();
		System.out.println("\t" + ExplosionController.class.getSimpleName() + ".demo() starting...\n");
	}
}
