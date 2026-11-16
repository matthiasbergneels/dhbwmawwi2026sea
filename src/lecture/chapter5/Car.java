package lecture.chapter5;

public class Car {

  // Attribute
  String color;
  double currentSpeed;
  String licensePlate;
  int hp;
  String brand;


  // Konstruktor
  Car(String color, String licensePlate, int hp, String brand){
    color = color;
    licensePlate = licensePlate;
    hp = hp;
    brand = brand;

    currentSpeed = 0;
  }

  // Methoden
  void accelerate(double deltaSpeed){
    currentSpeed += deltaSpeed;
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



}
