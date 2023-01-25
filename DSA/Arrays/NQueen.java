package DSA.Arrays;

import java.util.Arrays;

public class NQueen {
    public static void main(String args[]) {
        int board[][] = {
                {0,0,0,0},
                {0,0,0,0},
                {0,0,0,0},
                {0,0,0,0}
        };
        nQueen(board, 0);
    }

    private static void nQueen(int[][] board, int sRow) {
        if(sRow == board.length){
            print(board);
            return;
        }
        for(int col=0;col<board[0].length;col++){
            if(isSafe(board,sRow,col)){
                board[sRow][col] = 1;
                nQueen(board,sRow+1);
                board[sRow][col] = 0;
            }
        }
    }

    private static boolean isSafe(int[][] board, int row, int col) {
        for(int i=row;i>=0;i--){
            if(board[i][col] == 1) return false;
        }

        for(int i=row,j=col;i>=0 && j>=0; i--,j--){
            if(board[i][j] == 1) return false;
        }

        for(int i=row,j=col;i>=0 && j<board[0].length; i--,j++){
            if(board[i][j] == 1) return false;
        }

        return true;
    }

    private static void print(int[][] board) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j] == 1){
                    System.out.print("Q ");
                }else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        System.out.println("\n\n");
    }
}

