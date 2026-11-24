package lecture.chapter6;

public class Animal {

  private String name;
  private float weight;
  private float height;


  public Animal(String name, float weight, float height) {
    setName(name);
    setHeight(height);
    setWeight(weight);
  }

  public void breathe() {
    System.out.println("Das Tier " + name + " atmet!");
  }

  public void eat(){
    System.out.println("Das Tier " + name + " frisst!");
  }

  public void move(){
    System.out.println("Das Tier " + name + " bewegt sich!");
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public float getWeight() {
    return weight;
  }

  public void setWeight(float weight) {
    this.weight = weight;
  }

  public float getHeight() {
    return height;
  }

  public void setHeight(float height) {
    this.height = height;
  }
}
