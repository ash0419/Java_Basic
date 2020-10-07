package OOP2;

public class RepairableTest {
	public static void main(String[] args) {
		Tank t = new Tank();
		Dropship d = new Dropship();
		
		Marine m = new Marine();
		SCV scv = new SCV();
		
		scv.repair(t);
		scv.repair(d);
		scv.repair(scv);
//		scv.repair(m);
	}
}

interface Repairable {
	
}
class Unit {
	int hitPoint;
	final int MAX_HP;

	Unit(int hp) {
		MAX_HP = hp;
	}
}

class GroundUnit extends Unit {

	GroundUnit(int hp) {
		super(hp);
	}
}

class Marine extends GroundUnit {

	Marine() {
		super(40);
	}

	public String toString() {
		return "Marine";
	}
}

class Tank extends GroundUnit implements Repairable{

	Tank() {
		super(150);
	}

	public String toString() {
		return "Tank";
	}
}

class SCV extends GroundUnit implements Repairable{

	SCV() {
		super(60);
	}

	public String toString() {
		return "SCV";
	}
	
	void repair(Repairable r) {
		if (r instanceof Unit) {
			Unit u = (Unit)r;
			while(u.hitPoint != u.MAX_HP) {
				u.hitPoint++;
			}
			System.out.println(u.toString() +"�� ������ �������ϴ�.");
		}
	}
}

class AirUnit extends Unit {

	AirUnit(int hp) {
		super(hp);
	}
}

class Dropship extends AirUnit implements Repairable{

	Dropship() {
		super(125);
	}
	public String toString() {
		return "DropShip";
	}
}