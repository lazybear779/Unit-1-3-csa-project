import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.println("Welcome to break up master, the purpose of this program is to test whether or not you should break up with your recent lover");
    Zodiac zodiac = new Zodiac();
    Bstptr bstptr = new Bstptr(); 
    
    String userSign = zodiac.getUserSign();
    String loverSign = zodiac.getLoverSign();
    
    String userPersonality = bstptr.zodiacPersonality(userSign); 
    String loverPersonality = bstptr.zodiacPersonality(loverSign); 
    System.out.println("");
      System.out.println("Your personality: " + userPersonality);
    System.out.println("");
      System.out.println("Your lover's personality: " + loverPersonality);
    System.out.println("");
      System.out.println("In astrology, a sign of the zodiac refers to one of 12 specific constellations of the zodiac that the sun passes through. A person's particular sign of the zodiac is the one that the sun was in when they were born. It is a belief in astrology that a person's personality can be predicted using their sign of the zodiac.");
    System.out.println("");
      System.out.println("");
      
     
     ZodiacCompatibility.checkCompatibility(userSign, loverSign);
     System.out.println("Now is the second part of test, which is to test you guy's tacits");
    
    System.out.print("Do you want to start the Tacit test? (yes/no): ");
    Scanner choic = new Scanner(System.in);
    String choice = choic.nextLine();
    
    if (choice.equalsIgnoreCase("yes")) {
      Tacit tacit = new Tacit();
      
      double number1 = tacit.getT1();
      double number2 = tacit.getT2();
      double luck = tacit.getLuck();
      int finalResult = tacit.getFinalResult();
      int points = tacit.getPoints();
      
      System.out.println("You entered the first number: " + number1);
      System.out.println("You entered the second number: " + number2);
      System.out.println("Luck value: " + luck);
      
      if (finalResult != -1) {
        System.out.println("Total Points: " + points);
        if (points < 1){
          System.out.println("Don't let a program define your love");
        }else{
          System.out.println("Congraduation, Your love pass the test");
        }
      } else {
        System.out.println("You chose not to start the Tacit test.");
  }
}
}
}



