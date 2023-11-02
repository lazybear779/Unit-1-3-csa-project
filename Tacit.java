import java.util.Scanner;

public class Tacit {
  private double t1;
  private double t2;
  private final double luck;
  private int finalResult;
  private int points; 
  
  public Tacit() {
    points = 0;
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Enter the first number: ");
    t1 = scanner.nextDouble();
    
    System.out.print("Enter the second number: ");
    t2 = scanner.nextDouble();
    
    
    luck = (int)(Math.random() * 10) + 1; 
    
    try {
      if (luck < 5) {
        finalResult = (int) t1 * (int) t2 % 2;
      } else {
        finalResult = (int) t1 / (int) t2 % 2;
      }
    } catch (ArithmeticException e) {
      System.out.println("An error occurred: Division by zero.");
      finalResult = -1; 
    }
    
    
    if (finalResult == 0) {
      System.out.println("You pass the test.\nPoints: " + points + " +1");
      points++;
    } else {
      if (finalResult != -1) {
        System.out.println("You fail the test.\nPoints: " + points + " -1");
        points--;
      }
    }
  }
  
  public double getT1() {
    return t1;
  }
  
  public double getT2() {
    return t2;
  }
  
  public double getLuck() {
    return luck;
  }
  
  public int getFinalResult() {
    return finalResult;
  }
  
  public int getPoints() {
    return points;
  }
 }






