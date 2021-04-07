
public class BattleCruiser extends Ship {
	public BattleCruiser() {
		this.setLength(7);
		this.setHit(new boolean[7]);
		for(int i=0;i<7;i++) {
			getHit()[i]=false;
		}
	}
	

	@Override
	public String getShipType() {
		return “battlecruiser”;
	}

}
