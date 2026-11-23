package lecture.chapter5;

public class Student {

  private String name;
  private int id;

  public Student(String name, int id) {
    this.name = name;
    this.id = id;
  }

  public void drink(double amount){
    System.out.println(name + " trinkt " + amount + "l");
  }

  public void drink(double amount, float alcoholPercentage){
    drink(amount);
    System.out.println("- und wird " + ((alcoholPercentage > 5.0) ? "schnell" : "langsam") + " betrunken");
  }

  public void drink(double amount, int coffeinInMg){
    drink(amount);
    System.out.println("- und wird " + ((coffeinInMg > 150) ? "schnell" : "langsam") + " wach");
  }

  public void drink(double amount, float alcoholPercentage, int coffeinInMg){
    // TODO
  }




}
