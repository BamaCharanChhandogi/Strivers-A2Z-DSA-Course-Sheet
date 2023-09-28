package Recursion.Trying_out_all_Combos_Hard;

import java.util.*;

public class NQueens {
    /**
     * The function checks if it is safe to place a queen at a given position on a chessboard.
     * 
     * @param row The row index of the current position on the chessboard.
     * @param col The column index of the current position on the chessboard.
     * @param board The board is a 2-dimensional char array representing the chessboard. Each cell of
     * the array represents a square on the chessboard. The value 'Q' represents a queen placed on that
     * square, and any other value represents an empty square. The size of the board is determined by
     * the length of
     * @return The method is returning a boolean value.
     */
    public static boolean isSafe(int row, int col, char[][] board) {

        for(int j=0; j<board.length; j++) {
            if(board[row][j] == 'Q') {
                return false;
            }
        }

        for(int i=0; i<board.length; i++) {
            if(board[i][col] == 'Q') {
                return false;
            }
        }

        int r = row;
        for(int c=col; c>=0 && r>=0; c--, r--) {
            if(board[r][c] == 'Q') {
                return false;
            }
        }
       
        r = row;
        for(int c=col; c<board.length && r>=0; r--, c++) {
            if(board[r][c] == 'Q') {
                return false;
            }
        }
    
        r = row;
        for(int c=col; c>=0 && r<board.length; r++, c--) {
            if(board[r][c] == 'Q') {
                return false;
            }
        }
       
        for(int c=col; c<board.length && r<board.length; c++, r++) {
            if(board[r][c] == 'Q') {
                return false;
            }
        }
       
        return true;
    }
    // 
    /**
     * The function "SaveBoard" takes a 2D character array representing a chessboard and a list of
     * lists of strings as parameters, and converts the chessboard into a list of strings representing
     * the positions of the queens on the board, which is then added to the result list.
     * 
     * @param board A 2D character array representing a chessboard. Each element in the array
     * represents a cell on the board, and the character 'Q' represents a queen placed on that cell.
     * @param result The "result" parameter is a List of Lists of Strings. It is used to store the
     * different configurations of the chessboard with queens placed on it. Each inner List represents
     * a single configuration, and each String in the inner List represents a row of the chessboard.
     * The character 'Q' represents
     */
    public static void SaveBoard(char board[][],List<List<String>> result){
        String str ="";
        List<String> resultList = new ArrayList<>();
        for(int i=0;i<board.length;i++){
            str="";
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='Q'){
                    str+="Q";
                }
                else{
                    str+=".";
                }
            }
            resultList.add(str);
        }
        result.add(resultList);
    }
    /**
     * The function solves the N-Queens problem by placing queens on a chessboard such that no two
     * queens threaten each other.
     * 
     * @param board The board parameter is a 2D character array representing the chessboard. Each cell
     * can have one of two values: 'Q' if there is a queen placed in that cell, or '.' if the cell is
     * empty.
     * @param result The "result" parameter is a List of Lists of Strings. It is used to store the
     * solutions to the N-Queens problem. Each solution is represented as a List of Strings, where each
     * String represents a row of the chessboard.
     * @param col The parameter "col" represents the current column that we are trying to place a queen
     * in. It starts from 0 and goes up to the length of the board.
     */
    public static void solveNqueen(char board[][],List<List<String>> result,int col){
        if(col==board.length){
            SaveBoard(board,result);
            return;
        }
        for(int row=0;row<board.length;row++){
            if(isSafe(row,col,board)){
                board[row][col] = 'Q';
                solveNqueen(board,result,col+1);
                board[row][col] = '.';
            }
        }
    }
    public static  List<List<String>> solveNQueens(int n) {
        char board[][]=new char[n][n];
        List<List<String>> result = new ArrayList<>();
        solveNqueen(board,result,0);
        return result;
    }
    public static void main(String[] args) {
        System.out.println(solveNQueens(4));
    }
}
