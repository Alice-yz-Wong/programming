import java.util.*;
import java.util.Arrays;

public class BattleShip extends Ship {
	public BattleShip() {
		this.setLength(8);
		this.setHit(new boolean[8]);
		for(int i=0;i<8;i++) {
			getHit()[i]=false;
		}
	}
	

	@Override
	public String getShipType() {
		return "battleship";
	}

}
