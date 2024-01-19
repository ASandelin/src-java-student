package schoolwork_2023.Lab;

import java.util.ArrayList;


public class Player {
  String name;
  public Die tarning;
  int points, dieValue;
  ArrayList<Die> diceList = new ArrayList<>();
    
  public Player(String name, int numberOfSides) {
    this.name = name;
    tarning = new Die(numberOfSides);
    diceList.add(tarning);
  }
  public Player(String name) {
    this(name, 6);
  }

// Getter
  public String getName() {
    return name;
  }
  public int getPoints() {
    return points;
  }        
  public int getDieValue(){
    dieValue = tarning.getValue();
    return dieValue;
  }
// Setter
  public void increaseScore(){
    points++;
  }
// Adds die 
  public void addDie(){
    System.out.print("Hur manga sidor ska tarningen ha: ");
    int nyTarning = DiceGame.scanner.nextInt();
    diceList.add(new Die(nyTarning));
  }
// Translate hashcode      
  @Override
  public String toString() {
    return "Player{" +"namn=" + name + ", poang=" + points +", tarning= " + diceList +'}';
  }  
}
