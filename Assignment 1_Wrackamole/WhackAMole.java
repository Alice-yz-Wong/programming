public class WhackAMole {

    // It contains three integer instance variables called score, molesLeft, and attemptsLeft. 
    // Make one more instance variable called moleGrid which is a 2-dimensional array of chars.
    int score;
    int molesLeft;
    int attemptsLeft;
    char[][] moleGrid;

    /*WhackAMole(int numAttempts, int gridDimension) - Constructor for the game, specifies total number of whacks allowed, and the grid dimension. 
     * After reading through the assignment, make sure to initialize the moleGrid with the appropriate character.*/
    WhackAMole(int Attempts, int grid) {
        attemptsLeft = Attempts;
        moleGrid = new char [grid][grid];
        for (char [] aMoleGrid : moleGrid) {
            Arrays.fill(aMoleGrid, '*');
        }
    }

    
    /* boolean place(int x, int y) – Given a location, place a mole at that location. 
     * Return true if you can. (Also update number of moles left.)        */
    boolean place(int x, int y) {
        if (moleGrid[x][y] == '*') {
                moleGrid[x][y] = 'M';
                molesLeft += 1;
                return true;
            } else {
                return false;
            }    
    }

    
    /*void whack(int x, int y) -  Given a location, take a whack at that location.
     *  If that location contains a mole, the score, number of attemptsLeft, 
     * and molesLeft is updated. If that location does not contain a mole, only attemptsLeft is updated.*/
    void whack(int x, int y) {
        if (moleGrid[x][y] == 'M') {
            moleGrid[x][y] = 'W';
            printGrid();
            score += 1;
            attemptsLeft -= 1;
            molesLeft -= 1;
            System.out.println("You got a mole at"+ x + "," + y + " !");
            System.out.println("Score: " + score);
            System.out.println("Moles left: " + molesLeft);
        } else {
            System.out.println("Ooops! You missed it");
            attemptsLeft -= 1;
        }
        System.out.println("Attempts left: " + attemptsLeft);
    }

    /*void printGridToUser() – Print the grid without showing where the moles are. 
     * For every spot that has recorded a “whacked mole,” print out a W, or * otherwise.*/
    void printGridToUser() {
        for (char[] aMoleGrid : moleGrid) {
            for (char anAMoleGrid : aMoleGrid) {
                if (anAMoleGrid == 'W') {
                    System.out.print(anAMoleGrid);
                } else {
                    System.out.print('*');
                }
            }
        }
    }

    /**Prints the grid completely. This is effectively
     * dumping the 2d array on the screen. The places where
     * the moles are, are printed as 'M'. The places where
     * the moles have been whacked are printed as 'W'. The
     * places that don't have a mole are printed as '*'.*/
    void printGrid() {
        for (char[] aMoleGrid : moleGrid) {
            for (char anMoleGrid: aMoleGrid) {
                System.out.print(anMoleGrid + " ");
            }
        }
    }


    public static void main(String[] args) {
        // Initializing the game by a 10 x 10 grid and
        // 50 attempts.
        WhackAMole Game = new WhackAMole(50, 10);

        // Randomly place 10 moles.
        Random rand = new Random();
        while (Game.molesLeft < 10) {
            int x = rand.nextInt(10);
            int y = rand.nextInt(10);
            Game.place(x, y);

        // Start whacking
        System.out.println("You have a maximum of 50 attempts left.");
        while (Game.attemptsLeft > 0 && Game.molesLeft > 0) {
            Scanner scan = new Scanner(System.in).useDelimiter(",|\\s+");
            System.out.println("Enter x,y to whack.");
            if (scan.hasNext()) {
                int x = scan.nextInt();
                int y = scan.nextInt();

                if (x < 0 || x > 9 || y < 0 || y > 9) {
                    if (x == -1 && y == -1) {
                        System.out.println("Too bad you give up");
                        Game.printGrid();
                    } else {
                        System.out.println("Positive number only!");
                    }
                } else {
                    Game.whack(x, y);
                }
            }
        }

            
        //end game    
        if (Game.attemptsLeft == 0) {
            System.out.println("No attempts left.");
        } else if (Game.molesLeft == 0) {
            System.out.println("You won!");
            Game.printGrid();
        }
    }
}


