package lecture.chapter3;

public class DatatypeConversion {

  public static void main(String[] args) {

    char singleChar = 'a';

    int numberA;

    // Implizite Konvertierung
    // char -> int
    numberA = singleChar;

    System.out.println(singleChar);
    System.out.println(numberA);


    // int -> double
    double numberB = numberA;
    System.out.println(numberB);

    // Explizites Type Casting
    // double -> int
    numberB = 97.6;
    System.out.println(numberB);
    int numberC = (int) numberB;
    System.out.println(numberC);


    numberB = 1234567890.0e-10;
    System.out.println(numberB);
    float numberD = (float) numberB;
    System.out.println(numberD);


    numberC = -129;
    byte numberE = (byte) numberC;
    System.out.println(numberC);
    System.out.println(numberE);
  }
}
