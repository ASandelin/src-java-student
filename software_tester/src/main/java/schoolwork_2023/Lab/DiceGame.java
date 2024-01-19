package schoolwork_2023.Lab;

import java.util.ArrayList;
import java.util.Scanner;

public class DiceGame  {
  static Scanner scanner = new Scanner(System.in);
  int omgangar, antalSidor;
  String namn;
  Player newUser;
  ArrayList<Player> playerList = new ArrayList<>();
    
  public static void main(String[] args) {  
    DiceGame play = new DiceGame();
    
    play.startMenu();
    play.gameLogic();
    play.test();
  }
//  Menu
  public void startMenu(){
    
    System.out.print("Hur manga omgangar: ");
    omgangar = scanner.nextInt();
    
    System.out.print("Hur manga sidor ska tarningen ha: ");
    antalSidor = scanner.nextInt();
    
    System.out.print("Ditt namn: ");
    namn = scanner.next();
    
    newUser = new Player(namn, antalSidor);
    playerList.add(newUser);
  }
//  Logic
  public void gameLogic(){
    
    while (omgangar!=0) {
      System.out.print("Gissa vardet: ");
      int guessedValue = scanner.nextInt();
      
      newUser.tarning.roll();
      System.out.print("tarningskast: "+ newUser.tarning.getValue() +"\n");
      
      if (guessedValue==newUser.tarning.getValue()) {
        newUser.increaseScore();
      } 
      --omgangar;
    }   
  }
// Listprinter
  public void printPlayerList() {
    for (Player player : playerList) {
      System.out.println(player);
    }
  }
// TEST  
  private void test() {
    System.out.println(newUser.getName());
    System.out.println(newUser.getPoints());
    System.out.println(newUser.tarning.getNumberOfSides());
    System.out.println(newUser.getDieValue());
  
    //playerList.add(new Player("Sven", 12));
    //newUser.addDie();
    
    printPlayerList();
  
  }
}

