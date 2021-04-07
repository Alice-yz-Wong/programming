import java.util.*;
import java.util.Arrays;


public class Ocean {
    private Ship[][] ships;
    private int shotsFired;
    private int hitCount;
    private int shipsSunk;
    private Ship empty=new EmptySea();

    public Ocean(){
        ships=new Ship[20][20];
        shotsFired = 0;
        hitCount = 0;
        shipsSunk = 0;
        for(int r=0;r<20;r++){
            for (int c=0;c<20;c++){
                ships[r][c]=new EmptySea();
            }
        }
    }
    
    
    

    /*We’ll play this game on a 20x20 ocean. This is larger than the ocean in the traditional battleship game.  
     * In this game we will have one 8-square Battleship, one 7-square Battlecruiser, two 6-square Cruisers, 
     * two 5-square Light Cruisers, three 4-square Destroyers and four 3-square Submarines. Finally, unlike the traditional game,
     *  A player can shoot 5 times in each turn.
    */
    //1+1+2+2+3+4=13
    void placeAllShipsRandomly(){
        Ship[] ships=new Ship[13];
        for (int i = 0;i<13;i++) {
        	if(i==0)ships[i]=new BattleShip();
        	if(i==1)ships[i]=new BattleCruiser();
        	if(i>1||i<4)ships[i]=new Cruiser();
        	if(i>=4||i<6)ships[i]=new LightCruiser();
        	if(i>=6||i<9)ships[i]=new Destroyer();
        	if(i>=9||i<13)ships[i]=new Submarine();
		}
        
        Random r=new Random();
        for(Ship ship:ships){
           	int row = r.nextInt(20);
     		int column = r.nextInt(20);
      		boolean horizontal = r.nextBoolean();
        	if (ship.okToPlaceShipAt(row, column, horizontal, this)) {
        		ship.placeShipAt(row, column, horizontal, this);
        	}
        }    	    
    }
    
    public boolean isOccupied(int row, int column) {
    	if(ships[row][column].getShipType().equals("empty")) {
    		return false;
    	}else {
    		return true;
    	}
    }
    
    public boolean shootAt(int row, int column) {
    	this.shotsFired++;
    	if(!isOccupied(row,column)) {
    		return false;
    	}else {
    		ships[row][column].shootAt(row, column);
    		if(ships[row][column].isSunk()) {
    			shipsSunk++;
    			
    			
    		}
    	}
    }


	public Object[][] getShipArray() {
		// TODO Auto-generated method stub
		return null;
	}





}
