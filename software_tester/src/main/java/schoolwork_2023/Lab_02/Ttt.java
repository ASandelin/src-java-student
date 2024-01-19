package schoolwork_2023.Lab_02;

import java.util.ArrayList;
import java.util.Scanner;




public class Ttt {
    int numberOfColumnAndRow ;
    int numbersInARow;
    Scanner scanner = new Scanner(System.in);
    ArrayList<ArrayList<Integer>> x = new ArrayList<ArrayList<Integer>>();
    int counter0;
    int counterX;
    
  public void createBoard(){
    System.out.print("Hur manga columner/rader: ");
    numberOfColumnAndRow = scanner.nextInt();
    
    for(int i=0 ; i <numberOfColumnAndRow ; i++ ){
            x.add(new ArrayList<Integer>());
    }
     for(int row=0 ; row <numberOfColumnAndRow ; row++ ){
        for(int column=0 ; column < numberOfColumnAndRow; column++ ){
                x.get(row).add(column,-1);
        }
    }
//System.out.println(x);

}
  public void howManyInARow(){
    System.out.print("Hur manga i rad: ");
    numbersInARow = scanner.nextInt();

}
public void countNumbInARow(){
    // Hur ska jag göra så den bara får poäng ifall de är i följd, nu får man poäng oavsett var x/o är på spelbrädan så länge mängden är lika how many in row
    // kolla hur minröjare controllera nummer.
    //Check vertically
    for(int column=0; column < numberOfColumnAndRow ; column++ ){          
        for(int row=0 ; row <numberOfColumnAndRow ; row++ ){
            if (x.get(row).get(column)== -1){
                continue;
            }
            else if(x.get(row).get(column)==0){
                counter0++;
                for (int k = 1; k < numberOfColumnAndRow; k++) {
                    if(x.get(row+k).get(column)==0){
                        counter0++;
                        continue;
                    }
                    else if (x.get(row+k).get(column)!=0) {
                        counter0 =0;
                        break;
                    } 
                }
            
            }else if(x.get(row).get(column)==1){
                counterX++;
                continue;
            }
        }
    }
/*     if (counter0 == numbersInARow) {
        System.out.println("player 0 won ");
    } else if (counterX == numbersInARow) {
        System.out.println("player X won ");
    }  */
    //counter0=0;
    //counterX=0;

    // Check horizontally
/*       for(int row=0; row < numberOfColumnAndRow ; row++ ){          
        for(int column=0 ; column <numberOfColumnAndRow ; column++ ){
            if(x.get(row).get(column)==0){
                counter0++;   
            }else if(x.get(row).get(column)==1){
                counterX++; 
            }
        }
    }  */
    if (counter0 == numbersInARow) {
        System.out.println("player 0 won ");
    } else if (counterX == numbersInARow) {
        System.out.println("player X won ");
    } 
    counter0=0;
    counterX=0;
    // Check diagonally 
}

 public void showBoard(){
        System.out.print("  ");
    for (int i = 0; i < numberOfColumnAndRow; i++) {
         if (i < 10) {
            System.out.print("   "+(i));
        }
        else if (i >=10) {
            System.out.print("  "+i);
        }
        //System.out.print("   "+i);
    }
    System.out.println("");
    System.out.print("   -");
    for (int j = 0; j <numberOfColumnAndRow; j++)  {
        System.out.print("----");
        
    }
    System.out.println("");
    
 
    for(int row=0 ; row < numberOfColumnAndRow ; row++ ){
         if (row < 10) {
            System.out.print(" "+(row)+" |");
        } else if (row >=10) {
            System.out.print((row)+" |");
        }
        for(int column=0 ; column <numberOfColumnAndRow ; column++ ){
            if(x.get(row).get(column)==-1){
                System.out.print(" ~ |");
                
            }else if(x.get(row).get(column)==0){
                System.out.print(" O |");
                
            }else if(x.get(row).get(column)==1){
                System.out.print(" X |");
                
            }
      
        }
        System.out.println();
        System.out.print("   +");
        for (int j = 0; j <numberOfColumnAndRow; j++)  {
        System.out.print("---+");
        }
        System.out.println();
    }
} 
public void test(){
     
     x.get(0).add(0,0);
     x.get(0).add(1,0);
    // x.get(0).add(2,0);

     x.get(1).add(4,1);
     x.get(3).add(4,1);
     x.get(4).add(4,1);
      //x.get(2).add(2,1);
}
public static void main(String[] args) {
    Ttt play = new Ttt();
        play.createBoard();
        play.showBoard();
        play.howManyInARow();
        //play.createBoard();
        play.test();
        play.countNumbInARow();

        play.showBoard();
}

}




