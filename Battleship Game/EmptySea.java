
public class EmptySea extends Ship {

	public EmptySea() {
		this.setLength(1);
		this.setHit(new boolean[1]);
		getHit()[0]=false;
	}
	
	@Override
	public boolean shootAt(int row, int column) {
		return false;
	}
	
	@Override 
	public boolean isSunk() {
		return false;
	}

	@Override
	public char toString() {
		return 's';
	}


	@Override
	public String getShipType() {
		return "empty";
	}

}
