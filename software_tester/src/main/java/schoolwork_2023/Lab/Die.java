package schoolwork_2023.Lab;
import java.util.Random;

public class Die {
  private int value;
  private int numberOfSides;
  private Random slumpgenerator = new Random();
    
  public Die(int numberOfSides) {
    this.numberOfSides = numberOfSides;
  } 
// Getters
  public int getNumberOfSides() {
    return numberOfSides;
  }
  public int getValue() {
    return value;
  }
// Randomizer method 
  public void roll(){
    value = slumpgenerator.nextInt(numberOfSides)+1;
  }
// Translate hashcode  
  @Override 
  public String toString() {
    return "Die{" + "antalSidor=" + numberOfSides + ", varde=" + value +'}';
  } 
}
    
