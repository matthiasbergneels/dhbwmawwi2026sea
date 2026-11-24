package lecture.chapter6;

public class Dog extends Animal {

  private String breed;

  public Dog(String name, float weight, float height, String breed) {
    super(name, weight, height);

    this.breed = breed;
  }

  public void bark(){
    System.out.println("Der Hund " + this.getName() + " bellt! *wuff*");
  }

  public String getBreed() {
    return breed;
  }

  public void setBreed(String breed) {
    this.breed = breed;
  }
}
