package lecture.chapter5;

public class RadiatorSprings {

  static void main(String[] args) throws InterruptedException {

    System.out.println("Anzahl an Autos in Radiator Springs: " + Car.getCarCount());

    Car lightningMcQueen = new Car(Car.COLOR_RED, "Kachow", 500, Car.Brands.CORVETTE);
    Car sally = new Car(Car.COLOR_BLUE, "301PCE", 350, Car.Brands.PORSCHE);
    Car hook = new Car(Car.COLOR_RUSTY, "A113", 9990, Car.Brands.HOOKER);
    Car randomCar = new Car();

    System.out.println("Anzahl an Autos in Radiator Springs: " + Car.getCarCount());

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
    System.out.println("Lightning McQueen - Marke: " + lightningMcQueen.BRAND + " Preisklasse: " + lightningMcQueen.BRAND.getPriceClass());
    System.out.println("Lightning McQueen - Leistung: " + lightningMcQueen.getHp());
    System.out.println("Lightning McQueen - Nummernschild: " + lightningMcQueen.getLicensePlate());

    /*
    sally.color = "Blau";
    sally.brand = "Porsche";
    sally.hp = 320;
    sally.licensePlate = "301PCE";

     */

    sally.accelerate(90);
    sally.setColor(Car.COLOR_RED);

    System.out.println("Sally - Farbe: " + sally.getColor());
    System.out.println("Sally - Marke: " + sally.BRAND + " Preisklasse: " + sally.BRAND.getPriceClass());
    System.out.println("Sally - Leistung: " + sally.getHp());
    System.out.println("Sally - Nummernschild: " + sally.getLicensePlate());
    System.out.println("Sally - Geschwindigkeit: " + sally.getCurrentSpeed());

    System.out.println("Hook - Farbe: " + hook.getColor());
    System.out.println("Hook - Marke: " + hook.BRAND + " Preisklasse: " + hook.BRAND.getPriceClass());
    System.out.println("Hook - Leistung: " + hook.getHp());
    System.out.println("Hook - Nummernschild: " + hook.getLicensePlate());
    System.out.println("Hook - Geschwindigkeit: " + hook.getCurrentSpeed());


    Car sticker;

    // Call by Reference
    sticker = lightningMcQueen;

    sticker.setHp(75);

    System.out.println("Lightning McQueen - Leistung: " + lightningMcQueen.getHp());



    System.out.println("Anzahl an Autos in Radiator Springs: " + Car.getCarCount());

    new Car();
    new Car();
    new Car();
    new Car();
    new Car();
    new Car();
    new Car();
    new Car();

    System.gc();

    Thread.sleep(500);

    System.out.println("Anzahl an Autos in Radiator Springs: " + Car.getCarCount());

    sally = null;
    lightningMcQueen = null;
    hook = null;

    System.gc();
    Thread.sleep(500);

    System.out.println("Anzahl an Autos in Radiator Springs: " + Car.getCarCount());
  }
}
