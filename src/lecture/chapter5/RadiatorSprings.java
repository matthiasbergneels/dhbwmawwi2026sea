package lecture.chapter5;

public class RadiatorSprings {

  static void main(String[] args) {

    Car lightningMcQueen = new Car("Rot", "Kachow", 500, "Corvette");
    Car sally = new Car("Blau", "301PCE", 350, "Porsche");
    Car hook = new Car("Rusty Braun", "A113", 9990, "Hooker");
    Car randomCar = new Car();

    //System.out.println("Aktuelle Geschwindigkeit - Lightning McQueen: " + lightningMcQueen.currentSpeed);

    lightningMcQueen.accelerate(50);
    lightningMcQueen.accelerate(50);
    lightningMcQueen.accelerate(50);
    lightningMcQueen.brake(75);

    System.out.println("Aktuelle Geschwindigkeit - Lightning McQueen: " + lightningMcQueen.getCurrentSpeed());

    /*
    lightningMcQueen.color = "schlüpfer-lila";
    lightningMcQueen.brand = "Corvette";
    lightningMcQueen.hp = 5;
    lightningMcQueen.licensePlate = "Cachaw";
    lightningMcQueen.currentSpeed = -350000;
     */


    System.out.println("Lightning McQueen - Farbe: " + lightningMcQueen.getColor());
    System.out.println("Lightning McQueen - Marke: " + lightningMcQueen.brand);
    System.out.println("Lightning McQueen - Leistung: " + lightningMcQueen.getHp());
    System.out.println("Lightning McQueen - Nummernschild: " + lightningMcQueen.getLicensePlate());

    /*
    sally.color = "Blau";
    sally.brand = "Porsche";
    sally.hp = 320;
    sally.licensePlate = "301PCE";

     */

    sally.accelerate(90);

    System.out.println("Sally - Farbe: " + sally.getColor());
    System.out.println("Sally - Marke: " + sally.brand);
    System.out.println("Sally - Leistung: " + sally.getHp());
    System.out.println("Sally - Nummernschild: " + sally.getLicensePlate());
    System.out.println("Sally - Geschwindigkeit: " + sally.getCurrentSpeed());

    System.out.println("Hook - Farbe: " + hook.getColor());
    System.out.println("Hook - Marke: " + hook.brand);
    System.out.println("Hook - Leistung: " + hook.getHp());
    System.out.println("Hook - Nummernschild: " + hook.getLicensePlate());
    System.out.println("Hook - Geschwindigkeit: " + hook.getCurrentSpeed());


    Car sticker;

    // Call by Reference
    sticker = lightningMcQueen;

    sticker.setHp(75);

    System.out.println("Lightning McQueen - Leistung: " + lightningMcQueen.getHp());


  }
}
