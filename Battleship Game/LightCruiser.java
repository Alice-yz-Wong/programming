
public class LightCruiser extends Ship {

	public LightCruiser() {
		this.setLength(5);
		this.setHit(new boolean[5]);
		for(int i=0;i<5;i++) {
			getHit()[i]=false;
		}
	}
	

	@Override
	public String getShipType() {
		return "lightcruiser";
	}


}
