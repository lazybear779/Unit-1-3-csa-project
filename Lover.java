public class Lover {
  private String name;
  private int month;
  private int day;
  private String nametwo;
  private int monthtwo; 
  private int daytwo; 
  
  public Lover(String n, int m, int d) {
    name = n;
    month = m;
    day = d;
  }
  
  public Lover(String n, int m, int d, String n2, int m2, int d2) {
    name = n;
    month = m;
    day = d;
    nametwo = n2;
    monthtwo = m2;
    daytwo = d2;
  }
  
  public int getMonth() {
    return month;
  }
  
  public int getDay() {
    return day;
  }
  
  public String getNametwo() {
    return nametwo;
  }
  
  public int getMonthtwo() {
    return monthtwo;
  }
  
  public int getDaytwo() {
    return daytwo;
  }
  
  public String getName() {
  return name;
}

}




