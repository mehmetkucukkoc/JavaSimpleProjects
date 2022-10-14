import java.util.Scanner;

public class CreatingArrayWithForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // let's create board of 4x4
        int[][] board = new int[sc.nextInt()][sc.nextInt()];
        // let's loop through array to populate board
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                board[row][col] = row * col;
            }
        } // let's loop through array to print each row and column
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                board[row][col] = row * col;
                System.out.print(board[row][col] + "\t");
            }
            System.out.println();
        }

    }
}
