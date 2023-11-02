import java.util.Scanner;

public class Zodiac {
  private Lover lover1;
  private Lover lover2;
  
  public Zodiac() {
    askInfo();
    reportSign();
  }
  
  public void askInfo() {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("What is your name");
    String name = scanner.nextLine();
    System.out.println("In what month were you born? (January = 1, December = 12, etc.)");
    int month = scanner.nextInt();
    System.out.println("On what day were you born?");
    int day = scanner.nextInt();
    
    System.out.println("What is your lover's name");
    scanner.nextLine();
    String name2 = scanner.nextLine();
    System.out.println("In what month was your lover born?");
    int month2 = scanner.nextInt();
    System.out.println("On which day was your lover born?");
    int day2 = scanner.nextInt();
    
    lover1 = new Lover(name, month, day, name2, month2, day2);
    lover2 = new Lover(name2, month2, day2, name, month, day);
  }
  
  public void reportSign() {
    String userSign = getSign(lover1);
    String loverSign = getSign(lover2);
    
    System.out.println("Your zodiac sign is: " + userSign);
    System.out.println("Your lover's zodiac sign is: " + loverSign);
  }
  
  public String getUserSign() {
    return getSign(lover1);
  }
  
  public String getLoverSign() {
    return getSign(lover2);
  }
  
  public String getSign(Lover lover) {
    int month = lover.getMonth();
    int day = lover.getDay();
    
    if (day > 31) {
      return "Stop trolling";
    } else if ((month == 12 && day >= 22) || (month == 1 && day <= 19)) {
      return "Capricorn";
    } else if ((month == 1 && day >= 20) || (month == 2 && day <= 18)) {
      return "Aquarius";
    } else if ((month == 2 && day >= 19) || (month == 3 && day <= 20)) {
      return "Pisces";
    } else if ((month == 3 && day >= 21) || (month == 4 && day <= 19)) {
      return "Aries";
    } else if ((month == 4 && day >= 20) || (month == 5 && day <= 20)) {
      return "Taurus";
    } else if ((month == 5 && day >= 21) || (month == 6 && day <= 20)) {
      return "Gemini";
    } else if ((month == 6 && day >= 21) || (month == 7 && day <= 22)) {
      return "Cancer";
    } else if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) {
      return "Leo";
    } else if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) {
      return "Virgo";
    } else if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) {
      return "Libra";
    } else if ((month == 10 && day >= 23) || (month == 11 && day <= 21)) {
      return "Scorpio";
    } else if ((month == 11 && day >= 22) || (month == 12 && day <= 21)) {
      return "Sagittarius";
    }
    return "Sign not found";
  }
}


