package shuliang.han.displaytest;

public class M1A2SEP extends Tanker implements Panzer  {

	@Override
	public double getCaliber() {
		return getGunCaliber();
	}

	@Override
	public void fire() {
		gunFire();
	}

	@Override
	public void run() {
		move();
	}

}
