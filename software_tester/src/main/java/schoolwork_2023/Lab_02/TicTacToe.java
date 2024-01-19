package schoolwork_2023.Lab_02;

import java.util.Scanner;

public class TicTacToe {
    
    int numberOfColumnAndRow ;
    Scanner scanner = new Scanner(System.in);
    int varv =0;

  public void createBoard(){
    System.out.print("Hur manga columner/rader: ");
    numberOfColumnAndRow = scanner.nextInt();
    
    int [][] gameBoard = new int[numberOfColumnAndRow][numberOfColumnAndRow];


    for(int row=0 ; row <numberOfColumnAndRow ; row++ )
        for(int column=0 ; column < numberOfColumnAndRow; column++ )
            gameBoard[row][column]=-1;


 showBoard(gameBoard);

}

public void showBoard(int[][]gameBoard){
        System.out.print(" ");
    for (int i = 0; i < numberOfColumnAndRow; i++) {
        System.out.print("   "+i);
    }
    System.out.println("");
    System.out.print("  -");
    for (int j = 0; j <numberOfColumnAndRow; j++)  {
        System.out.print("----");
        
    }
    System.out.println("");
    
    gameBoard[0][0]= 0;
    gameBoard[2][2]= 1;
    for(int row=0 ; row < numberOfColumnAndRow ; row++ ){
        System.out.print((row)+" |");
        for(int column=0 ; column <numberOfColumnAndRow ; column++ ){
            if(gameBoard[row][column]==-1){
                System.out.print(" ~ |");
                
            }else if(gameBoard[row][column]==0){
                System.out.print(" O |");
                
            }else if(gameBoard[row][column]==1){
                System.out.print(" X |");
                
            }
      
        }
        System.out.println();
        System.out.print("  +");
        for (int j = 0; j <numberOfColumnAndRow; j++)  {
        System.out.print("---+");
        }
        System.out.println();
    }
}
public static void main(String[] args) {
    TicTacToe play = new TicTacToe();
        play.createBoard();
        
        play.createBoard();
     
    
}

}


