
public class Submarine extends Ship {

	public Submarine() {
		this.setLength(3);
		this.setHit(new boolean[3]);
		for(int i=0;i<3;i++) {
			getHit()[i]=false;
		}
	}
	

	@Override
	public String getShipType() {
		return "submarine";
	}

}
