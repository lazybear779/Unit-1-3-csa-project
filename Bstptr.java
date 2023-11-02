import java.util.Scanner;

public class Bstptr {

  
  public static String zodiacPersonality(String sign) {
    if (sign.equalsIgnoreCase("Capricorn")) {
      return "overachiever, persistent, practical, and sensitive person";
    } else if (sign.equalsIgnoreCase("Aquarius")) {
      return "highly intellectual and creative person";
    } else if (sign.equalsIgnoreCase("Pisces")) {
      return "generous, artistic, and romantic person";
    } else if (sign.equalsIgnoreCase("Aries")) {
      return "confident, impulsive, passionate person";
    } else if (sign.equalsIgnoreCase("Taurus")) {
      return "stubborn and sensual person";
    } else if (sign.equalsIgnoreCase("Gemini")) {
      return "playful and intellectually curious person";
    } else if (sign.equalsIgnoreCase("Cancer")) {
      return "emotional, nurturing, and highly intuitive person";
    } else if (sign.equalsIgnoreCase("Leo")) {
      return "protective, ambitious, loyal person";
    } else if (sign.equalsIgnoreCase("Virgo")) {
      return "logical, practical, and systematic person";
    } else if (sign.equalsIgnoreCase("Libra")) {
      return "extroverted, cozy, and friendly person";
    } else if (sign.equalsIgnoreCase("Scorpio")) {
      return "loyal, smart, shrewd, and stoic person";
    } else if (sign.equalsIgnoreCase("Sagittarius")) {
      return "optimistic, honest, and energetic person";
    }
    return "Sign not found";
  }
}
