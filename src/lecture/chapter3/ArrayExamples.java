package lecture.chapter3;

public class ArrayExamples {

  static void main(String[] args) {

    /*
    int lottoZahl1;
    int lottoZahl2;
    int lottoZahl3;
    int lottoZahl4;
    int lottoZahl5;
    int lottoZahl6;

    int lottoZusatzzahl;

     */

    int[] lottoZahlen = new int[7];

    lottoZahlen[0] = 6;
    lottoZahlen[1] = 14;

    System.out.println(lottoZahlen[0]);
    System.out.println(lottoZahlen[5]);

    System.out.println("Anzahl Felder in lottoZahlen: " + lottoZahlen.length);

    char[][] tictactoe = new char[3][3];

    tictactoe[1][1] = 'X';
    tictactoe[1][2] = 'O';
    tictactoe[0][0] = 'X';

    String[][][] book = new String[10][][];

    book[0] = new String[8][];

    book[0][0] = new String[7];

    book[0][0][0] = "Herzlich";
    book[0][0][1] = "Willkommen";
    book[0][0][2] = "bei";
    book[0][0][3] = "Java";
    book[0][0][4] = "ist";
    book[0][0][5] = "eine";
    book[0][0][6] = "Insel";

    book[0][1] = new String[3];
    book[0][1][0] = "Voll";
    book[0][1][1] = "doof";
    book[0][1][2] = "hier";


    byte[] luckyNumbers = {5, 16, 42, 67};

    System.out.println("Felder in luckyNumbers: " + luckyNumbers.length);

    String bibel[][][] = {{{"Am", "Anfang", "war", "Nichts"}, {"Gott", "sprach", "es", "werde", "hell"}}};

    System.out.println("Die Bibel hat " + bibel.length + " Kapitel");
    System.out.println("Das 1. Kapitel hat " + bibel[0].length + " Sätze");
    System.out.println("Der 1. Satz im 1. Kapitel hat " + bibel[0][0].length + " Wörter");


    // Call by value VS. Call by Reference

    byte myFavoritNumber = 4;
    byte yourFavoritNumber;

    // Primitive Datentypen --> Call by value
    yourFavoritNumber = myFavoritNumber;

    System.out.println("meine Lieblingszahl: " + myFavoritNumber);
    System.out.println("deine Lieblingszahl: " + yourFavoritNumber);

    myFavoritNumber = 7;

    System.out.println("meine Lieblingszahl: " + myFavoritNumber);
    System.out.println("deine Lieblingszahl: " + yourFavoritNumber);

    byte[] myPinCode = {4, 4, 4, 4};

    // komplexe Datentype / Referenz Datentypen -> Call by Reference
    byte[] yourPinCode = myPinCode;

    System.out.println("mein Pin Code: " + myPinCode[0] + myPinCode[1] +myPinCode[2] +myPinCode[3]);
    System.out.println("dein Pin Code: " + yourPinCode[0] + yourPinCode[1] +yourPinCode[2] +yourPinCode[3]);

    myPinCode[0] = 2;
    myPinCode[1] = 2;
    myPinCode[2] = 2;
    myPinCode[3] = 2;

    System.out.println("mein Pin Code: " + myPinCode[0] + myPinCode[1] +myPinCode[2] +myPinCode[3]);
    System.out.println("dein Pin Code: " + yourPinCode[0] + yourPinCode[1] +yourPinCode[2] +yourPinCode[3]);


    // Strings sind anders!

    String greeting = "Hello World!";
    String niceGreeting = greeting;

    System.out.println(greeting);
    System.out.println(niceGreeting);

    greeting = "Hello wonderfull World!";

    System.out.println(greeting);
    System.out.println(niceGreeting);


  }
}
