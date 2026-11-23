package lecture.chapter5;

public class Car {

  // Klassen-Attribute
  private static int carCount;

  public static final String COLOR_RED = "Rot";
  public static final String COLOR_GREEN = "Grün";
  public static final String COLOR_BLUE = "Blau";
  public static final String COLOR_RUSTY = "Rusty Braun";
  public static final String COLOR_BLACK_DEFAULT = "Schwarz";

  // (Instanz-) Attribute
  private String color;
  private double currentSpeed;
  private String licensePlate;
  private int hp;
  public final Brands BRAND;

  enum Brands {
    CORVETTE("$$$"),
    PORSCHE("$$$"),
    HOOKER("$$$$"),
    FIAT("$");

    // Attribut
    private String priceClass;

    // Konstruktor
    private Brands(String priceClass){
      this.priceClass = priceClass;
    }

    // Getter
    public String getPriceClass(){
      return priceClass;
    }

  }

  // Konstruktor

  Car(){
    this.color = "Grün";
    setHp(120);
    this.licensePlate = "YYYYYY";
    this.BRAND = Brands.FIAT;

    this.currentSpeed = 0;
    carCount++;
  }

  Car(String color, String licensePlate, int hp, Brands brand){
    this.color = color;
    this.licensePlate = licensePlate;
    this.setHp(hp);
    this.BRAND = brand;

    this.currentSpeed = 0;
    carCount++;
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

  public void setColor(String color) {
    if(color.equals(COLOR_RED) || color.equals(COLOR_BLUE) || color.equals(COLOR_RUSTY) || color.equals(COLOR_BLACK_DEFAULT)){
      this.color = color;
    } else {
      if(this.color == null){
        this.color = COLOR_BLACK_DEFAULT;
      }
    }

  }

  public void setLicensePlate(String licensePlate) {
    this.licensePlate = licensePlate;
  }

  protected void finalize(){
    System.out.println("Auto von der Marke " + this.BRAND + " wird verschrottet");
    carCount--;
  }

  // Klassen-Methode
  public static int getCarCount() {
    return carCount;
  }





}
