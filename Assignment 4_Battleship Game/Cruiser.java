
public class Cruiser extends Ship {

	public Cruiser() {
		this.setLength(6);
		this.setHit(new boolean[6]);
		for(int i=0;i<6;i++) {
			getHit()[i]=false;
		}
	}
	

	@Override
	public String getShipType() {
		return "cruiser";
	}
}
