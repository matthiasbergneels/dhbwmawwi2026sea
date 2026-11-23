package lecture.chapter5;

public class Car {

  // Attribute
  private String color;
  private double currentSpeed;
  private String licensePlate;
  private int hp;
  public final String brand;


  // Konstruktor

  Car(){
    this.color = "Grün";
    setHp(120);
    this.licensePlate = "YYYYYY";
    this.brand = "FIAT";

    this.currentSpeed = 0;
  }

  Car(String color, String licensePlate, int hp, String brand){
    this.color = color;
    this.licensePlate = licensePlate;
    this.setHp(hp);
    this.brand = brand;

    this.currentSpeed = 0;
  }

  // Methoden
  void accelerate(double deltaSpeed){
    this.currentSpeed += deltaSpeed;
  }

  double brake(double deltaSpeed){
    if(deltaSpeed > currentSpeed){
      currentSpeed = 0;
    }else {
      currentSpeed -= deltaSpeed;
    }
    return currentSpeed;
  }

  void fullBrake(){
    currentSpeed = 0;
  }

  public String getColor() {
    return color;
  }

  public String getLicensePlate() {
    return licensePlate;
  }

  public int getHp() {
    return hp;
  }

  public double getCurrentSpeed() {
    return currentSpeed;
  }

  public void setHp(int hp) {
    // Validierung
    if(hp > 75 && hp < 600){
      this.hp = hp;
    } else {
      this.hp = 120;
    }
  }



}
