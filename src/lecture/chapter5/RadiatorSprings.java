package lecture.chapter5;

public class RadiatorSprings {

  static void main(String[] args) {

    Car lightningMcQueen = new Car("Rot", "Kachow", 500, "Corvette");
    Car sally = new Car("Blau", "301PCE", 350, "Porsche");
    Car hook = new Car("Rusty Braun", "A113", 290, "Hooker");

    System.out.println("Aktuelle Geschwindigkeit - Lightning McQueen: " + lightningMcQueen.currentSpeed);

    lightningMcQueen.accelerate(50);
    lightningMcQueen.accelerate(50);
    lightningMcQueen.accelerate(50);
    lightningMcQueen.brake(75);

    System.out.println("Aktuelle Geschwindigkeit - Lightning McQueen: " + lightningMcQueen.currentSpeed);

    lightningMcQueen.color = "Rot";
    lightningMcQueen.brand = "Corvette";
    lightningMcQueen.hp = 500;
    lightningMcQueen.licensePlate = "Cachaw";


    System.out.println("Lightning McQueen - Farbe: " + lightningMcQueen.color);
    System.out.println("Lightning McQueen - Marke: " + lightningMcQueen.brand);
    System.out.println("Lightning McQueen - Leistung: " + lightningMcQueen.hp);
    System.out.println("Lightning McQueen - Nummernschild: " + lightningMcQueen.licensePlate);

    sally.color = "Blau";
    sally.brand = "Porsche";
    sally.hp = 320;
    sally.licensePlate = "301PCE";

    sally.accelerate(90);

    System.out.println("Sally - Farbe: " + sally.color);
    System.out.println("Sally - Marke: " + sally.brand);
    System.out.println("Sally - Leistung: " + sally.hp);
    System.out.println("Sally - Nummernschild: " + sally.licensePlate);
    System.out.println("Sally - Geschwindigkeit: " + sally.currentSpeed);




  }
}
