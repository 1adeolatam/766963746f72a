/*
 * * Name: Tami Adeola 
 * Version: 1.0 
 * Date: Monday, November 10th, 2014 
 * Purpose: Find a way out a maze array
 */
package Unit4;

/**
 */
public class LetMeOut {
//class constants

    private static final char WALL = 'W';
    private static final char EXIT = 'X';
    private static final char OPEN = '.';
    private static final char TRIED = '-';
    private static final char GOOD_PATH = '+';

    private char[][] maze = {
        {'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W'},
        {'W', '.', '.', '.', 'W', '.', '.', '.', '.', '.', '.', '.', 'W'},
        {'W', '.', 'W', '.', 'W', '.', 'W', 'W', 'W', '.', 'W', 'W', 'W'},
        {'W', '.', 'W', '.', '.', '.', 'W', 'W', '.', '.', '.', '.', 'W'},
        {'W', '.', 'W', '.', 'W', '.', 'W', 'W', '.', 'W', 'W', 'W', 'W'},
        {'W', '.', 'W', 'W', 'W', 'W', 'W', '.', '.', '.', '.', '.', 'W'},
        {'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'X', 'W', 'W', 'W'}
    };

    /**
     * Display the current maze.
     */
    public boolean findExitFrom(int row, int col) {
        boolean successful = false;

        if (maze[row][col] == EXIT) {

            successful = true;

        } else {
            maze[row][col] = TRIED;
// ALgorithm for finding an exit
            //Left
            if (maze[row][col - 1] == OPEN) {
                successful = findExitFrom(row, col - 1);
            }
            //DOWN
            if (!successful && maze[row + 1][col] == OPEN || maze[row + 1][col] == EXIT) {
                successful = findExitFrom(row + 1, col);
            }
            //Right
            if (!successful && maze[row][col + 1] == OPEN || maze[row][col + 1] == EXIT) {
                successful = findExitFrom(row, col + 1);
            }
            //UP
            if (!successful && maze[row - 1][col] == OPEN || maze[row - 1][col] == EXIT) {
                successful = findExitFrom(row - 1, col);
            }
        }

        if (successful) {
            maze[row][col] = GOOD_PATH;
        }

        return successful;
    }

    /**
     * Display the current maze.
     */
    public void solve() {

        // FIND RANDOM START LOCATION
        int row;
        int col;
        do {
            row = (int) (Math.random() * maze.length);
            col = (int) (Math.random() * maze[0].length);
        } while (maze[row][col] != OPEN);

        // START!
        System.out.println("START LOCATION: (" + row + "," + col + ")");
        findExitFrom(row, col);

        // SHOW EXIT
        displayMaze();

    }

    /**
     * Display the current maze.
     */
    public void displayMaze() {
        for (int row = 0; row < maze.length; row++) {
            for (int col = 0; col < maze[row].length; col++) {
                System.out.print(maze[row][col]);
            }
            System.out.println();
        }
        System.out.println("-------------------------------");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        LetMeOut lmo = new LetMeOut();
        lmo.displayMaze();
        lmo.solve();

    }

}
