public class Destroyer extends Ship {
	public Destroyer() {
		this.setLength(4);
		this.setHit(new boolean[4]);
		for(int i=0;i<4;i++) {
			getHit()[i]=false;
		}
	}
	

	@Override
	public String getShipType() {
		return "destroyer";
	}
}
