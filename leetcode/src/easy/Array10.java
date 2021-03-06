package easy;

import java.util.HashSet;

public class Array10 {
	
	public static void main(String[] args) {

	}
	
    public boolean isValidSudoku(char[][] board) {
        
    	HashSet<Character> row = new HashSet<>();
    	HashSet<Character> column = new HashSet<>();
  
    	//가로세로체크
    	for(int i = 0 ; i < 9; i++) {
    		row.clear();
    		column.clear();
    		for(int j = 0 ; j < 9 ; j++) {
    			if(board[i][j] != '.') {
    				if(row.contains(board[i][j])) {
    					return false;
    				}
    				row.add(board[i][j]);
    			}
    			if(board[j][i] != '.') {
    				if(column.contains(board[j][i])) {
    					return false;
    				}
    				column.add(board[j][i]);
    			}
    		}
    	}
    	
    	//3*3체크
    	for(int i = 0 ; i < 9; i = i+3) {
    		for(int j = 0; j < 9; j = j+3) {
    			row.clear();
    			for(int k = 0 ; k < 3 ; k++) {
    				for(int g = 0 ; g < 3; g++) {
    					if(board[i+k][j+g] != '.') {
    						if(row.contains(board[i+k][j+g])) {
    							return false;
    						}
    						row.add(board[i+k][j+g]);
    					}
    				}
    			}
    		}
    	}
    	
    	
    	return true;
    }
    
}
